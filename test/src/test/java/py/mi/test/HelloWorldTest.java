package py.mi.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test form HelloWorldTest")
class HelloWorldTest {

	private static final String VARLOR = "HOME";
	
	@Test
	public void test() {
		HelloWorld h = new HelloWorld();
		
		try {
			boolean resul = h.verificar(VARLOR);
			System.out.println("EJECUTANDO TEST...");
			assertEquals(true, true);
			assertEquals(true, resul);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
