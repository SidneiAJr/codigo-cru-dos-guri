using System;

class HelloWorld {
    static void Main() {
        // Solicita ao usuário que insira uma palavra
        Console.WriteLine("Escreva uma palavra:");
        string pal = Console.ReadLine();

        // Remove espaços e converte para minúsculas para evitar problemas de case
        string palavraFormatada = pal.Replace(" ", "").ToLower();

        // Inverte a palavra
        char[] array = palavraFormatada.ToCharArray();
        Array.Reverse(array);
        string palavraInvertida = new string(array);

        // Verifica se é um palíndromo
        if (palavraFormatada == palavraInvertida) {
            Console.WriteLine("É um palíndromo!");
        } else {
            Console.WriteLine("Não é um palíndromo!");
        }
    }
}
