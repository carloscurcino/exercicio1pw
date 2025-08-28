package com.example.models;

public abstract class Pessoa {
    private String nome;

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    abstract String getTipoVoz();
}
