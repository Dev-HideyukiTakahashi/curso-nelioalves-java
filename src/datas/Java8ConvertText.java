package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Java8ConvertText {
	public static void main(String[] args) {
		
		LocalDate	  d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant 	  d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Para LocalDate
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Para LocalDate, LocalDateTime
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Para Instant (necessário o timezone)
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // Para LocalDateTime, imprime no formato ISO (Horário Local)
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // Para Instant, imprime no formato ISO (Horário Global)
		
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d01 = " + fmt1.format(d01));
		
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d02 = " + d02.format(fmt1)); // Consegue imprimir omitindo o horário
		System.out.println("d02 = " + fmt1.format(d02)); // Consegue imprimir omitindo o horário
		System.out.println("d02 = " + fmt2.format(d02));
		
		System.out.println("d03 = " + fmt3.format(d03)); // Calcula 3 horas a menos, pois o zoneId está local (Brasil-SP) GMT-3
		// System.out.println("d03 = " + d03.format(fmt3)); // O Instant não tem o método format, esse código não funciona
		
		System.out.println("d02 = " + d02.format(fmt4)); 
		System.out.println("d03 = " + fmt5.format(d03)); 
		
		/* OUTPUT
		 	d01 = 20/07/2022
			d01 = 20/07/2022
			d02 = 20/07/2022 01:30
			d02 = 20/07/2022
			d02 = 20/07/2022
			d02 = 20/07/2022 01:30
			d03 = 19/07/2022 22:30
			d02 = 2022-07-20T01:30:26
			d03 = 2022-07-20T01:30:26Z
		 */
	}
}
