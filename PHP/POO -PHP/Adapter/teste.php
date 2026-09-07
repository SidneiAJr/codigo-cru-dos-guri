<?php
// interface que seu sistema espera
interface Pagamento {
    public function pagar(float $valor): string;
}

// API externa com interface diferente
class PagSeguroAPI {
    public function realizarCobranca(float $amount, string $moeda): string {
        return "PagSeguro cobrou R$ {$amount} em {$moeda}";
    }
}

// ADAPTER - traduz uma pra outra
class PagSeguroAdapter implements Pagamento {
    public function __construct(
        private PagSeguroAPI $api
    ) {}

    public function pagar(float $valor): string {
        return $this->api->realizarCobranca($valor, "BRL");
    }
}

// seu sistema usa Pagamento - nao sabe nada do PagSeguro
$pagamento = new PagSeguroAdapter(new PagSeguroAPI());
echo $pagamento->pagar(99.90);
// PagSeguro cobrou R$ 99.90 em BRL