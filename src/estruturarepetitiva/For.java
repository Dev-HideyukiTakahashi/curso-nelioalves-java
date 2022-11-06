package estruturarepetitiva;

import java.util.Scanner;

/**
 * Quando usar: quando se sabe previamente a quantidade de repetições ou
 * intervalo de valores
 * 
 * Exemplo: Fazer um programa que lê um valor inteiro N e depois N números inteiros.
 * Ao final mostra a soma dos números lidos.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */

public class For {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int num, soma = 0;
		
		System.out.println("Informe o valor N: ");
		n = scan.nextInt();
		
		for(int i = 0; i < n; i ++) {
			System.out.println("Informe o número: ");
			num = scan.nextInt();
			soma += num;
		}
		
		System.out.println("SOMA=" + soma);
		
		scan.close();
	}
}
