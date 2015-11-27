package com.lang.arraylistFactory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
//hashmapЧ�ʸߣ��̲߳���ȫ,hashtable�̰߳�ȫ
//���������
//��һ��map��������entry����(����Ч�ʲ���)���ڶ���map����ʹ��linkedlist����+hashcode
public class MyMap {

	Entry[] entry=new Entry[900];
	int size=0;
//	LinkedList[] arr=new LinkedList[900];�Ż����map
	
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
	//�Ż����map
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
		//��ȡ�����е�һ��ֵ
		for(int i=0;i<list.size();i++){
			if(((Entry)list.get(i)).key==key){
				return ((Entry)list.get(i)).value;
			}
		}
		
		//��ȡ���������һ��entry����
		if(((Entry)list.get(list.size()-1)).key==key){
		
			return ((Entry)list.get(list.size()-1)).value;
		}
		return null;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyMap map=new MyMap();
       map.put("�й�", "����");
      map.put("�й�","�Ĵ�");
      System.out.println(map.get("�й�"));
     /* map.originPut("�й�", "����");�Ż��е�map
      map.originPut("�й�","�Ĵ�");
      System.out.println(map.originGet("�й�"));*/
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
