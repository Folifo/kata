package com.florent.kata.test;



import static org.junit.Assert.*;

import org.junit.Test;

import com.florent.kata.service.Kata;

public class KataTest {

	@Test
	public void buzz() {
		Kata ex = new Kata();
		String output = ex.fizzBuzz(35);
		assertEquals("buzz", output);	
		}
	
	@Test
	public void fizz() {
		Kata ex = new Kata();
		String output = ex.fizzBuzz(9);
		assertEquals("fizz", output);	
		}
	
	
	@Test
	public void fizzBuzz() {
		Kata ex = new Kata();
		String output = ex.fizzBuzz(45);
		assertEquals("fizzbuzz", output);	
		}
	
	@Test
	public void noFizzBuzz() {
		Kata ex = new Kata();
		String output = ex.fizzBuzz(22);
		assertEquals("22", output);	
		}
	

}