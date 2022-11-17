package com.florent.kata.service;

public class Kata {

	public String fizzBuzz(Integer nombre){
		
		if(nombre%15==0)return "fizzbuzz";
		else if(nombre%3==0)return "fizz";
		else if(nombre%5==0)return "buzz";
		else return nombre+"";
		
	}
}
