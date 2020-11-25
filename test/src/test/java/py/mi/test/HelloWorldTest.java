package py.mi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test form HelloWorldTest")
public class HelloWorldTest {

	private static final String VALOR = "Home";

	public HelloWorldTest() {}

	@Test
	@DisplayName("Test basico")
	public void test() {
		HelloWorld h = new HelloWorld();

		String resul = h.verificar();
		assertEquals(VALOR, resul);

	}

}
