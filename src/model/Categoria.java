package model;

public class Categoria {

    private int id;
    private String nome;

    public Categoria (int id, String nome) {

        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O nome da categoria não pode estar vazio.");
        }

        this.id = id;
        this.nome = nome;
    }

    public String getNome(){return nome;}
    public int getId(){return id;}


}
