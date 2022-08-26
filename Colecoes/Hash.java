package Colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		usuarios.add(new Usuario("pedros"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		
		boolean resultado = usuarios.contains(new Usuario("pedros"));
		
		System.out.println(resultado);
	}
}
