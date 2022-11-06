package estruturacondicional.exercicios;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
 * crescente ou decrescente
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */
public class Exercicio3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a, b;
		
		System.out.println("Informe os dois n�meros: ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if( a % b == 0 || b % a == 0) {
			System.out.println("S�o M�ltiplos");
		}else {
			System.out.println("N�o s�o M�ltiplos");
		}
		
		scan.close();
	}
}
