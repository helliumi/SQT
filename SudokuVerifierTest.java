import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
String m = "a17369825632158947958724316825437169791586432346912758289643571573291684164875293";
String n = "-417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String e = "ε17369825632158947958724316825437169791586432346912758289643571573291684164875293";

SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);	
	}
	
	@Test
	public void testIncorrectStringWithCharacter() {
		int a = v.verify(m);
		assertEquals("incorrect string", a, 1);
	}
	
	@Test
	public void testIncorrectStringWithNegative() {
		int a = v.verify(n);
		assertEquals("incorrect string", a, -1);
	}
	
	@Test
	public void testIncorrectStringWithNaughty() {
		int a = v.verify(e);
		assertEquals("incorrect string", a, 1);	
	}
	
	@Test
	public void testIncorrectStringWithOnlyOnceInRow() {
		int a = v.verify(c);
		assertNotEquals("correct string", a, -3);	
	}
	
	@Test
	public void testIncorrectStringWithOnlyOnceInColumns() {
		int a = v.verify(c);
		assertNotEquals("correct string", a, -4);	
	}
	
}
