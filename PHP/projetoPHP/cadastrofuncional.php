<?php
// Conexão com o banco de dados
include('conex.php'); // Verifique se o arquivo conex.php está configurado corretamente

// Verifica se o formulário foi enviado
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Recebe os dados do formulário
    $nome = $_POST['nome'];
    $sobrenome = $_POST['sobrenome'];
    $email = $_POST['email'];
    $senha = $_POST['senha'];  // Senha sem hash
    $telefone = $_POST['telefone'];
    $usuario = $_POST['usuario'];
    //senha aqui sem hash, verificar cuidado.
    // Prepara a consulta SQL para inserir os dados no banco
    //Cuidar com SQL injection
    $stmt = $conn->prepare("INSERT INTO usuarios (nome, sobrenome, email, senha, telefone, usuario) VALUES (?, ?, ?, ?, ?, ?)");
    $stmt->bind_param("ssssss", $nome, $sobrenome, $email, $senha, $telefone, $usuario);

    // Executa a consulta
    if ($stmt->execute()) {
        echo "Cadastro realizado com sucesso!";
    } else {
        echo "Erro ao cadastrar usuário: " . $stmt->error;
    }
}
?>
