package orientacaoobjeto.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *	Fazer um programa para ler os valores da largura e altura
 *	de um retângulo. Em seguida, mostrar na tela o valor de
 *	sua área, perímetro e diagonal.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class Exercicio1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		RectangleExercicio1 rectangle = new RectangleExercicio1();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.setWidth(scan.nextDouble());
		rectangle.setHeight(scan.nextDouble());

		System.out.println("AREA = " + rectangle.area());
		System.out.println("PERIMETER = " + rectangle.perimeter());
		System.out.println("DIAGONAL = " + rectangle.diagonal());
		
		scan.close();
	}
}
