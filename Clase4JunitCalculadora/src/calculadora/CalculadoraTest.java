package calculadora;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test // esta anotacion marca el metodo como un test
	public void test() {
		// llamada a la funcion fail (esto hace que +automaticamente la prueba falle)
//		fail("Not yet implemented");
	}

	@Test
	public void testSuma() {
		int resultado = Calculadora.sumar(2, 3);
		int esperado = 5;
		// Assert son los metodos que me brinda Junit como resultados esperados
		assertEquals(esperado, resultado);

	}

	@Test
	public void testResta() {
		int resultado = Calculadora.restar(3, 2);
		int esperado = 1;
		// Assert son los metodos que me brinda Junit como resultados esperados
		assertEquals(esperado, resultado);

	}
}
