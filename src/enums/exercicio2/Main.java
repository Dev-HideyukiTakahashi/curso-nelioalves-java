package enums.exercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois,
 * mostrar um sumário do pedido
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Name: ");
		String name = scan.nextLine();
		System.out.println("Email: ");
		String email = scan.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(scan.nextLine(), dateFormatter);
		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(scan.nextLine());
		Order order = new Order(LocalDate.now(), status, client);

		System.out.println("How many items to this order? ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.println("Product name: ");
			scan.nextLine();
			String nameProduct = scan.nextLine();
			System.out.println("Product price: ");
			double price = scan.nextDouble();
			System.out.println("Quantity: ");
			int quantity = scan.nextInt();
			
			Product product = new Product(nameProduct, price);
			OrderItem orderItem = new OrderItem(quantity, price, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + dateFormatter.format(order.getMoment()));
		System.out.println("Order Status: " + order.getStatus());
		System.out.println("Client: " + order.getClient().getName() + " (" + 
				dateFormatter.format(order.getClient().getBirthDate()) + ") - " + order.getClient().getEmail());
		System.out.println("Order items:");
		for (OrderItem item : order.getItems()) {
			System.out.println(item.getProduct().getName() + ", $" + String.format("%.2f", item.getPrice()) + ", Quantity: " +
					item.getQuantity() + ", Subtotal: $ " + String.format("%.2f", item.subTotal()));
		}
		
		System.out.println("Total price: $" + String.format("%.2f", order.total()));
	}
}
