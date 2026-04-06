package com.sist.collection;
import java.util.*;
public class Collection_total_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=
				new ArrayList<String>(List.of("A","B","C","D","E"));
		ListIterator<String> it=list.listIterator();
		//순서
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("===== 역순 =====");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		// => 오라클에서 길제 데이터 => ASC/DESC
		// => 실제 자바
	}

}
