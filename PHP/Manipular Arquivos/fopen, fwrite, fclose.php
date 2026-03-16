<?php
$arquivo = fopen("teste.txt", "w"); // "w" = write
fwrite($arquivo, "Olá, mundo!\n");
fwrite($arquivo, "Mais uma linha...");
fclose($arquivo);
?>
