<?php
// A sessão será usada para verificar se o usuário está logado
session_start();
// Inicia a sessão so usuario
// Verifica se o usuário está logado
if (!isset($_SESSION['usuario_id'])) {
    header("Location: index.html");
    exit();
}
// Ali em location manda para a index.html porem não pode uasr html use .php

echo "<h1>Bem-vindo ao Dashboard, " . $_SESSION['usuario_nome'] . "!</h1>";
echo "<p>Você está logado com sucesso.</p>";
echo "<a href='logout.php'>Sair</a>";
?>
