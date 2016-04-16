package com.lang.xmlsax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class StudentHandler extends DefaultHandler {

	private List<Student> stus=null;
	public List<Student> getStus() {
		return stus;
	}

	public void setStus(List<Student> stus) {
		this.stus = stus;
	}

	private Student stu=null;
	private String tag="";
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("处理文档开始");
		stus=new ArrayList<Student>();
		
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("开始处理第一元素");
		if(null!=qName){
			tag=qName;
		}
		if(null!=qName&&qName.equals("student")){
			stu=new Student();
		}
	}

	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		String str=new String(ch,start,length);
		if(tag!=null&&tag.equals("name")){
			stu.setName(str);
		}else if(tag!=null&&tag.equals("number")){
			Integer num=Integer.valueOf(str);
			stu.setNumber(num);
		}
		
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("结束处理第一元素");
		if(qName.equals("student")){
			this.stus.add(stu);
		}
		tag=null;
	}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("处理文档结束");
	}
	

}
