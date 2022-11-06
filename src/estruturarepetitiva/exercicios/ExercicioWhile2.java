package estruturarepetitiva.exercicios;

import java.util.Scanner;

/**
 *	Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no 
 *	sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. 
 *	O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA 
 *	(nesta situação sem escrever mensagem alguma).
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class ExercicioWhile2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = scan.nextInt();
			y = scan.nextInt();
		}
		
		scan.close();
	}
}
