package files.exercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import files.entity.Product;

/**
 * Lendo um arquivo externo
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */
public class Main {
	public static void main(String[] args) {

		String path = "C:\\Users\\Akira\\Desktop\\Workspace\\file.txt";
		List<Product> products = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				
				products.add(new Product(name, price));
				
				line = br.readLine();
			}
			
			for (Product product : products) {
				System.out.println(product);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
