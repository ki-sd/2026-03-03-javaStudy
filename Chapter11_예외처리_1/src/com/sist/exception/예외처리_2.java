package com.sist.exception;

import java.io.*;

public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in=null;
		try {
			in=new FileReader("C:\\Users\\sist8\\git\\javaStudy\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java");
			int i=0;
			while((i=in.read())!=-1) {
				int k=i/0;
				System.out.print((char)i);
			}
		}catch(IOException | ArithmeticException e) {
			e.printStackTrace(); // 에러위치확인
		}
		finally { //생략가능
			try {
			in.close();
			}catch(Exception e) {}
		}
		/*
		 *     try-resource : 자동 닫기
		 *     throws
		 *     throw
		 *     사용자 정의
		 */
	}

}
