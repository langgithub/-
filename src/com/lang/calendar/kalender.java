package com.lang.calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class kalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCalendar();
	}

	@SuppressWarnings("static-access")
	public static void getCalendar() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("请输入日期（格式为：2013-2-4）");
		String dat = input.nextLine();

		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = null;
		try {
			dt = format.parse(dat);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		// System.out.println(c.getTime());

		c.set(c.DATE, 1);// 修改指定时间里的月的第一天
		System.out.println(c.get(c.DAY_OF_WEEK));// 算出第一天位于一个星期中的那天

		int maxdayofweek = c.getActualMaximum(c.DATE);// 指定时间里该月最大的天数
		System.out.println(maxdayofweek);
		System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		for (int j = 1; j <= c.get(c.DAY_OF_WEEK) - 1; j++) {
			System.out.print("\t");// 空格打印
		}
		for (int i = 1; i < maxdayofweek; i++) {
			System.out.print(i + "\t");
			int dow = c.get(c.DAY_OF_WEEK);
			if (dow == Calendar.SATURDAY) {// 当前时间在一星期的第几天是否等于7（现实时间星期六）
				System.out.println();
			}
			c.add(c.DATE, 1);// 该月当前时间++
		}
	}


}
