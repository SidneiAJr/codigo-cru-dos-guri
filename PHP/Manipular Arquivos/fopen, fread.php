<?php
$arquivo = fopen("teste.txt", "r"); // "r" = read
$tamanho = filesize("teste.txt");
$conteudo = fread($arquivo, $tamanho);
fclose($arquivo);

echo $conteudo;
?>