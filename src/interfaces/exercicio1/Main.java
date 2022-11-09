package interfaces.exercicio1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.exercicio1.entities.CarRental;
import interfaces.exercicio1.entities.Vehicle;
import interfaces.exercicio1.service.BrazilTaxService;
import interfaces.exercicio1.service.RentalService;

/**
 * 
 *	Uma locadora brasileira de carros cobra um valor por hora para loca��es de at�
 *	12 horas. Por�m, se a dura��o da loca��o ultrapassar 12 horas, a loca��o ser�
 *	cobrada com base em um valor di�rio. Al�m do valor da loca��o, � acrescido no
 *	pre�o o valor do imposto conforme regras do pa�s que, no caso do Brasil, � 20%
 * 	para valores at� 100.00, ou 15% para valores acima de 100.00. Fazer um
 *	programa que l� os dados da loca��o (modelo do carro, instante inicial e final da
 * 	loca��o), bem como o valor por hora e o valor di�rio de loca��o. O programa
 *	deve ent�o gerar a nota de pagamento (contendo valor da loca��o, valor do
 *	imposto e valor total do pagamento) e informar os dados na tela.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		
		System.out.println("Modelo do carro: ");
		Vehicle vehicle = new Vehicle(scan.nextLine());

		System.out.println("Retirada (dd/MM/yyyy hh:mm):");
		LocalDateTime start = LocalDateTime.parse(scan.nextLine(), dateFormatter);
		System.out.println("Retorno (dd/MM/yyyy hh:mm):");
		LocalDateTime finish = LocalDateTime.parse(scan.nextLine(), dateFormatter);

		CarRental carRental = new CarRental(start, finish, vehicle);
		
		System.out.println("Entre com o pre�o por hora:");
		double pricePerHour = scan.nextDouble();
		System.out.println("Entre com o pre�o por dia:");
		double pricePerDay = scan.nextDouble();
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(carRental);
		
		System.out.println("Pagamento basico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + carRental.getInvoice().getTax());
		System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().totalPayment()));
		
		scan.close();
	}
}
