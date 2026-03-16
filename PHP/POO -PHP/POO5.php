<?php
interface VerificarAnima{
    public function NomeAnimal();
    public function TipoAnimal();
    public function VerificaIdade();
}

abstract class Animal implements VerificarAnima{
    public function __construct(public string $NomeAnimal, public string $TipoAnimal,public int $idadeAnimal) {
        //$this->var = $var;
        $this->NomeAnimal = $NomeAnimal;
        $this->TipoAnimal = $TipoAnimal;
        $this->idadeAnimal = $idadeAnimal;
    }
}

class StatusAnimal extends Animal implements VerificarAnima{
    public function TipoAnimal(){
    if($this->TipoAnimal==="Gato"||$this->TipoAnimal==="cachoro"){
        echo "Aprovado"."\n";
     }else{
        echo "Recusado";
     }
    }
    public function NomeAnimal()
    {
         if($this->NomeAnimal==="Jubileu"||$this->NomeAnimal==="Prime"){
            echo "Aprovado"."\n";
         }else{
             echo "Recusado";
         }
    }
    public function VerificaIdade(){
        if($this->idadeAnimal<=10){
            echo "Cuidado Idade do Cachoro". $this->NomeAnimal."\n";
        }else{
            echo "Cuidado Idade do Cachoro". $this->NomeAnimal."\n";
        }
    }
     
}

$teste1 = new StatusAnimal("Jubileu","Gato",10);
$teste1->TipoAnimal();
$teste1->NomeAnimal();
$teste1->VerificaIdade();





?>
