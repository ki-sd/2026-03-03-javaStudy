package com.sist.collection;
/*
 *    CRUD
 *     => add, get, remove, set
 *     => 두개의 list에서 중복된 데이터 관리
 *       containsAll() => UNION 
 *       => JOIN
 *     => retainAll => 교집합 => INTERSECT
 *     -> addAll() => 전체 데이터 => UNIONALL
 *     => subList : 부분적 복사 (중복구매)
 */
import java.util.*;
public class Collection_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(8);
		list.add(7);
		list.add(9);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(6);
		System.out.println("===== 데이터 출력 =====");
		for(int i:list) {
			System.out.println(i);
		}
		System.out.println("===== 일부만 추출 =====");
		//ArrayList<Integer> list2=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>(list.subList(1,4));
		//start,end : end-1
		list2.add(10);
		list2.add(11);
		list2.add(12);
		for(int i:list2) {
			System.out.println(i);
		}
		
		// 정렬 ==> sort
		System.out.println("===== 정렬 =====");
		Collections.sort(list);
		for(int i:list) {
			System.out.println(i);
		}
		
		System.out.println("===== 같은 데이터 추출 =====");
		// retainAll
		list.retainAll(list2);
		for(int i:list) {
			System.out.println(i);
		}
		System.out.println("===== 전체복사 =====");
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.addAll(list);
		for(int i:list3) {
			System.out.println(i);
		}
		System.out.println("===== containAll =====");
		list.containsAll(list2);
		for(int i:list) {
			System.out.println(i);
		}
		
		/*
		 *   subList(int start,int end)
		 *           => start ~ end-1 (index)
		 *   => 페이지
		 *   
		 *   addAll() : list에 있는 모든 데이터 복사
		 *   retainAll() : 두개의 list의 공통 데이터 추출 (교집합)
		 *   Collection.sort(list) : 정렬
		 *   ----------------- 표준화 => 모든 개발자 동일
		 * 
		 */
	}

}
