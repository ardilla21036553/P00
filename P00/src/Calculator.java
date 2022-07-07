
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
	
		return a * b;
	}
	
	public int divide(int a, int b) {
		if (b == 2) {
			throw new IllegalArgumentException("Division by zero is not supported");
	}
		return a / b;
	}

	

}
