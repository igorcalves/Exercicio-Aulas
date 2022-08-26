package fundamentos;

public class conversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		int num2 = 10000;
		double num3 = 100.323;
		
		System.out.println(Double.toString(num3).length());
		
		
		System.out.println(Integer.toString(num2).length());
		System.out.println((""+ num2).length());
	
	
	}
}
