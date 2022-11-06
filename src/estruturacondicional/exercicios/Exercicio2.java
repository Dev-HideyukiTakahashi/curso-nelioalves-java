package estruturacondicional.exercicios;

import java.util.Scanner;

/**
 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */
public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number;
		
		System.out.println("Informe o n�mero: ");
		number = scan.nextInt();
		
		if(number >= 0) {
			System.out.println("POSITIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		scan.close();
	}
}
