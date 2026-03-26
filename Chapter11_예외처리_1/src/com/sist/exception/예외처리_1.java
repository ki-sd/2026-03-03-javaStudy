package com.sist.exception;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 *     
 */
class MyException {
	public void aaa() {
		System.out.println("Method aaa call...");
	}
	public void bbb() {
		System.out.println("Method bbb call...");
	}
	public void ccc() {
		System.out.println("method ccc call...");
	}
}
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			Scanner sc=new Scanner(System.in);
//			System.out.print("입력:aaa,bbb,ccc>>");
//			String m=sc.next();
//			Class className=Class.forName("com.sist.exception.MyException");
//			Object obj=className.getDeclaredConstructor().newInstance();
//			Method[] methods=className.getDeclaredMethods();
//			for(Method mm:methods) {
//				if(mm.getName().equals(m)) {
//					mm.invoke(obj, null);
//				}
//			}
//		}catch(Exception ex) {}
		
		try {
			//Integer.parseInt("10 ");
			int a=10/0;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}

}
