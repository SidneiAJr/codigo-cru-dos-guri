package com.mycompany.mavenproject1;

import com.google.gson.Gson;
import static spark.Spark.*;
import java.sql.*;
import java.util.*;

public class spark {
    public static void main(String[] args) {
        port(3000);

        get("/", (req, res) -> "API Funcionando");

        // 🔥 LISTAR TODOS
        get("/usuarios", (req, res) -> {
            List<Usuario> usuarios = new ArrayList<>();
            String sql = "SELECT * FROM usuarios";
            
            try (Connection conn = criar_conexao.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                
                while (rs.next()) {
                    Usuario u = new Usuario();
                    u.setNome(rs.getString("nome"));
                    u.setIdade(rs.getInt("idade"));
                    usuarios.add(u);
                }
            } catch (SQLException e) {
                return "Erro: " + e.getMessage();
            }
            
            return new Gson().toJson(usuarios);
        });

        // 🔥 BUSCAR POR ID
        get("/usuarios/:id", (req, res) -> {
            int id = Integer.parseInt(req.params(":id"));
            Usuario u = null;
            String sql = "SELECT * FROM usuarios WHERE id = ?";
            
            try (Connection conn = criar_conexao.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                
                if (rs.next()) {
                    u = new Usuario();
                    u.setNome(rs.getString("nome"));
                    u.setIdade(rs.getInt("idade"));
                }
            } catch (SQLException e) {
                return "Erro: " + e.getMessage();
            }
            
            if (u == null) return "Usuário não encontrado";
            return new Gson().toJson(u);
        });

        // 🔥 CRIAR
        post("/usuarios", (req, res) -> {
            Gson gson = new Gson();
            Usuario u = gson.fromJson(req.body(), Usuario.class);
            String sql = "INSERT INTO usuarios (nome, idade) VALUES (?, ?)";
            
            try (Connection conn = criar_conexao.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                
                stmt.setString(1, u.getNome());
                stmt.setInt(2, u.getIdade());
                stmt.executeUpdate();
            } catch (SQLException e) {
                return "Erro ao inserir: " + e.getMessage();
            }
            
            return gson.toJson(u);
        });

        // 🔥 ATUALIZAR
        put("/usuarios/:id", (req, res) -> {
            int id = Integer.parseInt(req.params(":id"));
            Gson gson = new Gson();
            Usuario u = gson.fromJson(req.body(), Usuario.class);
            String sql = "UPDATE usuarios SET nome = ?, idade = ? WHERE id = ?";
            
            try (Connection conn = criar_conexao.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                
                stmt.setString(1, u.getNome());
                stmt.setInt(2, u.getIdade());
                stmt.setInt(3, id);
                int rows = stmt.executeUpdate();
                
                if (rows == 0) return "Usuário não encontrado";
            } catch (SQLException e) {
                return "Erro ao atualizar: " + e.getMessage();
            }
            
            return "Usuário atualizado";
        });

        // 🔥 DELETAR
        delete("/usuarios/:id", (req, res) -> {
            int id = Integer.parseInt(req.params(":id"));
            String sql = "DELETE FROM usuarios WHERE id = ?";
            
            try (Connection conn = criar_conexcao.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                
                stmt.setInt(1, id);
                int rows = stmt.executeUpdate();
                if (rows == 0) return "Usuário não encontrado";
            } catch (SQLException e) {
                return "Erro ao deletar: " + e.getMessage();
            }
            
            return "Usuário deletado";
        });

        System.out.println("Servidor Spark + MySQL rodando em http://localhost:3000");
    }
}

// 🔥 CONEXÃO
class criar_conexao {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/java_crud",
            "root",
            "root"
        );
    }
}

class Usuario {
    private String nome;
    private int idade;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}
