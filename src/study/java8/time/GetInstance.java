package study.java8.time;

import java.time.LocalDateTime;

public class GetInstance {

	public static void main(String[] args) {

		// 年月日時分秒を指定
		LocalDateTime d1 = LocalDateTime.of(2015, 12, 15, 23, 30, 59);
		// 年月日時分秒と1秒未満のナノ秒を指定
		LocalDateTime d2 = LocalDateTime.of(2015, 12, 15, 23, 30, 59, 999999999);

		System.out.println(d1);
		System.out.println(d2);

	}

}
