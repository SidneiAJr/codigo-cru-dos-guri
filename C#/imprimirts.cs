using System;
namespace Teste
{
    class Program
    {
        static void Main()
        {
        int idade;
        string nome;
        string sobrenome;

        Console.Write("Digite o Seu Nome:");
        nome=Console.ReadLine();
        Console.Write("Digite Sua Idade:");
        idade=Convert.ToInt16(Console.ReadLine());
        Console.Write("Digite o Seu Sobrenome:");
        sobrenome=Console.ReadLine();
        Console.WriteLine("Seu Nome é:  " + nome +  "Seu Sobrenome é:  " + sobrenome);
        Console.WriteLine("Sua Idade em Anos:{0}",idade);

        }
        
    }
}
