package estruturacondicional.exercicios;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */
public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number;
		
		System.out.println("Informe o número: ");
		number = scan.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		scan.close();
	}
}
