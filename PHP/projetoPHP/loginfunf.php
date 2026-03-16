<?php
include('conex.php'); // Conexão com o banco de dados
// Alterar o nome ali de conex para o arquivo que fora a conexção com o banco

// Verifica se o formulário foi enviado
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $usuario = $_POST['usuario'];
    $senha = $_POST['senha'];
//Variaveis recebidas pelo formulario com metodo post nunca usar GET pois passa pela URL

    // Prepara a consulta SQL para buscar o usuário no banco de dados
    $stmt = $conn->prepare("SELECT * FROM usuarios WHERE usuario = ?");
    $stmt->bind_param("s", $usuario);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($result->num_rows > 0) {
        $user = $result->fetch_assoc();
        
        // Verifica se a senha fornecida corresponde à senha armazenada no banco
        //em header ele vai redicionar para a pagina de "autenticação" que será enviada para a index.html, porem não usar html na index do sistema
        if ($senha == $user['senha']) {  // Comparação simples sem hash
            echo "Bem-vindo, " . $user['nome'];
            header("Location: info.php");
            exit();
        } else {
            echo "Senha incorreta.";
        }
    } else {
        echo "Usuário não encontrado.";
    }
}
?>
