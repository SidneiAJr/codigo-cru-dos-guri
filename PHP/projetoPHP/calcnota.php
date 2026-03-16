<?php 
$n1 = $_POST["n1"];
$n2 = $_POST["n2"];
$n3 = $_POST["n3"];
$nome = $_POST["nome"];
$sobrenome = $_POST["sobrenome"];


$res=($n1+$n2+$n3)/3;
echo "<h1>Ola ,$nome $sobrenome</h1>";
echo "<h4>Sua media é: $res</h4>";


if($res>=5){
  echo "Parabens foi Aprovado!";
}else{
   echo "Reprovado lamento";
}


?>
