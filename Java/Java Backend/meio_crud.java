package com.mycompany.mavenproject1;
import java.sql.*;
import java.util.*;


public class Mavenproject1 {
    public static void main(String[] args) {
        System.out.println("Crud Simples | Importando tudo com *!");
         Scanner scanner = new Scanner(System.in);
         int op = 0;
         
         while(op!=4){
             System.out.println("1- Inserir Usuario\n2- Listar Usuarios\n3 - Em breve\n");
             op = scanner.nextInt();
             scanner.nextLine();
             switch(op){
                 case 1:
                   insert_info info = new insert_info();
                   info.inserir(scanner);
                   break;
                 case 2:
                     listar_todos lista = new listar_todos();
                     lista.listar();
                     break;
                 case 3:
                     System.out.println("Opção Ainda nâo existe");
                     break;
                 default:
                     System.out.println("Opção Invalida!");
             }
         }
    }
}

class criar_conexcao{
    public static Connection getConnection()throws SQLException{
        return DriverManager.getConnection(
         "jdbc:mysql://localhost:3306/java_crud",
            "root",
            "root"
        );
    }
}

class insert_info{
   public void inserir(Scanner scanner){
       System.out.print("Nome do Usuario: ");
       String nome = scanner.nextLine();
       String sql = "INSERT INTO usuarios (nome) VALUES (?)";
       try(Connection conn = criar_conexcao.getConnection();PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, nome);
            int linhasAfetadas = stmt.executeUpdate();
            System.out.println(linhasAfetadas > 0 ? "✅ Inserido com sucesso!" : "❌ Falha ao inserir.");
       }catch(SQLException e){
           System.err.println("Erro ao inserir: " + e.getMessage());
       }
   }
}

class listar_todos{
    public void listar(){
        String sql = "SELECT * FROM usuarios";
        try(Connection conn = criar_conexcao.getConnection();Statement stmt = conn.createStatement();ResultSet rs = stmt.executeQuery(sql)){
            System.err.println("\n =============Listar de Usuarios=============");
         while(rs.next()){
             System.out.println(rs.getInt("id")+ "-" +rs.getString("nome"));
             System.out.println("==============================================");
         }
         }catch(SQLException e){
              System.err.println("Erro ao listar: " + e.getMessage());   
          }           
        }
    }
