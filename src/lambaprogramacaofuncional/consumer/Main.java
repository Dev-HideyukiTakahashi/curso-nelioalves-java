package lambaprogramacaofuncional.consumer;

import java.util.ArrayList;
import java.util.List;

import lambaprogramacaofuncional.entity.Product;

/**
 * Fazer um programa que, a partir de uma lista de produtos, aumente o
 * preço dos produtos em 10%.
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
		
		// Com a classe ProductConsumer
		/* list.forEach(new PriceUpdate()); */
		
		
		// Função Lambda
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(p -> System.out.println(p));
	}
}
