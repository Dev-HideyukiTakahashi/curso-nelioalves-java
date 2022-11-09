package lambaprogramacaofuncional.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lambaprogramacaofuncional.entity.Product;


public class Main {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>() {{
			add(new Product("TV", 900.00));
			add(new Product("Notebook", 1200.00));
			add(new Product("Tablet", 450.00));
		}};
		
		// Com a classe MyComparator
		/* list.sort(new MyComparator()); */
		
		// Classe anônima 
		/* Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		}; 
		
		list.sort(comp);*/
		
		
		// Função anônima 
		/* Comparator<Product> comp = (p1,p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		list.sort(comp); */
		
		// Função Lambda
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product product : list) {
			System.out.println(product);
		}

	}

}
