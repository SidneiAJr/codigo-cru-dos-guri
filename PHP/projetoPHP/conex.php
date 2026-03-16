<?php
// conex.php (arquivo de conexão)

$host = 'localhost';      // Endereço do servidor do banco de dados (localhost ou IP do servidor)
$usuario = 'root';        // Usuário do MySQL
$senha = '';              // Senha do MySQL
$banco = 'cadastro';      // Nome do banco de dados
//Muito cuidado aqui não deixar root sem senha so se for localhost sem problema algum, verificar como conectar no banco.

// Criando a conexão
$conn = new mysqli($host, $usuario, $senha, $banco);

// Verificando se há erro na conexão
if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}
?>
