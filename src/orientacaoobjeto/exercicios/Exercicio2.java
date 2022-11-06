package orientacaoobjeto.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *	Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em
 *	seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o
 *	sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto �
 *	afetado pela porcentagem) e mostrar novamente os dados do funcion�rio.
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
		System.out.println("Informe o nome do funcion�rio: ");
		employee.setName(scan.nextLine());
		System.out.println("Informe o sal�rio do funcion�rio: ");
		employee.setGrossSalary(scan.nextDouble());
		System.out.println("Informe o imposto do funcion�rio: ");
		employee.setTax(scan.nextDouble());
		
		System.out.println("Employee" + employee.getName() + ", $ " + employee.netSalary());
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = scan.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("Updated data: " + employee.getName() + ", $ " + employee.netSalary());
		
		scan.close();
	}
}
