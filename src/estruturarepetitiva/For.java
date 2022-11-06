package estruturarepetitiva;

import java.util.Scanner;

/**
 * Quando usar: quando se sabe previamente a quantidade de repeti��es ou
 * intervalo de valores
 * 
 * Exemplo: Fazer um programa que l� um valor inteiro N e depois N n�meros inteiros.
 * Ao final mostra a soma dos n�meros lidos.
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
			System.out.println("Informe o n�mero: ");
			num = scan.nextInt();
			soma += num;
		}
		
		System.out.println("SOMA=" + soma);
		
		scan.close();
	}
}
