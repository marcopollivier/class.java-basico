package aulas.trabalhandoComDatas.javaExerciciosDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ExercicioCalendar {
	public static void main(String[] args) {
		String date = readDate();
		Date validateDate = validateDate(date);

		try {
			Calendar calendar = dateToCalendar(validateDate);
			int countDays = countDaysToPay(calendar);
			System.out.println("You have " + countDays + " days to pay your card bill");
		} catch (Exception e) {
		}
	}

	public static String readDate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter with the due date in the format dd/MM/yyyy:");
		String date = scanner.nextLine();
		scanner.close();
		return date;
	}

	public static Date validateDate(String date) {
		Date dateValidated = null;
		try {
			String dateFormat = "dd/MM/yyyy";
			DateFormat df = new SimpleDateFormat(dateFormat);
			df.setLenient(false);
			dateValidated = df.parse(date);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid Pattern!");
		} catch (ParseException e) {
			System.out.println("Invalid Pattern! The pattern is dd/MM/yyyy");
		}
		return dateValidated;
	}

	public static Calendar dateToCalendar(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

	public static int countDaysToPay(Calendar calendar) {
		int countDaysToPay = 10;
		calendar.add(Calendar.DATE, countDaysToPay);

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		countDaysToPay += dayOfWeek == 1 ? 1 : 0;
		countDaysToPay += dayOfWeek == 7 ? 2 : 0;

		return countDaysToPay;
	}
}
