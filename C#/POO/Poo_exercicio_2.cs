using System;

namespace teste
{
	
	interface teste1
	{
		public void teste();
		public void teste2();
	}

	class Program
	{
		static void Main(string[] args)
		{
			Info aluno1 = new Info();
			aluno1.teste();
			aluno1.teste2();
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
		public int op;

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

		public void teste2()
		{
			Console.WriteLine("Bem vindo | Selecione: 1- Media | 2- Nome");
			
		     
		    op = int.Parse(Console.ReadLine());

			switch(op)
			{
				case 1:
					Console.WriteLine("Bem vindo | 1- Media");
					break;
				case 2:
					Console.WriteLine("Bem vindo | 2- Nome");
					break;
				default:
					Console.WriteLine("Opção Invalida!!");
					break;
			}
		}

	}
}
