using System;

namespace teste
{
	
	interface teste1
	{
		public void teste();
	}

	class Program
	{
		static void Main(string[] args)
		{
			Info aluno1 = new Info();
			aluno1.teste();
		}
	}

	class Info : teste1
	{
		public string Nome;
		public int idade;
		public double nota;
		public double nota2;
		public double nota3;
		public double soma;

		public Info()
		{
			this.Nome = Nome;
			this.idade = idade;
			this.nota = nota;
			this.nota3 = nota3;
			this.nota2 = nota2;
		}



		public void teste()
		{
			Console.Write("Insira o Nome: ");
			Nome = Console.ReadLine(); 

			Console.Write("Insira a Idade: ");
			idade = int.Parse(Console.ReadLine()); 

			Console.Write("Insira a nota 1: ");
			nota = double.Parse(Console.ReadLine()); 

			Console.Write("Insira a nota 2: ");
			nota2 = double.Parse(Console.ReadLine());

			Console.Write("Insira a nota 3: ");
			nota3 = double.Parse(Console.ReadLine());
			soma = (nota + nota2 + nota3) / 3;
			if (soma >= 6) // Se for 6 ou mais
			{
				Console.WriteLine("Aluno Aprovado!");
			}
			else if (soma >= 4) // Se estiver entre 4 e 5.9
			{
				Console.WriteLine("Em recuperação");
			}
			else // Se for menor que 4
			{
				Console.WriteLine("Reprovado");
			}
			Console.WriteLine("Bem vindo ao Sistema: "+ Nome);

		}

	}
}
