<?php

interface verificaStatus{
    public function status():void;
}

class Personagem implements verificaStatus{
    private string $nome;
    private float $poder; 

    public function __construct(string $nome, float $poder){
     $this->nome = $nome;
     $this->poder = $poder;
    }

    public function status():void{
        if($this->poder >=75.5){ 
            echo "{$this->nome} Ta potente";
        }else{
             echo "{$this->nome} fraco";
        }
    }
}

$p1 = new Personagem('Kalleo1\n', 80.0);
$p1->status(); 

$p2 = new Personagem('Kalleo2', 80.0);
$p2->status(); 
