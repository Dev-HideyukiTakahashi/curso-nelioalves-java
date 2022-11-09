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
 *	Uma locadora brasileira de carros cobra um valor por hora para locações de até
 *	12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será
 *	cobrada com base em um valor diário. Além do valor da locação, é acrescido no
 *	preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
 * 	para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um
 *	programa que lê os dados da locação (modelo do carro, instante inicial e final da
 * 	locação), bem como o valor por hora e o valor diário de locação. O programa
 *	deve então gerar a nota de pagamento (contendo valor da locação, valor do
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
		
		System.out.println("Entre com o preço por hora:");
		double pricePerHour = scan.nextDouble();
		System.out.println("Entre com o preço por dia:");
		double pricePerDay = scan.nextDouble();
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(carRental);
		
		System.out.println("Pagamento basico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + carRental.getInvoice().getTax());
		System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().totalPayment()));
		
		scan.close();
	}
}
