package estruturasequencial.exercicios;

import java.util.Scanner;

/**
 * Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a
 * soma desses n�meros com uma mensagem explicativa
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;

		System.out.println("Digite o primeiro n�mero: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = scan.nextInt();
		System.out.println("SOMA: " + (a + b));
		
		scan.close();
	}
}
