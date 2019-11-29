package task9;

import static org.junit.Assert.*;

import org.junit.Test;

public class JuTestCheckBrackets {

	@Test
	public void test_ok1() {
		 assertEquals(-1, Brackets.checkBrackets("()"));
	}

	@Test
	public void test_ok2() {
		 assertEquals(-1, Brackets.checkBrackets(" [ ] "));
	}
	
	@Test
	public void test_ok3() {
		 assertEquals(-1, Brackets.checkBrackets("{ }"));
	}
	
	@Test
	public void test_ok4() {
		 assertEquals(-1, Brackets.checkBrackets("()[]{}"));
	}
	
	@Test
	public void test_ok5() {
		 assertEquals(-1, Brackets.checkBrackets("[({})]"));
	}

	@Test
	public void test_ok6() {
		 assertEquals(-1, Brackets.checkBrackets("() [ {} [ [] {} ] ] ( {} )"));
	}

	@Test
	public void test_ok7() {
		 assertEquals(-1, Brackets.checkBrackets("(3 * arr[x]) * (y - f(z,9))"));
	}

	@Test
	public void test_ok8() {
		 assertEquals(-1, Brackets.checkBrackets(" hugo "));
	}

	@Test
	public void test_err1() {
		 assertEquals(3, Brackets.checkBrackets( "()(" ));
	}

	@Test
	public void test_err2() {
		 assertEquals(4, Brackets.checkBrackets( "[]()]()" ));
	}

	@Test
	public void test_err3() {
		 assertEquals(10, Brackets.checkBrackets("( [ {} () ) )"));
	}

	@Test
	public void test_err4() {
		 assertEquals(4, Brackets.checkBrackets( "{ [ } ]" ));
	}

	@Test
	public void test_err5() {
		 assertEquals(5, Brackets.checkBrackets( "{ [ ]" ));
	}
	
	@Test
	public void test_err6() {
		 assertEquals(7, Brackets.checkBrackets( "( [] ) }" ));
	}
	
}
