package arraylist.exercicios;
import java.util.Scanner;

/**
 * 
 *	A dona de um pensionato possui dez quartos para alugar para estudantes,
 *	sendo esses quartos identificados pelos números 0 a 9.
 *	Fazer um programa que inicie com todos os dez quartos vazios, e depois
 *	leia uma quantidade N representando o número de estudantes que vão
 *	alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
 *	N estudantes. Para cada registro de aluguel, informar o nome e email do
 *	estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
 *	que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
 *	um relatório de todas ocupações do pensionato, por ordem de quarto.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */

public class ExercicioVetor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		VetorRooms[] rooms = new VetorRooms[10];
		
		System.out.println("How many rooms will be rented? ");
		int n = scan.nextInt();
		
		for(int i = 0 ; i < n; i++) {
			scan.nextLine();
			System.out.println("Rent #" + (i + 1));
			System.out.println("Name: ");
			String name = scan.nextLine();
			System.out.println("Email: ");
			String email = scan.nextLine();
			System.out.println("Room: ");
			int room = scan.nextInt();
			
			rooms[room] = new VetorRooms(room, name, email);
		} 
		
		System.out.println("Busy rooms:");
		for (VetorRooms r : rooms) {
			if(r != null) {
				System.out.println(r.getNumber() + ": " + r.getName() + ", " + r.getEmail());
			}
		}
	}
}
