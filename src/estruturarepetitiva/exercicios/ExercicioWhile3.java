package estruturarepetitiva.exercicios;

import java.util.Scanner;

/**
 *	Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
 *	Escrevaum algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
 *	1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido 
 *	(fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
 *	O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
 *	mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível,
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
			System.out.println("Qual a sua preferência? ");
			System.out.println("1.Álcool");
			System.out.println("2.Gasolina");
			System.out.println("3.Diesel");
			System.out.println("4.Fim");
			
			op = scan.nextInt();
			
			if(op < 1 || op > 4) {
				System.out.println("Informe um código válido");
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
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		scan.close();
	}
}
