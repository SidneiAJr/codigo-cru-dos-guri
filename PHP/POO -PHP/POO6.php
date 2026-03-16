<?php

interface VerificarPersonagem {
    public function VeriPersona(): void;
    public function VerificaHP(): void;
    public function VerificaStatus(): void;
    public function VerificaLevel(): void;
}

interface VerificarItens {
    public function Itens(): void;
    public function ItensCertos(): bool;
}

interface VerificaHabilidade {
    // Adicione métodos se necessário
}

interface VerificaClasse {
    // Adicione métodos se necessário
}

abstract class Classe implements VerificarPersonagem, VerificaHabilidade, VerificaClasse {
    // Propriedades públicas definidas no construtor
    public function __construct(public string $NomePersonagem, public int $DanoPersonagem, public string $InfoPersonagem, public string $tipoIten) {}
}

class Personagem extends Classe implements VerificaClasse, VerificarPersonagem, VerificaHabilidade {
    public function VerificaHP(): void {
        // Implementação aqui
    }

    public function VeriPersona(): void {
        // Implementação aqui
    }

    public function VerificaStatus(): void {
        // Implementação aqui
    }

    public function VerificaLevel(): void {
        // Implementação aqui
    }
}

class Itens implements VerificarItens {
    // Definindo a propriedade tipoIten na classe Itens
    private string $tipoIten;

    public function __construct(string $tipoIten) {
        $this->tipoIten = $tipoIten;
    }

    public function Itens(): void {
        // Implementação aqui, talvez mostrar ou listar os itens
        echo "Tipo do item: " . $this->tipoIten . "\n";
    }

    public function ItensCertos(): bool {
        // Verificando se o item é correto
        if ($this->tipoIten == "Espada") {
            echo "Item Certo\n";
            return true; // O item é correto
        } else {
            echo "Item Errado\n";
            return false; // O item é incorreto
        }
    }
}

// Testando as classes
$personagem = new Personagem("Guerreiro", 100, "Guerreiro forte", "Espada");
echo $personagem->NomePersonagem . " está pronto para batalha!\n";

$item = new Itens("Espada");
$item->Itens();
$item->ItensCertos(); // Verificando se o item é correto
?>
