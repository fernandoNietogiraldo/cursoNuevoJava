package org.indra.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.util.*;

import org.indra.mockitodemo.models.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.mockito.Mockito;


@RunWith(BlockJUnit4ClassRunner.class)
public class AppTest 
{
	
	@Test
	public void testWhenThenReturn() {
		
		//Configuración del Mock
		
		List<String> lista = (List<String>)mock(List.class);
		//La lista tiene que tener 20 elementos
		when(lista.size()).thenReturn(20);
		
		//Test
		
		int size = lista.size();
		assertEquals(20,size);
		
	}
	
	@Test
	public void testVerificarMethodInvocation() {
		//Configuro el Mock
		List<String> lista = (List<String>)mock(List.class);
		lista.add("Hola");
		System.out.println(lista.size()); //El resultado va a ser 0 aunque le haya agregado un elemento
		
		//Verifico que se haya llamado al método add() con el parámetro "hola"
		
		Mockito.verify(lista).add("Hola");
	}
	
	@Test
	public void testHombreQueCalcula() {
		ICalculadora calculadora = mock(ICalculadora.class);
		when(calculadora.sumar(2, 3)).thenReturn(5);
		
		ElHombreQueCalculaba beremis = new ElHombreQueCalculaba(calculadora);
		
		int result = beremis.sumarVariasVeces(2, 3, 2);
		assertEquals(10,result);
	}
	
}
