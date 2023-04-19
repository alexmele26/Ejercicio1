package org.cuatrovientos.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cadena.Cadena;

public class CadenaTest {

	@Test
	public void longitudBien() {
		Cadena target = new Cadena();
		int expected = 4;
		int actual = target.longitud("noma");
		assertEquals("",expected, actual);
	}
	@Test
	public void longitudError() {
		Cadena target = new Cadena();
		int expected = 4;
		int actual = target.longitud("");
		assertEquals("",expected, actual);
	}
	
	@Test
	public void vocalesBien() {
		Cadena target = new Cadena();
		int expected = 5;
		int actual = target.vocales("murcielago");
		assertEquals("",expected, actual);
	}
	
	@Test
	public void vocalesError() {
		Cadena target = new Cadena();
		int expected = 5;
		int actual = target.vocales("");
		assertEquals("",expected, actual);
	}
	
	@Test
	public void invertirBien() {
		Cadena target = new Cadena();
		String expected = "hola";
		String actual = target.invertir("aloh");
		assertEquals("",expected, actual);
	}
	
	@Test
	public void invertirError() {
		Cadena target = new Cadena();
		String expected = "hola";
		String actual = target.invertir("");
		assertEquals("",expected, actual);
	}
	
	@Test
	public void contarLetraBien() {
		Cadena target = new Cadena();
		int expected = 3;
		char caracter = 'a';
		int actual = target.contarLetra("papada", caracter);
		assertEquals("",expected, actual);
	}
	
	@Test
	public void contarLetraError() {
		Cadena target = new Cadena();
		String expected = "hola";
		int actual = target.contarLetra("",' ');
		assertEquals("",expected, actual);
	}
	
}
