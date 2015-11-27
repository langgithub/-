package com.lang.arraylistFactory;

public class MyArrayList {//����arraylist

	private Object[] myarraylist;// object��������
	private int size = 0;// �������Ŷ�������

	public MyArrayList() {
		myarraylist = new Object[1];// ��ʼ��object���ݴ�С
	}

	public int size() {// ����ʹ���߲鿴���������Ĵ�С
		return size;
	}

	public void add(Object obj) {
		if (size == myarraylist.length) {// ��������
			Object[] newlist = new Object[size * 2];
			for (int i = 0; i < myarraylist.length; i++) {
				newlist[i] = myarraylist[i];
			}
			myarraylist = newlist;
		}
		myarraylist[size++] = obj;

	}

	public int indexOf(Object a) {
		for (int i = 0; i < size; i++) {// ����a��������λ������
			if (a.equals(myarraylist[i])) {
				return i;
			}
		}
		return -1;
	}

	public Object get(int i) {
		if (i >= 0 && i < size) {// �ж����Ƿ��ڷ�Χ�࣬
			return myarraylist[i];
		} else {
			return new Exception();
		}
	}

	public static void main(String[] args) {
		MyArrayList myalist = new MyArrayList();
		myalist.add(new String("abc"));
		myalist.add(new String("45"));
		myalist.add(new String("20"));
		myalist.add(123);
		System.out.println(myalist.indexOf("20"));
		for (int i = 0; i < myalist.size; i++) {
			System.out.println(myalist.get(i));
		}
       
	}
}
