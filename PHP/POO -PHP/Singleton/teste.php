<?php

class Database {
    private static ?Database $instancia = null;
    private $conexao;

    // construtor privado - ninguem cria fora
    private function __construct() {
        $this->conexao = "conectado!"; // aqui seria o PDO real
        echo "Conexao criada!\n";
    }

    public static function getInstance(): Database {
        if (self::$instancia === null) {
            self::$instancia = new Database();
        }
        return self::$instancia;
    }

    public function getConexao(): string {
        return $this->conexao;
    }
}

$db1 = Database::getInstance(); // Conexao criada!
$db2 = Database::getInstance(); // nao cria de novo!

var_dump($db1 === $db2); // true - mesma instancia!