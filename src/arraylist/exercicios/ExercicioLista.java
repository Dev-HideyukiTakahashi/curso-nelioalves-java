package arraylist.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e
 * salario) de N funcion�rios. N�o deve haver repeti��o de id. Em seguida,
 * efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
 * Para isso, o programa deve ler um id e o valor X. Se o id informado n�o
 * existir, mostrar uma mensagem e abortar a opera��o. Ao final, mostrar a
 * listagem atualizada dos funcion�rios, conforme exemplos. Lembre-se de aplicar
 * a t�cnica de encapsulamento para n�o permitir que o sal�rio possa ser mudado
 * livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
 * aumento por porcentagem dada.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class ExercicioLista {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<ListaEmployee> employee = new ArrayList<>();

		System.out.println("How many employees will be registered? ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.println("Id: ");
			int id = scan.nextInt();
			System.out.println("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("Salary: ");
			double salary = scan.nextDouble();

			employee.add(new ListaEmployee(id, name, salary));
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase :");
		int updateId = scan.nextInt();
		boolean key = true;
		
		for (ListaEmployee emp : employee) {
			if(emp.getId() == updateId) {
				System.out.println("Enter the percentage:");
				emp.increaseSalary(scan.nextDouble());
				key = false;
			}
		}
		
		if(key) {
			System.out.println("This id does not exist!");
		}

		System.out.println();

		System.out.println("List of employees:");

		for (ListaEmployee emp : employee) {
			System.out.println(emp.getId() + ", " + emp.getName() + ", " + emp.getSalary());
		}
	}
}
