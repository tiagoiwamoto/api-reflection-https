package com.example.springbootpoc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

public class MeuReflection {

    public void execute(MeuPojo pojo){
        Field[] fields = pojo.getClass().getDeclaredFields();
        System.out.println("Campos: ");
        System.out.println(Arrays.asList(fields));

        Arrays.asList(fields).forEach(field -> {
            field.setAccessible(true);
            Annotation[] annotations = field.getDeclaredAnnotations();
            System.out.println("anotações: ");
            System.out.println(Arrays.asList(annotations));
            try{
                if(field.isAnnotationPresent(MyAnnotation.class)){
                    System.out.println("Valor gravado: ");
                    System.out.println(field.getName());
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }

}
