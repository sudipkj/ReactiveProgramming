package org.example;

import com.github.javafaker.Faker;

import java.util.stream.Stream;

public class FakerDemo {

    public static void main(String[] args) {
       for(int i=0; i < 10; i++){
           System.out.println(Faker.instance().name().firstName());
       }
    }
}
