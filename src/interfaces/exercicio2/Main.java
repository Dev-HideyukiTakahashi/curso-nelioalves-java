package interfaces.exercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.exercicio2.entities.Contract;
import interfaces.exercicio2.entities.Installment;
import interfaces.exercicio2.service.ContractService;
import interfaces.exercicio2.service.PaypalService;

/**
 * 
 *	Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
 *	um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
 *	número de meses desejado.
 *	A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
 *	Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
 *	por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
 *	juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
 *	Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,
 *	e valor total do contrato). Em seguida, o programa deve ler o número de meses para
 *	parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
 *	sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois
 *	meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.println("Numero: ");
		int number = scan.nextInt();
		scan.nextLine();
		System.out.println("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(scan.nextLine(), dateFormatter);
		System.out.println("Valor do contrato: ");
		double totalValue = scan.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		ContractService contractService = new ContractService(new PaypalService());
		
		System.out.println("Entre com o numero de parcelas: ");
		int n = scan.nextInt();
		
		contractService.processContract(contract, n);
		
		System.out.println("Parcelas: ");
		for (Installment i : contract.getInstallments()) {
			
		}

		
		scan.close();
	}
}
