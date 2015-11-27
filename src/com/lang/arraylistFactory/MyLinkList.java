package com.lang.arraylistFactory;

public class MyLinkList {//链表操作

	private Node first;
	private Node last;
	private int size;// 链表长度

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void add(Object obj) {//链表添加节点
		if (first == null) {
			Node node = new Node();
			node.setPrivious(null);
			node.setData(obj);
			node.setNext(null);
			first = node;
			last = node;

		} else {
			Node node = new Node();
			node.setPrivious(first.next);
			node.setData(obj);
			node.setNext(null);
			last = node;
		}
		size++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkList mylinklist = new MyLinkList();
		mylinklist.add("aaa00");
		mylinklist.add("bbll");
		System.out.println(mylinklist.getFirst().getData());
		System.out.println(mylinklist.getLast() == mylinklist.getFirst());

	}

	class Node {
		private Object data;
		private Object privious;
		private Object next;

		public Node() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Node(Object data, Object privious, Object next) {
			super();
			this.data = data;
			this.privious = privious;
			this.next = next;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public Object getPrivious() {
			return privious;
		}

		public void setPrivious(Object privious) {
			this.privious = privious;
		}

		public Object getNext() {
			return next;
		}

		public void setNext(Object next) {
			this.next = next;
		}

	}
}
