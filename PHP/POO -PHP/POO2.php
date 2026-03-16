<?php
class InfoPersonagem{
    private $vida;
    private $armadura;
    private $dano ;
    private $velataque;
    
    public function __construct(){
        $this->vida = 5;
        $this->armadura=2.5;
        $this->dano=1.5;
        $this->velataque=0.75;
    }
    public function getStatus() {
        return [
            'vida' => $this->vida,
            'armadura' => $this->armadura,
            'dano' => $this->dano,
            'velAtaque' => $this->velataque
        ];
    }
}

$personagem = new InfoPersonagem();
print_r($personagem->getStatus());


?>
