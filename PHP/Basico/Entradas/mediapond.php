<?php 

$nota1  = (int)readline("Insira a nota1: ");
$nota2 = (int)readline("Insira a nota2: ");
$resultado = $nota1+$nota2;


echo "O Valor de sua media é:$resultado";

if ($resultado>5 ) { 
	echo "Aluno Aprovado!"; 
} else { 
	echo "Aluno Reprovado!"; 
} 

?>
