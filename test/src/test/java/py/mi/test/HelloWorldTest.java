package py.mi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


@DisplayName("Test form HelloWorldTest")
public class HelloWorldTest {

	private static final String VALOR = "Home";
	
	private HelloWorld h = new HelloWorld();

	public HelloWorldTest() {}

	@Test
	public void test() {		
		assertEquals(VALOR, h.verificar());
	}

}
