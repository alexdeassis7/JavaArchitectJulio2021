package calculadoraDos;

//Usaremos Before y After
public class CalculadoraDos {
	private int ans;

	public CalculadoraDos() {
	}

	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}

	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}

	// division que puede generar un error
	public int div(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("no podes dividir por cero en los numeros reales!");
		}
		ans = a / b;
		return ans;
	}

	public int add(int v) {
		ans += v;
		return ans;
	}

	public int ans() {
		return ans;
	}

	public void clear() {
		ans = 0;
	}

	// deberia estar optimizado
	public void operacionOptima() {
		try {
			Thread.sleep(2000);// demoramos dos mil milisegundos la ejecucion del hilo;
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
