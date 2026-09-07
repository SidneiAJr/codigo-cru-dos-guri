<?php

// TRAIT - codigo reutilizavel
trait Voavel {
    public function voar(): string {
        return $this->nome . " está voando!";
    }
    
    public function pousar(): string {
        return $this->nome . " pousou!";
    }
}

trait Nadavel {
    public function nadar(): string {
        return $this->nome . " está nadando!";
    }
}

// classes que reaproveitam os traits
class Passaro {
    use Voavel; // ganhou voar() e pousar() de graca
    
    public function __construct(public string $nome) {}
}

class Pato {
    use Voavel, Nadavel; // ganhou os dois!
    
    public function __construct(public string $nome) {}
}

class Peixe {
    use Nadavel; // so nada
    
    public function __construct(public string $nome) {}
}

$passaro = new Passaro("Pardal");
echo $passaro->voar();  // Pardal está voando!

$pato = new Pato("Pato");
echo $pato->voar();   // Pato Donald está voando!
echo $pato->nadar();  // Pato Donald está nadando!

$peixe = new Peixe("teste");
echo $peixe->nadar(); // Nemo está nadando!