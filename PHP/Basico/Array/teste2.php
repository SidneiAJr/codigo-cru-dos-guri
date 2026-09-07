<?php

$array = ["teste","teste2","teste3"];

$transformar = function($item){
    return strtoupper($item);
};

$resultado = array_map($transformar,$array);
print_r($resultado);

$resultado2 = array_map(fn($item)=>strtoupper($item),$array);
print_r($resultado2);

$resultado3 = array_filter($array, fn($item) => strlen($item) > 5);
print_r($resultado3);