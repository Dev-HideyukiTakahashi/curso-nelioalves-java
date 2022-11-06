package estruturarepetitiva.exercicios;

import java.util.Scanner;

/**
 *	Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes.
 *	Escrevaum algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma:
 *	1.�lcool 2.Gasolina 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido 
 *	(fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). 
 *	O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
 *	mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel,
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class ExercicioWhile3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int alcool = 0, gasolina = 0, diesel = 0;
		
		int op = 0;
		
		while(op != 4){
			System.out.println("Qual a sua prefer�ncia? ");
			System.out.println("1.�lcool");
			System.out.println("2.Gasolina");
			System.out.println("3.Diesel");
			System.out.println("4.Fim");
			
			op = scan.nextInt();
			
			if(op < 1 || op > 4) {
				System.out.println("Informe um c�digo v�lido");
			}
			
			if(op == 1) {
				alcool ++;
			}else if(op == 2) {
				gasolina ++;
			}else if(op == 3) {
				diesel ++;
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("�lcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		scan.close();
	}
}
