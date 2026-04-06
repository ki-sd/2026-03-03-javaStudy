package com.sist.collection;
/*
 *             Collection (데이터 모음) => 관리가 쉽게 만든 라이브러리
 *                 |                   ---------- 표준화
 *        --------------------------
 *        |            |           |
 *      List          Set         Map
 *      ----------------- Iterator
 *      ---- ListIterator
 *      
 *      List: ArrayList / Vector
 *            | 데이터베이스  | 네트워크 저장
 *      Set: HashSet / TreeSet
 *           |쿠키/세션
 *      Map: HashMap
 *           | 웹 => 라이브러리 / Spring,MyBatis
 *           
 *      => 주요 메서드 : 웹
 *         List : add() / size() / get() / isEmpty()
 *                => for-each
 *          Set : add() / size() / isEmpty()
 *          Map : put() / size() / get() / isEmpty()
 *          
 *     Iterator : hasNext() / next()
 *           => 출력 전용
 * ListIterator : hasNext() / next()
 *           => List 출력
 *      => 반드시 제네릭 이용해 데이터형 통일
 *         <클래스형>
 *         ------- 기본데이터형 : Wrapper
 */
public class Collection_total_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
