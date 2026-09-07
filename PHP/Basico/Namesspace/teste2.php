<?php
// arquivo: App/Services/User.php
namespace App\Services;

class User {
    public function criar(string $nome): string {
        return "Criando usuario: " . $nome;
    }
}