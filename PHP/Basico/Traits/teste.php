<?php

trait Logger {
    public function log(string $msg): void {
        echo "[LOG]: " . $msg;
    }
}

class User {
    use Logger; // importou o metodo log
}

$u = new User();
$u->log("criado!"); // [LOG]: criado!