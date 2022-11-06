package estruturacondicional.exercicios;

import java.util.Scanner;

/**
 *	Leia a hora inicial e a hora final de um jogo. 
 *	A seguir calcule a duração do jogo, sabendo que o mesmo pode
 *	começar em um dia e terminar em outro, 
 *	tendo uma duração mínima de 1 hora e máxima de 24 horas.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */
public class Exercicio4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int inicio, fim;
		
		System.out.println("Informe a hora incial: ");
		inicio = scan.nextInt();
		System.out.println("Informe a hora final: ");
		fim = scan.nextInt();
		
		int duracao;
		
		if(inicio < fim) {
			duracao = fim - inicio;
		}else {
			duracao = 24 - inicio + fim;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		scan.close();
	}
}
