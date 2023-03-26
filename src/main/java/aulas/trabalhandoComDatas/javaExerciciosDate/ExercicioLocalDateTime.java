package aulas.trabalhandoComDatas.javaExerciciosDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExercicioLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.of(2010, 5, 15, 10, 0, 0);

		LocalDateTime future = localDateTime.plusYears(4).plusMonths(6).plusHours(13);

		System.out.println(format(localDateTime));

		System.out.println(format(future));
	}

	public static String format(LocalDateTime localDateTime) {
		return localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
}
