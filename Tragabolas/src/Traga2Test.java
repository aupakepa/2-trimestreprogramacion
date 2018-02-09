import static org.junit.Assert.*;

import org.junit.Test;

public class Traga2Test {

	@Test
	public void testComer() {
		Traga2 traga = new Traga2("rojo",10);
		traga.comer();
		int bolasTragadas = traga.getBolasTragadas();
		assertEquals(bolasTragadas, 1);
	}
	@Test
	public void testComer1() {
		Traga2 traga = new Traga2("rojo",10);
		traga.setBolasTragadas(10);
		traga.comer();
		int bolasTragadas = traga.getBolasTragadas();
		assertEquals(bolasTragadas, 10);
	}
	@Test
	public void testComer3() {
		Traga2 traga = new Traga2("rojo",10);
		String resultado = traga.comer();
		assertEquals(resultado, "He comido una bola");
	}
	
	@Test
	public void testTrotar() {
		Traga2 traga = new Traga2("rojo",10);
		traga.trotar();
		int bolasTragadas = traga.getBolasTragadas();
		assertEquals(bolasTragadas, 0);
	}
	@Test
	public void testTrotar2() {
		Traga2 traga = new Traga2("rojo",10);
		traga.setBolasTragadas(10);
		traga.trotar();
		int bolasTragadas = traga.getBolasTragadas();
		assertEquals(bolasTragadas, 9);
	}
	@Test
	public void testDormir() {
		Traga2 traga = new Traga2("rojo",10);
		traga.setBolasTragadas(10);
		traga.dormir();
		int bolasTragadas = traga.getBolasTragadas();
		assertEquals(bolasTragadas, 5);
	}
	@Test
	public void testDormir2() {
		Traga2 traga = new Traga2("rojo",9);
		traga.setBolasTragadas(9);
		traga.dormir();
		int bolasTragadas = traga.getBolasTragadas();
		assertEquals(bolasTragadas, 4);
	}

}
