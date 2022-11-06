package estruturacondicional.exercicios;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */
public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number;
		
		System.out.println("Informe o número: ");
		number = scan.nextInt();
		
		if(number >= 0) {
			System.out.println("POSITIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		scan.close();
	}
}
