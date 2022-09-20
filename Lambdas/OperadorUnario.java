package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n+2;
		UnaryOperator<Integer> vezesDois = n -> n* 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		nums.stream().map(Integer::toBinaryString).forEach(System.out::println);;
		
		
		System.out.print(maisDois.andThen(vezesDois).andThen(aoQuadrado)
				.apply(0));
//		
//		System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois)
//				.apply(0));
//		

		
		
		
		
		
		}
}
