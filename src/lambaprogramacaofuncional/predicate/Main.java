package lambaprogramacaofuncional.predicate;

import java.util.ArrayList;
import java.util.List;

import lambaprogramacaofuncional.entity.Product;

/**
 * Fazer um programa que, a partir de uma lista de produtos, remova da
 * lista somente aqueles cujo preço mínimo seja 100.
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
		
		// Com a classe ProductPredicate
		/* list.removeIf(new ProductPredicate()); */
		
		
		// Função Lambda
		list.removeIf(p -> p.getPrice() >= 100);
		
		for (Product product : list) {
			System.out.println(product);
		}
	}
}
