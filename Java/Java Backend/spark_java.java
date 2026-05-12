package com.mycompany.mavenproject1;

import com.google.gson.Gson;
import static spark.Spark.*;

public class spark {
    public static void main(String[] args) {
        port(3000);

        get("/", (req, res) -> "API Funcionando");

        // 🔥 CORRIGIDO: GET /usuarios sem parâmetro
        get("/usuarios", (req, res) -> "Lista de usuários");

        // 🔥 CORRIGIDO: GET /usuarios/:id com parâmetro
        get("/usuarios/:id", (req, res) -> {
            String id = req.params(":id");
            return "Usuário " + id;
        });

        // 🔥 CORRIGIDO: POST com JSON (sem duplicação)
        post("/usuarios", (req, res) -> {
            Gson gson = new Gson();
            Usuario u = gson.fromJson(req.body(), Usuario.class);
            return gson.toJson(u);
        });

        // 🔥 CORRIGIDO: PUT /usuarios/:id (atualizar)
        put("/usuarios/:id", (req, res) -> {
            String id = req.params(":id");
            return "Usuário " + id + " atualizado";
        });

        // 🔥 CORRIGIDO: DELETE /usuarios/:id
        delete("/usuarios/:id", (req, res) -> {
            String id = req.params(":id");
            return "Usuário " + id + " deletado";
        });

        System.out.println("Servidor Spark rodando em http://localhost:3000");
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
