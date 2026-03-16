<?php
// Defina um usuário e senha fixos para simplificação
$valid_username = "admin";
$valid_password = "senha123";

// Verifique se os dados foram enviados
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $username = $_POST['username'];
    $password = $_POST['password'];

    // Validação de usuário e senha
    if ($username === $valid_username && $password === $valid_password) {
        // Login bem-sucedido
        header("Location: info.php");  // Redireciona para a página do dashboard
        exit();
    } else {
        // Se as credenciais estiverem erradas
        echo "<p>Usuário ou senha incorretos. Tente novamente.</p>";
        echo "<p>Cadastre-se</p>";
    }
}
?>
