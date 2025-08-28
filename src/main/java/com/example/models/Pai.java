package com.example.models;

public class Pai extends Pessoa{
    private String profissao;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    String getTipoVoz() {
        return "Baritono";
    }
}
