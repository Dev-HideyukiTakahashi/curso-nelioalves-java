package estruturasequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *	Fazer um programa que leia o número de um funcionário, 
 *	seu número de horas trabalhadas, o valor que recebe por
 *	hora e calcula o salário desse funcionário. 
 *	A seguir, mostre o número e o salário do funcionário, 
 *	com duas casas
 *	decimais.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int number, hour;
		double salaryPerHour, salary;
		
		System.out.println("Informe o número do funcionário: ");
		number = scan.nextInt();
		System.out.println("Informe as horas trabalhadas: ");
		hour = scan.nextInt();
		System.out.println("Informe quanto recebe por hora: ");
		salaryPerHour = scan.nextDouble();
		
		salary = salaryPerHour * hour;
		
		System.out.println("Number: " + number);
		System.out.printf("Salary: %.2f " , salary);
		
		scan.close();
	}
}
