package aulas.trabalhandoComDatas.javaExerciciosDate;

import java.util.Date;

public class ExercicioDate {
	public static void main(String[] args) {
		Long currentTimeMillis = 787460400000L;
		// 15/12/1994

		Date birthDay = new Date(currentTimeMillis);

		Date referenceDate = new Date(1273892400000L);
		// 15/05/2010

		boolean isAfter = birthDay.after(referenceDate);

		String str = isAfter ? "is after" : "is before"; 
		System.out.println(birthDay + " " + str + " to " + referenceDate);
	}
}