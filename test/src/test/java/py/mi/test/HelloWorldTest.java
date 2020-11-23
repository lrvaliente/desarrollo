package py.mi.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test form HelloWorldTest")
class HelloWorldTest {

	private static final String VALOR = "HOME";

	@BeforeAll
	static void setup() {

	}

	@AfterAll
	static void tearDown() {

	}

	@Test
	@DisplayName("Test basico")
	void test() {
		HelloWorld h = new HelloWorld();

		String resul = h.verificar();
		assertEquals(VALOR, resul);

	}

}
