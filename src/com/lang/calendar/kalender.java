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
		System.out.print("���������ڣ���ʽΪ��2013-2-4��");
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

		c.set(c.DATE, 1);// �޸�ָ��ʱ������µĵ�һ��
		System.out.println(c.get(c.DAY_OF_WEEK));// �����һ��λ��һ�������е�����

		int maxdayofweek = c.getActualMaximum(c.DATE);// ָ��ʱ���������������
		System.out.println(maxdayofweek);
		System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
		for (int j = 1; j <= c.get(c.DAY_OF_WEEK) - 1; j++) {
			System.out.print("\t");// �ո��ӡ
		}
		for (int i = 1; i < maxdayofweek; i++) {
			System.out.print(i + "\t");
			int dow = c.get(c.DAY_OF_WEEK);
			if (dow == Calendar.SATURDAY) {// ��ǰʱ����һ���ڵĵڼ����Ƿ����7����ʵʱ����������
				System.out.println();
			}
			c.add(c.DATE, 1);// ���µ�ǰʱ��++
		}
	}


}
