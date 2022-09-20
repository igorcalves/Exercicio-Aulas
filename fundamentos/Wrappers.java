package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//byte 
		Byte b = 100; //byte
		//Integer.parseInt(entrada.next()); // int
		Integer i = 10000; 
		Short s = 1000; // short
		Long  l = 100000L; //long 
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l /3);
		Float f = 123.0f;
		System.out.println(f);
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c.toString());
		
		
		
		entrada.close();
		
	}

}
