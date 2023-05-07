package org.example.utils;

import com.github.javafaker.Faker;

import java.util.function.Consumer;

public class Util {

    public static final Faker FAKER = Faker.instance();

    public static Consumer<Object> onNext(){
        return e -> System.out.println("On Next :" + e);
    }

    public static Consumer<Throwable> onError(){
        return e -> System.out.println("On Error :" + e.getMessage());
    }

    public static Runnable onComplete(){
        return () -> System.out.println("On Complete --- done");
    }




}
