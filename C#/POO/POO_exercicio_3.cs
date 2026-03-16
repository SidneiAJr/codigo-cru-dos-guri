using System;

namespace teste
{
	class program
	{
		public static void Main(string[] args)
		{
			carta c1 = new carta(200);
			c1.VerificarTexto();

		}
	}

	interface Verificador
	{
		public void VerificarTexto();
	}

	class carta : Verificador
	{

		protected int Tamanhotexto;

		public carta(int Tamanhotexto)
		{
			this.Tamanhotexto = Tamanhotexto;
		}

		public void VerificarTexto()
		{
			Console.WriteLine("Insira o Numero de palavras que vai ter sua carta:");
			Tamanhotexto = int.Parse(Console.ReadLine());
			if (Tamanhotexto > 300)
			{
				Console.WriteLine("Seu Texto tem: " + Tamanhotexto);
			}
			else
			{
				Console.WriteLine("Texto Pequeno: " + Tamanhotexto);
			}

		}
	}







}
