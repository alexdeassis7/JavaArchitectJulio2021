package calculadoraDos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraDosTest {

	// creamos el atributo estatico para poder utilizar el metodo beforeClass
	static CalculadoraDos calc;

	// este metodo se ejecutara una unica vez an inicio de la ejecucion de la clase
	// sirve por ejemplo para crear objetos muy pesados o asegurarnos que un
	// determinado objeto se crea siempre que se inicia la clase
	@BeforeClass
	public static void beforeClass() {
		System.out.println(" BeforeClass()");
		calc = new CalculadoraDos();
	}

//	Sirve para ejecutar codigo antes de que se ejecute cada una de las 
//	pruebas unitarias (metodos con anotacion @Test)
	@Before
	public void before() {
		System.out.println("     Before()  ");
		calc = new CalculadoraDos();// no forma parte del test es una precondicion para ejecutar el test
	}

	@After // codigo que se ejecuta despues de cada uno de los test unitarios
	public void after() {
		System.out.println("     After()  ");
		calc.clear();
	}

	@AfterClass // codigo que se ejecuta una unica vez al final de la clase
	public static void afterClass() {// este metodo debe ser static para que funcione correctamente
		System.out.println("AfterClass()");
		calc.clear();
	}

	@Test
	public void testSum() {
		System.out.println("            Ejecutando Test: TestSum()");
		int result = calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, result);
	}

	@Test
	public void testAnsSum() {
		System.out.println("            Ejecutando Test: testAnsSum()");
		int result = calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, result);
	}

	@Test
	public void testDiv() {
		System.out.println("            Ejecutando Test: testDiv()");
		int result = calc.div(6, 2);
		assertEquals(3, result);
	}

	// esta prueba funcionara por que se espera un error con el "expected"
	// un expected siempre va a fallar si no se genera la Exception que se le indica
	@Test(expected = ArithmeticException.class)
	public void testDivPorCero() {
		System.out.println("            Ejecutando Test: testDivPorCero()");
		int result = calc.div(5, 0);
	}

	@Test(timeout = 10000) // time out nos sirve para testear si un metodo tarda
	// mas de lo normal , en este ejemplo 100 milisegundos
	// si modificamos el tiempo no debera generar una Exception
	public void testAlgoritmoOptimo() {
		System.out.println("            Ejecutando Test: testAlgoritmoOptimo()");
		calc.operacionOptima();
	}

}
