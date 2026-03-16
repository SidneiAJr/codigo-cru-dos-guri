<?php 
$opcao = (int)readline("Selecione uma opcao 1-Cadastrar\n 2-Listar 3-Somar nota\n ");
switch ($opcao) {
    case '1':
    cadAluno();
        break;
    case '2':
        break;
    case '3':
    notas(); 
        break;
    default:
       print("Opcao Invalida!");
        break;
}

function notas(): void
{
    $resultado = $num1+$num2+$num3;
    $num1 = (int)readline("Insira um numero: ");
    $num2 = (int)readline("Insira um numero: ");
    $num3 = (int)readline("Insira um numero: ");
    print "O valor é: $resultado\n";
	return;
}
function cadAluno(): void
{
	$nomealuno = readline("Por favor digite o Nome do Aluno:");
	print "O nome do aluno é: $nomealuno\n";
	return;
}
function listAluno():void{
}








?>
