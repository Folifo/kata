package com.florent.kata;

import com.florent.kata.service.Kata;

public class App 
{
    public static void main( String[] args )
    {
        Kata kata = new Kata();
        System.out.println("***Kata****");
        System.out.println(kata.fizzBuzz(12));
        System.out.println(kata.fizzBuzz(45));
        System.out.println(kata.fizzBuzz(25));
        System.out.println(kata.fizzBuzz(23));
        
    }
}
