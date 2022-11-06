package estruturarepetitiva;

import java.util.Scanner;

/**
 * Quando usar: quando não se sabe previamente a quantidade de repetições
 * 
 * Exemplo: Fazer um programa que lê números inteiros até que um zero
 * seja lido. Ao final mostra a soma dos números lidos.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */

public class While {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, soma = 0;
		
		System.out.println("Informe o número: ");
		num = scan.nextInt();
		soma += num;
		
		while(num != 0) {
			System.out.println("Informe o número: ");
			num = scan.nextInt();
			soma += num;
		}
		
		System.out.println("SOMA=" + soma);
		
		scan.close();
	}
}
