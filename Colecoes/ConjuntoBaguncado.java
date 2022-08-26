package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boleean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> character
		
		System.out.println(conjunto.size());
		
		conjunto.add("Teste");
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains("Teste"));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(false));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums); // uniao entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.print(conjunto);
	}
}
