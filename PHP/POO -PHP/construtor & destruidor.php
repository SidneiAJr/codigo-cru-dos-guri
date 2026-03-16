<?php
class Pessoa {
    public $nome;

    // Construtor
    public function __construct($nome) {
        $this->nome = $nome;
        echo "Criando pessoa: $this->nome <br>";
    }

    // Destrutor
    public function __destruct() {
        echo "Destruindo pessoa: $this->nome <br>";
    }
}

// Testando
$p1 = new Pessoa("Carlos");
$p2 = new Pessoa("Ana");

echo "Fim do script <br>";
