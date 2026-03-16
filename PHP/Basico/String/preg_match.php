<?php
$email = "teste@gmail.com";

if (preg_match("/^[\w.-]+@[\w.-]+\.[a-z]{2,}$/i", $email)) {
    echo "Email válido!";
} else {
    echo "Email inválido!";
}
