package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
	
		String s = "bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		String x = "Leo".toUpperCase();
		System.out.println(x.toUpperCase());

		String y = "Bom dia X".replace("X", "igor".toUpperCase());
		System.out.println(y);
		
		//Tipos primitivos não tem o operator "."
	}
}
