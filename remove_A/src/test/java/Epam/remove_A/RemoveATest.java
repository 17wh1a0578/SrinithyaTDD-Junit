package Epam.remove_A;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATest {
	
	RemoveA remA;
	@BeforeEach
	public void setUp() {
		remA = new RemoveA();
	}
	
	@Test
	void testFirstTwo() {
		assertEquals("CD", remA.removeA("AACD"));
	}
	@Test
	void testFirstA() {
		assertEquals("BCD", remA.removeA("ABCD"));
	}
	@Test
	void testSecondA() {
		assertEquals("BCD", remA.removeA("BACD"));
	}
	@Test
	void testNoA() {
		assertEquals("BBAA", remA.removeA("BBAA"));
	}
	@Test
	void testEmpty() {
		assertEquals("", remA.removeA(""));
	}
	@Test
	void testOnly1() {
		assertEquals("", remA.removeA("A"));
	}
	@Test
	void testOnly2() {
		assertEquals("", remA.removeA("AA"));
	}

}