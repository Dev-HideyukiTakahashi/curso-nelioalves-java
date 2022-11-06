package datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Java8Calculos {
	public static void main(String[] args) {
		
		// Data-hora +/- tempo ➞ Data-hora
		
		LocalDate	  d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant 	  d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d01.minusWeeks(1); // subtrai 1 semana
		LocalDate nextWeekLocalDate = d01.plusWeeks(1); // acrescenta 1 semana
		LocalDate nextYear = d01.plusYears(10); // acrescenta 10 anos
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("nextYear = " + nextYear);
		
		LocalDateTime pastWeekLocalDateTime = d02.minusWeeks(1); // subtrai 1 semana
		LocalDateTime pastHour = d02.minusHours(5); // subtrai 5 horas 
		LocalDateTime plusMinutes = d02.plusMinutes(20); // acrescenta 20 minutos
		
		System.out.println("pastHour = " + pastHour);
		System.out.println("plusMinutes = " + plusMinutes);
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS); // subtrai 7 dias
		Instant plusYearInstant = d03.plus(50, ChronoUnit.DAYS); // acrescenta 50 dias
		Instant pastHourInstant = d03.plus(10, ChronoUnit.HOURS); // acrescenta 10 horas
		 
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("plusYearInstant = " + plusYearInstant);
		System.out.println("pastHourInstant = " + pastHourInstant);
		
		
		/* OUTPUT
			pastWeekLocalDate = 2022-07-13
			nextWeekLocalDate = 2022-07-27
			nextYear = 2032-07-20
			pastHour = 2022-07-19T20:30:26
			plusMinutes = 2022-07-20T01:50:26
			pastWeekInstant = 2022-07-13T01:30:26Z
			plusYearInstant = 2022-09-08T01:30:26Z
			pastHourInstant = 2022-07-20T11:30:26Z
		 */
		
		// Data-hora 1, Data-hora 2 ➞ Duração - OBS: Apenas LocalDateTime
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay()); // Converte para LocalDateTime no começo do dia (00:00)
		Duration t3 = Duration.between(pastWeekInstant, d03);
		
		System.out.println("t1 = " +t1.toDays()); // Diferença em dias entre as datas
		System.out.println("t1 = " +t1.toHours()); // Diferença em horas entre as datas
		
		System.out.println("t2 = " +t2.toDays()); // LocalDate foi convertido para LocalDateTime
		
		System.out.println("t3 = " +t3.toDays()); 
		
		/* OUTPUT
			t1 = 7
			t1 = 168
			t2 = 7
			t3 = 7
	 */
		
	}
}
