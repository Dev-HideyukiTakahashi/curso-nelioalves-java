package generics.curinga;
import generics.curinga.Product;

import java.util.ArrayList;
import java.util.List;


/**
 * Uma empresa de consultoria deseja avaliar a performance de produtos,
 * funcionários, dentre outras coisas. Um dos cálculos que ela precisa é encontrar
 * o maior dentre um conjunto de elementos. Fazer um programa que leia um
 * conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
 * mostre o mais caro deles.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>() {{
			add(new Product("Comptuter", 890.50));
			add(new Product("Iphone", 910.00));
			add(new Product("Tablet", 550.00));
		}};
		
		Product x = CalculationService.max(list);
		
		System.out.println("Most expensive: ");
		System.out.println(x);
	}
}
