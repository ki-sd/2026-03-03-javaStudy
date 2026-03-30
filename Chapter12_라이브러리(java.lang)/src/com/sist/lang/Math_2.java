package com.sist.lang;
import static java.lang.Math.*;
import static java.lang.String.*;
// 클래스명 없이 사용 가능 => static 메서드인 경우만 가능
// Math => only static이라 사용 편리
// ceil/random
// toString, hashCode, equals / clone / getClass
public class Math_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)ceil(10/3));
		System.out.println((int)(random()*100));
		System.out.println(valueOf(10));
	}

}
