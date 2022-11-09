package interfaces.defaultmethods;

import java.util.Locale;
import java.util.Scanner;

/**
 *	Fazer um programa para ler uma quantia e a duração em meses de um
 *	empréstimo. Informar o valor a ser pago depois de decorrido o prazo do
 *	empréstimo, conforme regras de juros do Brasil. A regra de cálculo de
 *	juros do Brasil é juro composto padrão de 2% ao mês.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */
public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantia: ");
		double amount = scan.nextDouble();
		System.out.println("Meses: ");
		int months = scan.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Pagamento apos "+months+" meses: ");
		System.out.println(String.format("%.2f", payment));
		
	}
}
