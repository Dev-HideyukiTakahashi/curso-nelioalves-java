package herancapolimorfismo.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de N contribuintes (N fornecido pelo
 * usu�rio), os quais podem ser pessoa f�sica ou pessoa jur�dica, e depois
 * mostrar o valor do imposto pago por cada um, bem como o total de imposto
 * arrecadado. Os dados de pessoa f�sica s�o: nome, renda anual e gastos com
 * sa�de. Os dados de pessoa jur�dica s�o nome, renda anual e n�mero de
 * funcion�rios. As regras para c�lculo de imposto s�o as seguintes: Pessoa
 * f�sica: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto.
 * Pessoas com renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa
 * teve gastos com sa�de, 50% destes gastos s�o abatidos no imposto. Exemplo:
 * uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com sa�de, o
 * imposto fica: (50000 * 25%) - (2000 * 50%) = 11500.00 Pessoa jur�dica:
 * pessoas jur�dicas pagam 16% de imposto. Por�m, se a empresa possuir mais de
 * 10 funcion�rios, ela paga 14% de imposto. Exemplo: uma empresa cuja renda foi
 * 400000.00 e possui 25 funcion�rios, o imposto fica: 400000 * 14% = 56000.00
 *
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Enter the number of tax payers:");
		int n = scan.nextInt();
		
		List<TaxPayer> payers = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.println("Individual or company? (i/c)?");
			char op = scan.next().charAt(0);
			System.out.println("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("Anual income:");
			double anualIncome = scan.nextDouble();
			if(op == 'i') {
				System.out.println("Health expenditures:");
				double healthExpenditures = scan.nextDouble();
				payers.add(new Individual(name, anualIncome, healthExpenditures));
			}else if(op == 'c') {
				System.out.println("Number of employees:");
				int numberOfEmployees = scan.nextInt();
				payers.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println("TAXES PAID:");
		double total = 0;
		for (TaxPayer payer : payers) {
			System.out.println(payer.getName() + ": $ " + String.format("%.2f",payer.tax()));
			total += payer.tax();
		}
		
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", total));
		scan.close();
	}
}
