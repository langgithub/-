package com.lang.xmlsax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * sax����xml
 * @author lang
 *
 */
public class XmlSax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        XmlSax sa=new XmlSax();
        try {
			sa.xmlSax();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void xmlSax() throws ParserConfigurationException, SAXException, IOException{
		//1).��ȡ��������
		SAXParserFactory factory=SAXParserFactory.newInstance();
		//2).��ȡ��������������
	    SAXParser parse=factory.newSAXParser();
	    //3).�����ĵ�document ע�ᴦ����
	    //4).��д������
	    StudentHandler handler=new StudentHandler();
	    parse.parse(Thread.currentThread().getContextClassLoader()
	    		.getResourceAsStream("com/lang/xmlsax/students.xml"), handler);
	    
	    List<Student> list=handler.getStus();
        for (Student student : list) {
			System.out.println(student.getName());
		}

	}

}
