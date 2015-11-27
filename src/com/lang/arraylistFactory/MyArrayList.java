package com.lang.arraylistFactory;

public class MyArrayList {//类似arraylist

	private Object[] myarraylist;// object类型数组
	private int size = 0;// 数组里存放对象数量

	public MyArrayList() {
		myarraylist = new Object[1];// 初始化object数据大小
	}

	public int size() {// 方便使用者查看对象数量的大小
		return size;
	}

	public void add(Object obj) {
		if (size == myarraylist.length) {// 数组扩容
			Object[] newlist = new Object[size * 2];
			for (int i = 0; i < myarraylist.length; i++) {
				newlist[i] = myarraylist[i];
			}
			myarraylist = newlist;
		}
		myarraylist[size++] = obj;

	}

	public int indexOf(Object a) {
		for (int i = 0; i < size; i++) {// 返回a对象所在位置索引
			if (a.equals(myarraylist[i])) {
				return i;
			}
		}
		return -1;
	}

	public Object get(int i) {
		if (i >= 0 && i < size) {// 判断其是否在范围类，
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
