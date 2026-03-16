<?php 
$valorIni = $_POST["valorini"];
$tempo = $_POST["tempo"];
$juros = $_POST["juros"];
$divjuros = $juros/100;

$res=$valorIni*(1+$divjuros)**$tempo;

echo "<h3>O Valor No vencimento será R$".number_format($res,2,',','.')."</h3>";

if($tempo>=1){
     $ir = $res*0.175;
    echo "<h2>O Valor de IR será: R$".number_format($ir,2,',','.')."</h2>";
}else{
    $ir = $res*0.15;
    echo "<h2>O Valor de IR será: R$".number_format($ir,2,',','.')."</h2>";
}

?>
