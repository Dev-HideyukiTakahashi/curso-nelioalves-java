package generics.intro;

import java.util.Scanner;

/**
 * 
 * Deseja-se fazer um programa que leia uma quantidade N, e depois N números
 * inteiros. Ao final, imprima esses números de forma organizada conforme
 * exemplo. Em seguida, informar qual foi o primeiro valor informado.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email  dev.hideyukitakahashi@gmail.com
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.println("How many values? ");
		int n = scan.nextInt();
		
		for(int i = 0;i <n; i++) {
			String value = scan.next();
			ps.addValue(value);
		}
		ps.print();
		System.out.println("First: " + ps.first());
		scan.close();
	}

}
