/*
 * 	1. 저장 => 메모리 저장 구조
 * 	   1) MethodArea / StaticArea
 * 		  => 정적변수 (static) / 메서드 정보
 * 		  => 생성시점 : 컴파일러가 자동 메모리 저장
 * 		  => new 없이 사용가능 / 프로그램 종료시까지 유지
 * 		  => 접근 : 클래스명.변수명, 클래스명.메서드
 * 	   2) Stack
 * 		  => 지역변수 / 매개변수 저장
 * 		  => 생성, 소멸 : 메서드 호출시 / 메서드 종료시
 * 					   메모리에 의해 자동 해제
 * 		  => 사용자가 직접 초기화 한 후 사용
 * 		  => 사용 : {}안에서 사용 가능
 * 		  => 객체의 주소값을 저장 => Heap에서 데이터 읽기
 * 	   3) Heap
 * 		  => 객체의 실제 데이터 저장 / 실제 배열 데이터 저장
 * 		  => 생성, 소멸 : new 사용시 새로운 공간 생성 / 사용하지 않거나 null인 경우
 * 	2. 멤버변수
 * 	   -정적변수
 * 	   -인스턴스 변수
 * 	3. 4대 특성 : 이론 => 권장 사항
 * 	   캡슐화 / 포함(재사용) / 수정 => 오버라이딩
 * 	4. 상속 / 클래스의 종류 (추상 클래스, 인터페이스)
 * 	5. 예외처리
 * 	6. 라이브러리
 * 	   => java.lang : Object / String / StringBuffer
 * 					  Wrapper / Math
 * 	   => java.util : StringTokenizer / Collection
 * 					  => ArrayList / Map / Set
 * 	   => java.io : 메모리 / 파일 / 네트워크
 * 	   => java.net : 네트워크
 * 	   => java.sql : 데이터베이스
 * 	=> 콘솔 / 웹 (자바 동일) 
 * 	
 */
public class 생성자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
