package com.sist.collection;
/*
 *    1. 컬렉션이란?
 *       ---- 데이터(값)를 담아두는 상자(메모리)들의 모음
 *       예) 친구 이름 / 전화번호 / 맛집정보...
 *       => 쉽게 관리하기 위해 만들어 준 것
 *         (컬렉션 프레임워크)
 *               --------> 표준화 (통일화)
 *               --------> 기본 틀
 *    2. 사용하는 이유
 *       = 배열
 *         1) 크기 고정 (늘리기,줄이기 => 어려움) 고정적
 *            일반 목록 출력은 좋으나 검색이 어려움
 *         2) 기능 부족 (정렬 / 검색 직접 구현)
 *       = 배열 보완 (단점)
 *         1) 크기 자동 조절
 *         2) 정렬, 검색 기능 제공
 *         3) 모든 개발자가 동일하게 사용 (소스) => 표준화
 *    3. 컬렉션 종류
 *          Collection --- interface
 *              |
 *    -------------------
 *    |        |        |
 *   List     Set      Map --- interface
 *                      |
 *                  ---------
 *                  |       |
 *               HashTable  **HashMap   
 *             |
 *        ----------
 *        |        |
 *     **HashSet  TreeSet
 *    |구현된 클래스
 *   ---------------
 *   |      |      |
 *            LinkedList => Queue
 *       Vector
 *  **ArrayList
 *  
 *  ==> 기준점
 *      List : 순서가 있음 (추가시마다 자동으로 인덱스번호 부여)
 *             데이터 중복을 허용
 *             대표적 : ArrayList
 *      Set  : 순서는 없고, 데이터 중복을 허용하지 않음
 *             대표적 : HashSet
 *             => DISTINCT => 중복제거
 *      Map  : 목차 => 키,값 => 동시에 저장
 *             대표적 : HashMap
 *              => 클래스 관리, SQL
 *              => Spring / MyBatis
 *     --------------------------------------
 *     List 순서 O, 중복 O => 목록,전화번호...
 *     --------------------------------------
 *     Set  순서 X, 중복 X => 로또번호, 수험번호, 파일...
 *     --------------------------------------
 *     Map  key-value   => 전화번호...
 *     --------------------------------------
 *     
 *     => 데이터를 편하게 저장해서 관리하기 위한 목적 (표준화)
 *     => 프로그램에서 가장 중요한 것
 *        변수  : 데이터 관리
 *        --------------- React / Vue : 증권
 *        
 *     List
 *       사용처 : 순차적으로 데이터 저장
 *              인덱스 통해 접근 필요한 경우
 *              ---- 게시판/예약정보/장바구니
 *       구현된 클래스
 *        ArrayList : 데이터베이스 (웹 핵심)
 *                    => 비동기
 *        Vector : 네트워크 => 접속자관리
 *                   => 동기화
 *        LinkedList : 파일 관리 => C계열
 *        
 *      -------------------------------------------
 *      ArrayList
 *          배열 기반/검색속도 ↑
 *          순차적으로 저장/조회 위주/접근 속도 ↑
 *          => 추가/삭제 속도 ↓
 *      -------------------------------------------
 *      Vector
 *          동기화 : 멀티쓰레드 (네트워크, 게임)
 *          Vector 보완 => ArrayList
 *      -------------------------------------------
 *      LinkedList
 *          노드 기반/ 추가/삭제 속도 ↑
 *          파일 기반 => 접근속도 ↓
 *          => 추가/수정이 많은경우 사용
 *      -------------------------------------------
 *      
 *      회원 관리 시스템
 *        회원 ID 저장  ====> Set
 *        회원 정보 저장 ====> Map
 *      게시판
 *        목록 =====> ArrayList
 *        댓글 =====> LinkedList
 *      검색엔진 : HashMap
 *      랭크 시스템 : TreeSet => 자동 정렬
 *    
 */
// ArrayList
import java.util.*;
public class Collection_1 {
/*
 *    순서를 갖고 있음 (추가시마다 => 자동 인덱스) => 배열기반
 *    // 인덱스번호는 0~
 *    저장된 데이터 중복 허용
 *    메모리상 저장 => CRUD
 *    비동기적 => 데이터베이스 연결 => 최적화
 *    주요기능
 *      추가 : add(데이터) : 맨뒤에 추가 ***
 *            add(int index,데이터) : 지정된 위치에 추가
 *            항상 순차적 => for문 사용 용이
 *      삭제 : remove(int index)
 *           0 1 2 3 4 5
 *               -
 *               2 3 4
 *      수정 : set(int index,변경될 데이터)
 *      읽기 : get(int index)
 *      갯수 : size()
 *      전체삭제: clear()
 *      데이터존재여부: isEmpty()
 *      => List에 존재 (List 공유)
 *      
 *      주 사용처
 *        오라클 데이터 읽기 => 브라우저에 전송
 *        쿠키 읽기 => 브라우저에 전송
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장공간 생성
		ArrayList<String> list=new ArrayList<String>();
		// 추가
		list.add("홍길동"); //0
		list.add("심청이"); //1
		list.add("박문수"); //2
		list.add("춘향이"); //3
		list.add("이순신"); //4
		// 저장된 데이터 출력
		for(int i=0;i<list.size();i++) {
			System.out.println("["+i+"]"+list.get(i));
		}
		// 저장
		System.out.println("==== 지정된 위치에 저장 ====");
		list.add(2,"김두한");
		// 저장된 데이터 출력
		for(int i=0;i<list.size();i++) {
			System.out.println("["+i+"]"+list.get(i));
		}
		// 삭제
		System.out.println("==== 데이터 삭제 ====");
		list.remove(3);
		for(int i=0;i<list.size();i++) {
			System.out.println("["+i+"]"+list.get(i));
		}
		// 수정
		System.out.println("==== 데이터 수정 ====");
		list.set(2,"강감찬");
		for(int i=0;i<list.size();i++) {
			System.out.println("["+i+"]"+list.get(i));
		}
		// 리스트 사이즈
		System.out.println("==== 리스트 사이즈 ====");
		System.out.println(list.size()+"명");
		// 리스트 삭제
		System.out.println("==== 리스트 삭제 ====");
		list.clear();
		System.out.println(list.isEmpty());
	}

}
