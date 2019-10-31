package com.liam.point.test;

import com.liam.point.design.proxy.statics.Image;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.BlockingDeque;

import lombok.Data;

public class LambdaTest {



    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Bob");
        System.out.println(Optional.ofNullable(person).map(p -> {
            p.setName("ddd");
            return p;
        }).map(Person::getName).orElse(getName()));
        System.out.println(Optional.ofNullable(person).map(Person::getName).orElse(getName()));
    }

    public static String getName(){
        System.out.println("name;;;;;");
        return "method";
    }

    @Data
    static class Person{
        private String name;
        private int age;
    }
}
