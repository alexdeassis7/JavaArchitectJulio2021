package asserts;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import calculadora.Calculadora;

public class AssertTest {

	@Test
	public void test() {
		// assertEquals(long , long); //sirve para todos los numericos
//		assertEquals(Object , Object); //debe tener bien implementado el equals en el object
//		assertEquals(double, double , double delta); //el delta es la tolerancia a la falla   
//		assertEquals(String Mensaje ,int  , int); //en el caso que falle el test se muestra el mensaje
		// ej
		// assertEquals("3 es distinto de 4", 3 ,4 );
		Calculadora s1 = new Calculadora();
		Calculadora s2 = s1;
		
		String st1 = "hola";
		String st2 = "hola";
		
		assertEquals(st1, st2); //esto da true por que los dos String son igual 
		assertSame(s1, s2); //esto da false por que los dos objetos estan en posiuciones distintas
		

	}

	@Test
	public void testPerson() {
		// Se establecen los valores esperados en la prueba
		String name = "Alex";
		String lastName = "DeAsis";
		String lastName2 = "Soria";

		// Se invoca al metodo constructor

		Person instance = new Person("Alex", "DeAsis", "Soria");

		// Se verifica a traves del metodo assert que los valores
		// asignados por el metodo contructor se corresponden con los valores
		// esperados

		assertEquals(instance.getName(), name);
		assertEquals(instance.getLastName1(), lastName);
		assertEquals(instance.getLastName2(), lastName2);

	}
}
