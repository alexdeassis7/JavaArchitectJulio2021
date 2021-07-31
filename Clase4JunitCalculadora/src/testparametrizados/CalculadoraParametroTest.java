package testparametrizados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import calculadoraDos.CalculadoraDos;

//TEST PARAMETRIZADO

@RunWith(value = Parameterized.class)
//esta anotacion sirve para decirle a Junit que corra el test con un Runner en particular
//en este caso el runner es "parameterized y es el constructor que se ocupa de realizar las 
//pruebas parametrizadas y necesita un metodo static , public y que retorne un Iterable
public class CalculadoraParametroTest {

	@Parameters
	public static Iterable<Object[]> getData() {
		// el array debera tener tantos objetos como parametros posea el constructor en
		// este caso 3 (a,b,expected) cuando se ejecute la prueba Junit buscara este
		// metodo
		// por quew posee la anotacion @Parameters es de este metodo de donde nos va a
		// extraer
		// los datos para ejecutar el test parametrizado

		List<Object[]> obj = new ArrayList<>();

		// si modificamos erroneamente algun dato del array el test deberia fallar
		obj.add(new Object[] { 3, 1, 4 });
		obj.add(new Object[] { 3, 2, 5 });
		obj.add(new Object[] { 3, 3, 6 });
		obj.add(new Object[] { 23, 1, 24 });

		return obj;
	}

	private int a, b, expected;

	// creamos el constructor para nuestro test
	public CalculadoraParametroTest(int a, int b, int expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;

	}

	@Test
	public void testAdd() {
		CalculadoraDos calc = new CalculadoraDos();
		int resultado = calc.add(a, b);
		System.out.println("ejecutando test con " + a + "  +  " + b + " = " + resultado);
		assertEquals(expected, resultado);
	}

}
