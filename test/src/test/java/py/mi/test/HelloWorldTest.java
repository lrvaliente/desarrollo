package py.mi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


@DisplayName("Test form HelloWorldTest")
public class HelloWorldTest {

	private static final String VALOR = "Index";
	
	private HelloWorld h = new HelloWorld();

	public HelloWorldTest() {}

	@Test
	public void test1() {		
		assertEquals(VALOR, h.verificar());
	}

	@Test
	public void test2() {
		assertEquals("Home", h.verificar());
	}
}
