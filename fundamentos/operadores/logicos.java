package fundamentos.operadores;

public class logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3>7;
		System.out.println(condicao1&&!condicao2); // and
		System.out.println(condicao1||condicao2); // our
		System.out.println(condicao1^condicao2); // ou exclusivo
		System.out.println(!!condicao1); //not
		System.out.println(!condicao2); //not
		
		System.out.println("Tabela Verdade E");
		 System.out.println(true && true);
		 System.out.println(true&&false);
		 //System.out.println(false&&true);
		 //System.out.println(false&&false);
		 System.out.println("Tabela Verdade OU");
		// System.out.println(true || true);
		// System.out.println(true||false);
		 System.out.println(false||true);
		 System.out.println(false||false);
		 System.out.println("Tabela Verdade OU exclusivo (XOR)");
		 System.out.println(true ^ true);
		 System.out.println(true^false);
		 System.out.println(false^true);
		 System.out.println(false^false);
		 System.out.println("Tabela Verdade NOT");
		 System.out.println(!true);
		 System.out.println(!true);
	}
}
