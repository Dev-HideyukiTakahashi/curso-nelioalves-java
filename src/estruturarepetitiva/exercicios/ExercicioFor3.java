package estruturarepetitiva.exercicios;

import java.util.Scanner;

/**
 *	Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
 *	Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
 *	Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que 
 *	o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class ExercicioFor3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		double a, b, c;
		
		System.out.println("Informe o valor: ");
		n = scan.nextInt();
		
		for(int i = 0; i <= n; i ++) {
			System.out.println("Primeiro número: ");
			a = scan.nextDouble();
			System.out.println("Segundo número: ");
			b = scan.nextDouble();
			System.out.println("Terceiro número: ");
			c = scan.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 4.0 )/ 10;
			
			System.out.printf("%.1f", media);
		}
		scan.close();
	}
}
