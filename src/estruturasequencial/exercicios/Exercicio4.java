package estruturasequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *	Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
 *	o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
 *	e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int codUm, codDois, pecasUm, pecasDois;
		double valorUm, valorDois;
		
		System.out.println("Peças 1");
		System.out.println("Informe o código, número de peças e valor de cada peça: ");
		
		codUm = scan.nextInt();
		pecasUm = scan.nextInt();
		valorUm = scan.nextDouble();

		
		System.out.println("Peças 2");
		System.out.println("Informe o código, número de peças e valor de cada peça: ");
		
		codDois = scan.nextInt();
		pecasDois = scan.nextInt();
		valorDois = scan.nextDouble();
		
		double total = pecasUm * valorUm + pecasDois * valorDois;
		System.out.printf("Valor total a pagar : R$ %.2f" , total);
		
		scan.close();
	}
}
