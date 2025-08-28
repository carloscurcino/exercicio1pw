package com.example;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Reflexao {
    

    public Field[] listAttributes(Object obj){
        List<Field> fields = new ArrayList<>();
        Class<?> clazz = obj.getClass();
        while (clazz != null) {
            for (Field field : clazz.getDeclaredFields()) {
                fields.add(field);
            }
            clazz = clazz.getSuperclass();
        }
        return fields.toArray(new Field[0]);
    }

    public Field[] listMethods(Object obj){
        List<Field> fields = new ArrayList<>();
        Class<?> clazz = obj.getClass();
        while (clazz != null) {
            for (Field field : clazz.getDeclaredFields()) {
                fields.add(field);
            }
            clazz = clazz.getSuperclass();
        }
        return fields.toArray(new Field[0]);
    }
}