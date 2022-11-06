package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Java8ConvertGlobalToLocal {
	public static void main(String[] args) {
		
		// Data-hora global, timezone (sistema local) ➞ Data-hora local
		
		LocalDate	  d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant 	  d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); // ZoneId local, no caso Brasil-SP (GMT-3)
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1); // imprime 3 horas antes, portanto dia 19

		System.out.println("r3 = " + r3);  
		System.out.println("r4 = " + r4); // imprime 1 hora a mais, Portugal (GMT+1)
		
		// Data-hora local ➞ dia, mês, ano, horário
		
		System.out.println("d01 dia = " + d01.getDayOfMonth());
		System.out.println("d01 mês = " + d01.getMonthValue());
		System.out.println("d01 ano = " + d01.getYear());
		
		System.out.println("d02 hora = " + d02.getHour());
		System.out.println("d02 minutos = " + d02.getMinute());
		System.out.println("d02 hora = " + d02.getHour());
		
		
		/* OUTPUT
		 	r1 = 2022-07-19
			r3 = 2022-07-19T22:30:26
			r4 = 2022-07-20T02:30:26
			d01 dia = 20
			d01 mês = 7
			d01 ano = 2022
			d02 hora = 1
			d02 minutos = 30
			d02 hora = 1
		 */
	}
}
