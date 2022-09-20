package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase();
		//wrappers são a versão objetio dos tipos primitivos
		// tudo em java é objeto menos os tipos primitivos.
		int a = 123;
		System.out.println(a);
		
	}
}
