package com.yaojialiu.util;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class StreamUtil {
	//����1�������ر����������ܴ����޸�,���紫��FileInputStream����JDBC��Connection���󶼿��Թرա�
	//ʾ��:
	public static void closeAll(Closeable closeables) throws IOException {
	//TODO
		if(closeables!=null) {
			closeables.close();
		}
	}

	/*����2������������InputStream������OutputStream���������ڿ��ٶ����ļ����ϴ����أ�Ϊ��������ܣ���Ҫʹ�û��塣
	����1��������
	����2�������
	����3��������ɺ��Ƿ�ر�������
	����4��������ɺ��Ƿ�ر������*/
	//ʾ��:
	public static void copy(InputStream src, OutputStream out, boolean isCloseInputStream, boolean isCloseOutputStream)  throws IOException{
	//TODO
		src.read();
		byte[] b = new byte[2024];
		out.write(b);
		if(isCloseInputStream) {
			src.close();
		}
		if(isCloseOutputStream) {
			out.close();
		}
	}


	//����3������һ���ı��ļ�����Ĭ��ΪUTF-8���룬���ظ��ļ����ݣ�Ҫ�󷽷��ڲ����������2���������������������1�������ر���
	//ʾ��:
	public static String readTextFile(InputStream src) throws IOException{
	//TODO
		return "";
	}

	//����4�������ı��ļ����󣬷��ظ��ļ�����(3��)������Ҫ���ڲ����������3������
	//ʾ��:
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
	//TODO
		
		return "";
		
	}

	/**
	* ����5���ӿ���̨��ȡ�û�������ַ����� 
	* ����message�����ڿ���̨��ʾ�����硰�������������������Ȼ���û�����������س���* ������ʼִ�в���ȡ������
	 * @throws FileNotFoundException 
	*/
	public static String readStringFromSystemIn(String message) throws FileNotFoundException{
	//TODO
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		String name = sc.next();
		InputStream is = new FileInputStream(name);
		return name;
	}

	/**
	* ����6���ӿ���̨��ȡ�û���������֡� 
	* ����message�����ڿ���̨��ʾ�����硰������������䣺����Ȼ���û����������س���* ������ʼִ�в���ȡ���䣬����û�����Ĳ������֣����ǿ�ֵ��ֱ�ӻس������������ʾ���롣
	 * @throws FileNotFoundException 
	*/
	public static void readIntFromSystemIn(String message) throws FileNotFoundException{
	//TODO
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		String age = sc.next();
		if(age!=null) {
			InputStream is = new FileInputStream(age);
		}
	}

}
