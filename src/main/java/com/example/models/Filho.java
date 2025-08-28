package com.example.models;

public class Filho extends Pessoa{
    private String escola;

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    String getTipoVoz() {
        return "Contralto";
    }
}
