package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosUm {
	
	public static void main(String[] args) {
		
		//Configurando locale dos Estados Unidos para aceitar 'ponto' e nao 'v�rgula'
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		double x;
		int y;
		
		System.out.print("Digite um n�mero: ");
		y = scan.nextInt();
		
		System.out.print("Digite um n�mero: ");
		x = scan.nextDouble();
		
		System.out.println("Voc� digitou: " + y);
		System.out.printf("Voc� digitou: %.2f",  x);
		
		System.out.println("\n--------------------------------");
		
		char c;
		System.out.print("Digite uma palavra: ");
		c = scan.next().charAt(0);
		System.out.println("A primeira letra � : " + c);
		
		scan.close();
	}

}
