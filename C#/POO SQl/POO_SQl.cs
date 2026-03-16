using System;
using MySql.Data.MySqlClient;

namespace teste
{
	class program
	{
		public static void Main(string[] args)
		{
			Console.WriteLine("Menu | 1- Verificar Conex Banco | 2- Lista Simples | 3- Deletar | 4- Atualizar");
			int op = 0;
			while (op!=5)
			{
				Console.WriteLine("Menu | 1- Verificar Conex Banco | 2- Lista Simples | 3- Deletar | 4- Atualizar | 5- Sair");
				Console.Write("Opção: ");

				if (!int.TryParse(Console.ReadLine(), out op))
				{
					Console.WriteLine("Erro: digite um número válido!");
					continue;
				}
				Console.WriteLine("Menu | 1- Verificar Conex Banco | 2- Lista Simples | 3- Deletar | 4- Atualizar");
				switch (op)
				{
					case 1:
						ConectarBanco cx1 = new ConectarBanco("localhost", "empresa", "3306", "root", "root");
						cx1.verificarconexção();
						break;

					case 2:
						ListaTodos ls1 = new ListaTodos();
						ls1.listar();
						break;

					case 3:
						DeletarFuncionario del = new DeletarFuncionario();
						del.deletar();
						break;

					case 4:
						AtualizarFuncionario att = new AtualizarFuncionario();
						att.atualizar();
						break;
					default:
						Console.WriteLine("Erro Opção Invalida!");
						break;
				}
			}
		}
	}
}

interface verificaBanco
{
	public void verificarconexção();
}


class ConectarBanco : verificaBanco
{
	private String Host;
	private String Banco;
	private String Porta;
	private String password;
	private String user;

	public ConectarBanco(string Host, string Banco, string Porta, string password, string user)
	{
		this.Host = Host;
		this.Banco = Banco;
		this.Porta = Porta;
		this.password = password;
		this.user = user;
	}
	public void verificarconexção()
	{
		string connectionString = $"Server={Host};Port={Porta};Database={Banco};Uid={user};Pwd={password};";

		try
		{
			using (MySqlConnection conn = new MySqlConnection(connectionString))
			{
				conn.Open();
				Console.WriteLine("Conexão aberta com sucesso!");
				// Aqui você pode executar comandos SQL
			}
		}
		catch (Exception ex)
		{
			Console.WriteLine("Erro na conexão: " + ex.Message);
		}
	}
}

class ListaTodos
{
	private string connectionString;

	public ListaTodos()
	{
		this.connectionString = "Server=localhost;Port=3306;Database=empresa;Uid=root;Pwd=root;";
	}

	public void listar()
	{
		string sql = "SELECT id_funcionario, nome_funcionario FROM funcionarios";
		try
		{
			using (MySqlConnection conn = new MySqlConnection(connectionString))
			{
				conn.Open();
				using (MySqlCommand cmd = new MySqlCommand(sql, conn))
				using (MySqlDataReader reader = cmd.ExecuteReader())
				{
					while (reader.Read())
					{
						Console.WriteLine($"ID: {reader.GetInt32(0)}, Nome: {reader.GetString(1)}");
					}
				}
			}
		}
		catch (Exception ex)
		{
			Console.WriteLine("Erro ao listar dados: " + ex.Message);
		}
	}
}

	class DeletarFuncionario
	{
		private string connectionString;

		public DeletarFuncionario()
		{
			this.connectionString = "Server=localhost;Port=3306;Database=empresa;Uid=root;Pwd=root;";
		}

		public void deletar()
		{
			Console.WriteLine("Digite o ID do funcionário para deletar:");
			int id = int.Parse(Console.ReadLine());

			string sql = "DELETE FROM funcionarios WHERE id_funcionario = @id";

			try
			{
				using (MySqlConnection conn = new MySqlConnection(connectionString))
				{
					conn.Open();
					using (MySqlCommand cmd = new MySqlCommand(sql, conn))
					{
						cmd.Parameters.AddWithValue("@id", id);

						int linhas = cmd.ExecuteNonQuery();

						if (linhas > 0)
							Console.WriteLine("Funcionário deletado com sucesso!");
						else
							Console.WriteLine("Funcionário não encontrado!");
					}
				}
			}
			catch (Exception ex)
			{
				Console.WriteLine("Erro ao deletar: " + ex.Message);
			}
		}
	}
	class AtualizarFuncionario
	{
		private string connectionString;

		public AtualizarFuncionario()
		{
			this.connectionString = "Server=localhost;Port=3306;Database=empresa;Uid=root;Pwd=root;";
		}

		public void atualizar()
		{
			Console.WriteLine("Digite o ID do funcionário:");
			int id = int.Parse(Console.ReadLine());

			Console.WriteLine("Digite o novo nome:");
			string nome = Console.ReadLine();

			string sql = "UPDATE funcionarios SET nome_funcionario = @nome WHERE id_funcionario = @id";

			try
			{
				using (MySqlConnection conn = new MySqlConnection(connectionString))
				{
					conn.Open();
					using (MySqlCommand cmd = new MySqlCommand(sql, conn))
					{
						cmd.Parameters.AddWithValue("@nome", nome);
						cmd.Parameters.AddWithValue("@id", id);

						int linhas = cmd.ExecuteNonQuery();

						if (linhas > 0)
							Console.WriteLine("Funcionário atualizado com sucesso!");
						else
							Console.WriteLine("Funcionário não encontrado!");
					}
				}
			}
			catch (Exception ex)
			{
				Console.WriteLine("Erro ao atualizar: " + ex.Message);
			}
		}
	}

