<?php
interface Observer {
    public function atualizar(string $evento): void;
}

interface Observable {
    public function inscrever(Observer $observer): void;
    public function notificar(string $evento): void;
}

class Pedido implements Observable {
    private array $observers = [];
    
    public function inscrever(Observer $observer): void {
        $this->observers[] = $observer;
    }
    
    public function notificar(string $evento): void {
        foreach ($this->observers as $observer) {
            $observer->atualizar($evento);
        }
    }
    
    public function finalizar(): void {
        echo "Pedido finalizado!\n";
        $this->notificar("pedido_finalizado");
    }
}

class EmailNotificacao implements Observer {
    public function atualizar(string $evento): void {
        echo "Email enviado! Evento: {$evento}\n";
    }
}

class SmsNotificacao implements Observer {
    public function atualizar(string $evento): void {
        echo "SMS enviado! Evento: {$evento}\n";
    }
}

$pedido = new Pedido();
$pedido->inscrever(new EmailNotificacao());
$pedido->inscrever(new SmsNotificacao());
$pedido->finalizar();
// Pedido finalizado!
// Email enviado! Evento: pedido_finalizado
// SMS enviado! Evento: pedido_finalizado