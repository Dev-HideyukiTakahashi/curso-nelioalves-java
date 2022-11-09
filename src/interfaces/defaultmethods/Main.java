package interfaces.defaultmethods;

import java.util.Locale;
import java.util.Scanner;

/**
 *	Fazer um programa para ler uma quantia e a dura��o em meses de um
 *	empr�stimo. Informar o valor a ser pago depois de decorrido o prazo do
 *	empr�stimo, conforme regras de juros do Brasil. A regra de c�lculo de
 *	juros do Brasil � juro composto padr�o de 2% ao m�s.
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
