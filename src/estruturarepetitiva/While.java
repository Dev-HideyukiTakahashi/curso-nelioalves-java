package estruturarepetitiva;

import java.util.Scanner;

/**
 * Quando usar: quando n�o se sabe previamente a quantidade de repeti��es
 * 
 * Exemplo: Fazer um programa que l� n�meros inteiros at� que um zero
 * seja lido. Ao final mostra a soma dos n�meros lidos.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */

public class While {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, soma = 0;
		
		System.out.println("Informe o n�mero: ");
		num = scan.nextInt();
		soma += num;
		
		while(num != 0) {
			System.out.println("Informe o n�mero: ");
			num = scan.nextInt();
			soma += num;
		}
		
		System.out.println("SOMA=" + soma);
		
		scan.close();
	}
}
