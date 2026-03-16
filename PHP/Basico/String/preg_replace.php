<?php
$frase = "Meu telefone é 1234-5678";
$nova = preg_replace("/[0-9-]+/", "XXXX", $frase);

echo $nova;
// Saída: Meu telefone é XXXX
?>
