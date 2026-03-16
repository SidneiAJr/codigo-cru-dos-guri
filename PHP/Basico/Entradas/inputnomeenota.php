<?php 

$nome = (string)readline("Por favor insira seu nome: ");
$nota1  = (int)readline("Insira a nota: ");
$nota2 = (int)readline("Insira a nota: ");
$nota3 = (int)readline("Insira a nota: ");

$resultado = ($nota1+$nota2+$nota3)/3;


echo "Bem vindo ao sistema $nome";
echo "O Valor de sua media é:$resultado\n";

?>
