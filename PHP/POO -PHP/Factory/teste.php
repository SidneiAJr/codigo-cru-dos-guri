<?php
interface Pagamento {
    public function pagar(float $valor): string;
}

class Pix implements Pagamento {
    public function pagar(float $valor): string {
        return "Pagando R$ {$valor} via Pix!";
    }
}

class Boleto implements Pagamento {
    public function pagar(float $valor): string {
        return "Pagando R$ {$valor} via Boleto!";
    }
}

class Cartao implements Pagamento {
    public function pagar(float $valor): string {
        return "Pagando R$ {$valor} via Cartao!";
    }
}

// FACTORY - fabrica de objetos
class PagamentoFactory {
    public static function criar(string $tipo): Pagamento {
        return match($tipo) {
            'pix'    => new Pix(),
            'boleto' => new Boleto(),
            'cartao' => new Cartao(),
            default  => throw new Exception("Tipo invalido!")
        };
    }
}

$pagamento = PagamentoFactory::criar('pix');
echo $pagamento->pagar(150.00); // Pagando R$ 150 via Pix!

$pagamento = PagamentoFactory::criar('boleto');
echo $pagamento->pagar(200.00); // Pagando R$ 200 via Boleto!