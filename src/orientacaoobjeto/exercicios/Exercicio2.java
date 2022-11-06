package orientacaoobjeto.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *	Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
 *	seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
 *	salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
 *	afetado pela porcentagem) e mostrar novamente os dados do funcionário.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class Exercicio2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		EmployeeExercicio2 employee = new EmployeeExercicio2();
		System.out.println("Informe o nome do funcionário: ");
		employee.setName(scan.nextLine());
		System.out.println("Informe o salário do funcionário: ");
		employee.setGrossSalary(scan.nextDouble());
		System.out.println("Informe o imposto do funcionário: ");
		employee.setTax(scan.nextDouble());
		
		System.out.println("Employee" + employee.getName() + ", $ " + employee.netSalary());
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = scan.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("Updated data: " + employee.getName() + ", $ " + employee.netSalary());
		
		scan.close();
	}
}
