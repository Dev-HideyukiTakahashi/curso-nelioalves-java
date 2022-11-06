package estruturacondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */
public class Exercicio5 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// TABELA
		int cod1 = 1;
		String especificao1 = "Cachorro Quente";
		double preco1 = 4.00;

		int cod2 = 2;
		String especificao2 = "X-Salada";
		double preco2 = 4.50;

		int cod3 = 3;
		String especificao3 = "X-Bacon";
		double preco3 = 5.00;

		int cod4 = 4;
		String especificao4 = "Torrada Simples";
		double preco4 = 2.00;

		int cod5 = 5;
		String especificao5 = "Refrigerante";
		double preco5 = 1.50;
		

		System.out.println("Informe o código do item: ");
		int cod = scan.nextInt();
		System.out.println("Informe a quantidade: ");
		int qtd = scan.nextInt();

		if (cod == 1) {
			double total = preco1 * qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else if (cod == 2) {
			double total = preco2 * qtd;
			System.out.printf("Total: R$ %.2f", total);
		}else if (cod == 3) {
			double total = preco3 * qtd;
			System.out.printf("Total: R$ %.2f", total);
		}else if (cod == 4) {
			double total = preco4 * qtd;
			System.out.printf("Total: R$ %.2f", total);
		}else if (cod == 5) {
			double total = preco5 * qtd;
			System.out.printf("Total: R$ %.2f", total);
		}
		
		scan.close();
	}
}
