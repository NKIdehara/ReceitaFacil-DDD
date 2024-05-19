package br.edu.infnet.receitafacil.ReceitaFacil.model;

public class Receita {
    private int id;
    private String nome;
    private String preparo;
    private String ingredientes;

    public Receita() {
    }

    public Receita(int id, String nome, String preparo, String ingredientes) {
        this.id = id;
        this.nome = nome;
        this.preparo = preparo;
        this.ingredientes = ingredientes;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreparo() {
        return this.preparo;
    }

    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }

    public String getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
