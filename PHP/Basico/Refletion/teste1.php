<?php
class User {
    public string $nome;
    private int $idade;
    
    public function __construct(string $nome, int $idade) {
        $this->nome = $nome;
        $this->idade = $idade;
    }
    
    public function saudar(): string {
        return "Oi, sou " . $this->nome;
    }
}

$ref = new ReflectionClass('User');

// ver todos os metodos
print_r($ref->getMethods());

// ver todas as propriedades
print_r($ref->getProperties());

// ver se tem um metodo especifico
var_dump($ref->hasMethod('saudar')); // true