package estruturasequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
 * segundo a fórmula: DIFERENCA = (A * B - C * D).
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int a, b, c, d;
		
		System.out.println("Digite 4 números: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		int diff = a * b - c * d;
		
		System.out.println("Diferença = " + diff);
		
		scan.close();
	}
}
