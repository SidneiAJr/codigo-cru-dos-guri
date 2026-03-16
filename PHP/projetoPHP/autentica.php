<?php
//Recebe Variavel de Login//
$user=$_POST['f_nome'];
$senha=$_POST['f_senha'];

//Conecta no Banco//
$sql="SELECT* FROM tb_cadastro WHERE username='$user' AND senha=$'senha'";
$res=mysqli_query($con,$sql);
$linha=mysqli_affected_rows($con);

//Verifica se linhas afetadas são Menores que 0, se estiver errado fecha a conexão.//
if($linhas>0){
}else{
echo "Erro no login"</br>;
echo "<a href='login.php>Voltar</a>";
}

mysqli_close($con);

?>
