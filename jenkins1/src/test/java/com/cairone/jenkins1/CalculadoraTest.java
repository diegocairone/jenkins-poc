package com.cairone.jenkins1;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test1() {
		Calculadora calc = new Calculadora();
		int r = calc.sumar(1, 1);
		assertThat(r, CoreMatchers.is(2));
	}
	
	@Test
	public void test2() {
		Calculadora calc = new Calculadora();
		int r = calc.sumar(1, -1);
		assertThat(r, CoreMatchers.is(0));
	}
}
