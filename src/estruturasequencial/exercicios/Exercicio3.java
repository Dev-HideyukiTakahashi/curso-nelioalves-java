package estruturasequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
 *	casas decimais conforme exemplos.
 *	Fórmula da área: area = π . raio2
 *	Considere o valor de π = 3.14159
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double raio, area;
		
		System.out.println("Informe o raio do círculo: ");
		raio = scan.nextDouble();
		
		area = 3.14159 * (raio * raio);
		System.out.printf("A= %.4f" , area);
		
		scan.close();
	}
}
