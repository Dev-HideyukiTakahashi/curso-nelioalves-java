package enums.exercicio1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
 *	do usuário um mês e mostrar qual foi o salário do funcionário nesse mês,
 *
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter department's name: ");
		Department department = new Department(scan.nextLine());
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String name = scan.nextLine();
		System.out.println("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(scan.nextLine());
		System.out.println("Base salary: ");
		double baseSalary = scan.nextDouble();
		Worker worker = new Worker(name, level, baseSalary, department);
		
		System.out.println("How many contracts to this worker? ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter contract #" + (i+1) + " data:");
			System.out.println("Date (dd/mm/yyyy): ");
			scan.nextLine();
			LocalDate date = LocalDate.parse(scan.nextLine(), dateFormat);
			System.out.println("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			System.out.println("Duration: ");
			int duration = scan.nextInt();
			
			HourContract contract = new HourContract(date, valuePerHour, duration);
			worker.addContract(contract);
		}
		
		System.out.println("Enther month and year to calculate income (MM/YYYY) ");
		scan.nextLine();
		String monthYear = scan.nextLine();
		int month = Integer.parseInt(monthYear.substring(0,2));
		int year = Integer.parseInt(monthYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + month + "/" + year + ": " + 
					String.format("%.2f", worker.income(month, year)));
		
	}

}
