package lambaprogramacaofuncional.function;

import java.util.ArrayList;
import java.util.List;

import lambaprogramacaofuncional.entity.Product;

/**
 * Fazer um programa que, a partir de uma lista de produtos, gere uma
 * nova lista contendo os nomes dos produtos em caixa alta.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */

public class Main {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Com a classe UpperCaseName
		/* list.stream()
			.map(p -> new UpperCaseName())
			.forEach(p -> System.out.println(p)); */
		
		
		// Função Lambda
		list.stream()
			.map(p -> p.getName().toUpperCase())
			.forEach(p -> System.out.println(p));
	}
}
