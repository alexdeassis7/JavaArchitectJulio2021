package testjunitsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import calculadora.CalculadoraTest;
import calculadoraDos.CalculadoraDosTest;
import testparametrizados.CalculadoraParametroTest;

@RunWith(Suite.class)
@SuiteClasses({
	CalculadoraTest.class,
	CalculadoraDosTest.class,
	CalculadoraParametroTest.class
})
public class AllTestsSuite {

	//Esta clase puede estar vacia lo importante es lo de arriba donde le indicamos
	//el runner Suite.class , luego debemos indicar en la anotacion @SuiteClasses dentro de 
	//los "{ }" todas las clases que queremos que se ejecuten y se ejecutarn en el mismo orden 
	//en el que fueron escritos
}
