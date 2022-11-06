package estruturacondicional.exercicios;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
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
		
		System.out.println("Informe os dois números: ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if( a % b == 0 || b % a == 0) {
			System.out.println("São Múltiplos");
		}else {
			System.out.println("Não são Múltiplos");
		}
		
		scan.close();
	}
}
