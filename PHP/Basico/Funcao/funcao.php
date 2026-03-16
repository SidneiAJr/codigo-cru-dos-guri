<?php 

$num1 = (int)readline("Insira um numero: ");
$num2 = (int)readline("Insira um numero: ");
$resultado = $num1+$num2;

function cad($resultado): void
{
	print "O valor é: $resultado\n";
	return;
}

cad($resultado); 




?>
