package files.exercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de
 * itens vendidos. Cada item possui um nome, preço unitário e quantidade,
 * separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv",
 * localizado em uma subpasta chamada "out" a partir da pasta original do
 * arquivo de origem, contendo apenas o nome e o valor total para aquele item
 * (preço unitário multiplicado pela quantidade).
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class Main {
	public static void main(String[] args) {

		String path = "C:\\Users\\Akira\\Desktop\\Workspace\\file.txt";
		String path2 = "C:\\Users\\Akira\\Desktop\\Workspace\\file2.txt";
		List<Product> products = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				int quantity = Integer.parseInt(vect[2]);

				products.add(new Product(name, price, quantity));

				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {

				for (Product p : products) {
					bw.write(p.getName() + "," + p.getTotal());
					bw.newLine();
				}
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
