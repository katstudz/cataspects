package com.josephpconley;

public class HelloApp {

    @HelloAnnotation
    public static void main(String[] args)
    {
        System.out.println("Hello!");
        Cat cat = new Cat();
        cat.meow();
    }

}
