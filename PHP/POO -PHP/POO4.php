<?php

interface teste{
    public function teste1();
    public function teste2();
}

interface teste3{
    public function teste4();
    public function teste5();
}

abstract class teste6 implements teste, teste3{
    public function __construct(public int $n, public int $n2) {
        $this->n = $n;
        $this->n2 = $n2;
        echo "Soma", $n+$n2. "\n";
    }
}

class ex extends teste6{
    public function teste1()
    {
        echo "Ola Mundo coe\n";
    }
    public function teste2()
    {
        echo "Ola Mundo coe\n";
    }
    public function teste4()
    {
        echo "Ola Mundo coe\n";
    }
    public function teste5()
    {
        echo "Ola Mundo coe\n";
    }
}

$testar1 = new ex(5,5);
$testar1->teste1();
$testar1->teste2();
$testar1->teste4();
$testar1->teste5();
    
?>
