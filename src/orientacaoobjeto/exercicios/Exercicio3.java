package orientacaoobjeto.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *	Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos 
 *	tr�s trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). 
 *	Ao final, mostrar qual a nota final do aluno no ano. Dizer tamb�m se o aluno est� aprovado
 *	(PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o m�nimo 
 *	para ser aprovado (que � 60% da nota). 
 *	Voc� deve criar uma classe Student para resolver este problema.
 * 
 * @author Hideyuki Takahashi
 * @github https://github.com/Dev-HideyukiTakahashi
 * @email dev.hideyukitakahashi@gmail.com
 */

public class Exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		StudentExercicio3 student = new StudentExercicio3();
		
		System.out.println("Informe o nome: ");
		student.setName(scan.nextLine());
		System.out.println("Informe a nota 1: ");
		student.setN1(scan.nextDouble());
		System.out.println("Informe a nota 2: ");
		student.setN2(scan.nextDouble());
		System.out.println("Informe a nota 3: ");
		student.setN3(scan.nextDouble());
		
		student.result();
		scan.close();
	}
}
