<?php
interface Verificar{
    public function teste1();
    public function teste2();
}

abstract class teste3 implements Verificar{
    public function __construct(public $info1,public $info2,public $info3,public $info4) {
        $this->info1;
        $this->info2;
        $this->info3;
        $this->info4;
    }
}

class teste4 extends teste3 implements Verificar{
    public function teste1()
    {
        echo "Teste 1 realidado com Sucesso";
    }
    public function teste2()
    {
        echo "Teste 2 realidado com Sucesso";
    }
}

$t = new teste4("info A", "info B", "info C", "info D");
$t->teste1();
$t->teste2();

echo "\nInfos: $t->info1, $t->info2, $t->info3, $t->info4";



?>