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

class deletar_id{
    public void deletar(Scanner scanner){
        String deletar = "DELETE FROM usuarios where id=?";
         System.out.println("Insira | ID: ");
         int id = scanner.nextInt();
        try(Connection conn = criar_conexcao.getConnection();PreparedStatement stmt = conn.prepareStatement(deletar);) {
        stmt.setInt(1, id);
        int linhasAfetadas = stmt.executeUpdate();
        if(linhasAfetadas>0){
            System.out.println("Usuario deletado com sucesso");
        }else{
            System.out.println("ID não encontrado");
        }
        } catch (SQLException e) {
             System.err.println("Erro ao Deletar: " + e.getMessage());
        }
    }
}

class atualizar_info{
    public void atualizar(Scanner scanner){
        System.out.println("ID do usuario a Atualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Novo Nome: ");
        String novoNome = scanner.nextLine();
        String sql = "Update usuarios SET nome =? where =?";
        try(Connection conn = criar_conexcao.getConnection();PreparedStatement stmt = conn.prepareStatement(sql);){
            stmt.setString(1, novoNome);
            stmt.setInt(2, id);
            int linhasafetadas = stmt.executeUpdate();
            if(linhasafetadas>0){
                System.out.println("Usuario atalizado com sucesso");
            }else{
                System.out.println("ID não encontrado");
            }
        }catch(SQLException e){
            System.err.println("Erro ao Deletar: " + e.getMessage());
        }
    }
}
