package com.example;

import java.lang.reflect.Field;

import com.example.models.Avo;
import com.example.models.Filho;
import com.example.models.Pai;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Reflexao reflexao = new Reflexao();

        Pai pai = new Pai();
        pai.setNome("Jose");
        pai.setProfissao("Carpinteiro");
        Object attributes = reflexao.listAttributes(pai);
        Object methods = reflexao.listMethods(pai);

        Avo avo = new Avo();
        avo.setNome("Maria");
        avo.setIdade(70);
        attributes = reflexao.listAttributes(avo);
        methods = reflexao.listMethods(avo);

        System.out.println("Avo");
        System.out.println("Atributos:");
        for (Field field : (Field[]) attributes) {
            System.out.println(" - " + field.getName());
        }

        System.out.println("Metodos:");
        for (Field field : (Field[]) methods) {
            System.out.println(" - " + field.getName());
        }


        System.out.println("Pai");
        System.out.println("Atributos:");
        for (Field field : (Field[]) attributes) {
            System.out.println(" - " + field.getName());
        }

        System.out.println("Metodos:");
        for (Field field : (Field[]) methods) {
            System.out.println(" - " + field.getName());
        }
        
        Filho filho = new Filho();''
        filho.setNome("Carlos");
        filho.setEscola("Leiny lopes");
        attributes = reflexao.listAttributes(filho);
        methods = reflexao.listMethods(filho);


         System.out.println("Filho");
        System.out.println("Atributos:");
        for (Field field : (Field[]) attributes) {
            System.out.println(" - " + field.getName());
        }

        System.out.println("Metodos:");
        for (Field field : (Field[]) methods) {
            System.out.println(" - " + field.getName());
        }

    }
}