package com.lang.arraylistFactory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
//hashmap效率高，线程不安全,hashtable线程安全
//数组加链表
//第一种map操作是用entry数组(查找效率不高)，第二种map操作使用linkedlist数组+hashcode
public class MyMap {

	Entry[] entry=new Entry[900];
	int size=0;
//	LinkedList[] arr=new LinkedList[900];优化后的map
	
	public void put(Object key,Object value){
		Entry node=new Entry(key,value);
		entry[size++]=node;
	}
	public Object get(Object key){
		for(int i=0;i<size;i++){
			if(entry[i].key==key){
				return entry[i].value;
			}
		}
		return null;
	}
	//优化后的map
	/*public void originPut(Object key,Object value){
		Entry node=new Entry(key,value);
		int a=key.hashCode()%900;
		if(arr[a]==null){
			LinkedList<Object> list=new LinkedList<Object>();
			arr[a]=list;
			list.add(node);
		}else{
			LinkedList<Object> list=arr[a];
			list.add(node);
		    arr[a]=list;
		}
	}
	public Object originGet(Object key){
		int a=key.hashCode()%900;
		LinkedList list=arr[a]; 
		//获取链表中第一个值
		for(int i=0;i<list.size();i++){
			if(((Entry)list.get(i)).key==key){
				return ((Entry)list.get(i)).value;
			}
		}
		
		//获取链表中最后一个entry对象
		if(((Entry)list.get(list.size()-1)).key==key){
		
			return ((Entry)list.get(list.size()-1)).value;
		}
		return null;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyMap map=new MyMap();
       map.put("中国", "北京");
      map.put("中国","四川");
      System.out.println(map.get("中国"));
     /* map.originPut("中国", "北京");优化中的map
      map.originPut("中国","四川");
      System.out.println(map.originGet("中国"));*/
	}
	
	
    class Entry{
    	Object key;
    	Object value;
    	
		public Entry(Object key, Object value) {
			super();
			this.key = key;
			this.value = value;
		}
		public Object getKey() {
			return key;
		}
		public void setKey(Object key) {
			this.key = key;
		}
		public Object getValue() {
			return value;
		}
		public void setValue(Object value) {
			this.value = value;
		}
    }

}
