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
            var cmd = new MySqlCommand("SELECT * FROM usuarios", conn);
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
            Console.WriteLine("Insira o Nome: ");
            nome = Console.ReadLine();
            var cmd = new MySqlCommand("INSERT INTO usuarios (nome) values (@nome)", conn);
            cmd.Parameters.AddWithValue("@nome", nome);
            cmd.ExecuteNonQuery();
            Console.WriteLine("==========Usuario Inserido!==========");
        }
    }
}

class deletar
{
    public static void deleta(int id)
    {
        using (var conn = conecta.GetConnection())
        {
            conn.Open();
            Console.WriteLine("Insira o ID que deseja deletar:  ");
            var cmd = new MySqlCommand("DELETE from usuarios where id = @id", conn);
            cmd.Parameters.AddWithValue("@id", id);
            int linhas = cmd.ExecuteNonQuery();
            if (linhas > 0)
            {
                Console.WriteLine("Usuario deletado com sucesso");
            }
            else
            {
                Console.WriteLine("ID não encontrado");
            }
            cmd.ExecuteNonQuery();
        }
    }
}


class verificar_id
{
    public static void verificar(int id)
    {
        using (var conn = conecta.GetConnection())
        {
            conn.Open();
            Console.WriteLine("Insira o ID | Procurar");
            var cmd = new MySqlCommand("Select * from usuarios where id = @id",conn);
            cmd.Parameters.AddWithValue("@id",id);
            var reader = cmd.ExecuteReader();
            if (reader.Read())
            {
                Console.WriteLine($"Usuario | {reader["id"]} - {reader["nome"]}");
            }
            else
            {
                Console.WriteLine("ID não econtrado");
            }
        }
    }
}


class Program
{
    static void Main(string[] args)
    {
        int op = 0;
        while (op != 4)
        {
            Console.WriteLine("\n 1- Inserir");
            Console.WriteLine("2- Listar");
            Console.WriteLine("3- Deletar");
            Console.WriteLine("4- Listar por ID");
            op = int.Parse(Console.ReadLine());
            switch (op)
            {
                case 1:
                    Console.Write("Nome: ");
                    string nome = Console.ReadLine();
                    inserir.Inserir(nome);
                    break;
                case 2:
                    Lista.ListarTudo();
                    break;
                case 3:
                    Console.Write("ID do usuário: ");
                    int id = int.Parse(Console.ReadLine());
                    deletar.deleta(id);
                    break;
                case 4:
                   Console.Write("ID do usuário: ");
                    int idBusca = int.Parse(Console.ReadLine());
                   verificar_id.verificar(idBusca);
                    break;
                default:
                    Console.WriteLine("Opção inválida!");
                    break;
            }
        }
    }
}
