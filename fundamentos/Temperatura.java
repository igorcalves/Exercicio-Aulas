package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
				// (F - 32) x 5/9 = C
		final double x1 = 5/9.0;
		final int x2 = 32;
		double F = 86;
		System.out.println("C = " + (F - x2) * x1);
		F = 150;
		System.out.println("C = " + (F - x2) * x1);
		
	}
}