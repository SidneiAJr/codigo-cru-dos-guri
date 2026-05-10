using System;
using MySql.Data.MySqlClient;

class conecta
{
    public static MySqlConnection GetConnection()
    {
        string connString = "server=localhost;database=java_crud;user=root;password=root";
     return new MySqlConnection(connString);
    }
}

class Lista
{
    public static void ListarTudo()
    {
        using (var conn = conecta.GetConnection())
        {
            conn.Open();
            var cmd = new MySqlCommand("SELECT * FROM usuarios",conn);
            var reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                Console.WriteLine($"{reader["id"]} - {reader["nome"]}");
            }
        }
    }
}

class inserir
{
    public static void Inserir(string nome)
    {
        using (var conn = conecta.GetConnection())
        {
            conn.Open();
            var cmd = new MySqlCommand("INSERT INTO usuarios (nome) values (@nome)",conn);
            cmd.Parameters.AddWithValue("@nome",nome);
            cmd.ExecuteNonQuery();
            Console.WriteLine("Usuario Inserido!");
        }
    }
}


class Program
{
    static void Main(string[] args)
    {
      Console.WriteLine("======CRUD========");
      Lista.ListarTudo();
      inserir.Inserir("Joao B");
      Lista.ListarTudo();
    }
}
