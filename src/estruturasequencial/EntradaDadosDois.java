package estruturasequencial;

import java.util.Scanner;

public class EntradaDadosDois {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		String s1,s2,s3;
		
		
		System.out.println("Digite um número: ");
		x = scan.nextInt();
		
		/*
		 * Para valores não String fica uma linha pendente no código
		 * Uma solução é quebrar essa linha
		 */
		scan.nextLine();
		
		
		System.out.println("Digite a primeira frase: ");
		s1 = scan.nextLine();
		System.out.println("Digite a segunda frase: ");
		s2 = scan.nextLine();
		System.out.println("Digite a terceira frase: ");
		s3 = scan.nextLine();
		
		System.out.println("-------------------------");
		
		System.out.println("Número: " + x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
