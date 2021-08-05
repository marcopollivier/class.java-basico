package aulas.trabalhandoComDatas.javaExerciciosDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioDataFormat {
	public static void main(String[] args) {
		Date date = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:mmm");

		String dateStr = simpleDateFormat.format(date);

		System.out.println(dateStr);
	}
}
