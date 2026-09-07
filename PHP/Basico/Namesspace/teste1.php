<?php
// arquivo: App/Models/User.php
namespace App\Models;

class User {
    public string $nome;
    
    public function __construct(string $nome) {
        $this->nome = $nome;
    }
}