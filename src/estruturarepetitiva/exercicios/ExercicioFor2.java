package estruturarepetitiva.exercicios;

import java.util.Scanner;

/**
 *	Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, 
 *	um valor por linha, inclusive o X, se for o caso.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class ExercicioFor2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x;
		
		System.out.println("Informe o valor: ");
		x = scan.nextInt();
		
		for(int i = 0; i <= x; i ++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
