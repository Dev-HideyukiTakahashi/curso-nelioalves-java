package files.exercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import files.entity.Product;

/**
 * Escrevendo em arquivo externo
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */

public class Main {
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>() {{
			add(new Product("Lapis", 2.99));
			add(new Product("Borracha", 5.99));
			add(new Product("Caderno", 10.99));
			add(new Product("Mochila", 22.99));
		}};
		
		String path = "C:\\Users\\Akira\\Desktop\\Workspace\\file.txt";
		
		// OBS: new FileWriter(path, true) reescreve o arquivo, sem o segundo argumento cria um novo
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			for (Product p : products) {
				bw.write(p.getName() + "," + p.getPrice());
				bw.newLine();
			}
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
