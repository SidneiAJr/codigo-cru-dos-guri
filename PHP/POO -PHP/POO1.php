<?php
class kalleo{
    public $vida;
    public $forca;
    public $armadura;
    public $level;
    public function  __construct(){
         $this->vida = 100;
        $this->forca = 2;
        $this->armadura = 2;
        $this->level = 0;
    }
}
class gabriela{
    public $vida;
    public $forca;
    public $armadura;
    public $level;
   public function  __construct(){
         $this->vida = 100;
        $this->forca = 2;
        $this->armadura = 2;
        $this->level = 0;
    }
}
class miguel2{
    public $vida;
    public $forca;
    public $armadura;
    public $level;
    public function  __construct(){
         $this->vida = 100;
        $this->forca = 2;
        $this->armadura = 2;
        $this->level = 0;
    }
}
class eu{
     public $vida;
    public $forca;
    public $armadura;
    public $level;
    public function  __construct(){
         $this->vida = 100;
        $this->forca = 2;
        $this->armadura = 2;
        $this->level = 0;
    }
}
class heroi{
    public $nomeHeroi;
    public $idade;
    public $personagem;
    public $level;
    
   public function __construct($nome, $idade, $personagem, $level) {
    $this->nomeHeroi = $nome;
    $this->idade = $idade;
    $this->personagem = $personagem;
    $this->level = $level;
}

    public function exibirStatus() {
        echo "Herói: {$this->nomeHeroi}\n";
        echo "Idade: {$this->idade}\n";
        echo "Vida: {$this->personagem->vida}\n";
        echo "Força: {$this->personagem->forca}\n";
        echo "Armadura: {$this->personagem->armadura}\n";
        echo "Level: {$this->personagem->level}\n";
        echo "==================================\n";
    }
}

// Criando personagens
$p1 = new Kalleo();
$p2 = new Gabriela();
$p3 = new Miguel2();
$p4 = new Eu();

// Criando heróis
$heroi1 = new Heroi("Kalleo", 20, $p1, $p1->level);
$heroi2 = new Heroi("Gabriela", 25, $p2, $p2->level);
$heroi3 = new Heroi("Miguel Prime", 20, $p3, $p3->level);
$heroi4 = new Heroi("Joao Bolão", 28, $p4, $p4->level);

// Exibindo status
$heroi1->exibirStatus();
$heroi2->exibirStatus();
$heroi3->exibirStatus();
$heroi4->exibirStatus();
?>
