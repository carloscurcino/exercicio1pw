package com.example.models;

public class Avo extends Pessoa{
    private Integer idade;

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    String getTipoVoz() {
        return "Soprano";
    }
}
