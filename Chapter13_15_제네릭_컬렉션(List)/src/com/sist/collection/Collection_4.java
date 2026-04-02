package com.sist.collection;
/*
 *    제네릭 (13장)
 *    -----------
 *    1. 정의
 *       = 클래스나 메서드를 정의 할때 사용할 데이터형을 표준화해서 사용
 *       = 데이터형의 안정성, 가독성
 *       ArrayList<String> list=new ArrayList<String>()
 *       list.add("홍길동");
 *       = 재사용성
 *       = 데이터형을 통일화 시킨다
 *       = 소스가 간결해짐 => 형변환없이 사용 가능 => 가독성
 *    2. 사용법
 *       <클래스만 사용 가능>
 *       ------
 *       <int> <double> (x)
 *       <Integer> <Double> => Wrapper
 *    3. 메서드 (매개변수,리턴형) ,변수 => 전체가 한번에 변경
 */
import java.util.*;
/*
 *   Box box=new Box() => T:Object
 *   Boc<String> => T:String
 */
class Box<T> {
	T t;
	public void setT(T t) {
		this.t=t;
	}
	public T getT() {
		return t;
	}
}
public class Collection_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box();
		Box<String> box1=new Box<String>();
		/*
		 *     T : Type(클래스형)
		 *     E : Element
		 *     ----------------
		 *     K : Key
		 *     V : Value
		 *     ---------------- Map<String(K),String(V)>
		 *     
		 *     Object => 프로그램에 필요한 데이터형으로 변환
		 *     
		 *     1차 : 문법 / 라이브러리
		 *     2차 : 오라클 연동 (JDBC)
		 *     3차 : 웹 연동 (JSP)
		 *     4차 : 스프링 / 부트
		 */
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		ArrayList<Map<Integer,String>> list=new ArrayList<Map<Integer,String>>();
		map.put(1, "a");
		map.put(2, "b");
		list.add(map);
		for(Map<Integer,String> m:list) {
			System.out.println(m);
		}
		HashMap<Integer,ArrayList<String>> map2=new HashMap<Integer,ArrayList<String>>();
		ArrayList<String> list2=new ArrayList<String>();
		ArrayList<String> list3=new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list3.add("d");
		list3.add("e");
		list3.add("f");
		map2.put(1, list2);
		map2.put(2, list3);
		map2.forEach((key,list4)->{
			System.out.println(key+String.join(", ", list4));
		});
	}

}
