<?php 
$qhoras = $_POST["qhoras"];
$salario = $_POST["salario"];
$tempo = $_POST['hdias'];

$tempotrab = $tempo *30;
$res = $salario/$qhoras;

echo "<h3>Em um mes Trabalhas: ".number_format($tempotrab)."</h3>";
echo "<h3>Por hora Ganhas R$: ".number_format($res,2,',','.')."</h3>";


?>
