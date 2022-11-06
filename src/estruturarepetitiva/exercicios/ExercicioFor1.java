package estruturarepetitiva.exercicios;

import java.util.Scanner;

/**
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
 * "out" para fora do intervalo).
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class ExercicioFor1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n , x;
		int in = 0, out = 0;

		System.out.println("Informe o valor: ");
		n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Informe o número: ");
			x = scan.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		scan.close();
	}
}
