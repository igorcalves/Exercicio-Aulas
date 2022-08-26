package fundamentos.operadores;

public class unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		//posfix
		a++; // a = a + 1
		a--; // a + a - 1
		
		//prefix
		
		++b; // a = a + 1
		--b; //a  = a - 1
		
		System.out.println(a);
		System.out.println();
		System.out.println(++a == b--); // precendencia
		
	}
}
