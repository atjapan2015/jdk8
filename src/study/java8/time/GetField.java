package study.java8.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

/**
 * 日時オブジェクトから特定のフィールド値を取得する。 Calendar.get()に相当。
 *
 * @author oracle
 *
 */
public class GetField {

	public static void main(String[] args) {

		LocalDateTime d = LocalDateTime.now();

		System.out.println(d.getYear());
		System.out.println(d.getMonthValue());
		System.out.println(d.getDayOfMonth());
		System.out.println(d.getHour());
		System.out.println(d.getMinute());
		System.out.println(d.getSecond());
		System.out.println(d.getNano());
		System.out.println(d.get(ChronoField.YEAR));

	}

}
