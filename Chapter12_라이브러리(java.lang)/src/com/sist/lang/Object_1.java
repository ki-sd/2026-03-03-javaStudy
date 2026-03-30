package com.sist.lang;
/*
 *   자바에서 지원하는 클래스 집합 
 *   =라이브러리
 *    1) 자바 자체지원
 *    2) 외부 라이브러리 => 자바 개발업체/오픈소스
 *       => mvnrepository.com
 *       => spring..
 *    ----------------------- + 사용자 클래스 => 조립
 *    = java.lang
 *      => 자바에서 많이 사용되는 클래스의 집합
 *      => import 생략가능
 *      => Object : 모든 클래스의 상속내리는 최상위 클래스
 *         => extends Object
 *         => 모든 데이터형 / 모든 클래스를 관리 가능
 *         => 라이브러리 지원 메서드: 리턴형, 매개변수 Object
 *                            => 제네릭
 *         => 주요 매서드
 *           1. finalize() : 소멸(객체) => 자동 호출
 *           2. clone() : 복제 => 값이 있는 그대로 복사
 *                        새로운 메모리에 저장
 *           3. equals() : 객체비교
 *           4. hashCode() : 객체마다의 고유 식별자
 *           5. getClass() : 리플렉션 => 객체정보얻기
 *      => String : 문자열 관리 클래스
 *      => StringBuffer / StringBuilder
 *      => Math : 수학관련
 *      => System : 입출력 / 가비지컬랙션>
 *      => Wrapper : 데이터형 쉽게 관리 => 클래스
 *         Int => Integer, double => Double....
 *      => Thread : 동시성 => 네트워크 => 앱개발
 *                  웹 : Ajax => Vue / React
 *                      Axios
 *    = java.util
 *       = Date / Calender / Time
 *       = StringTokenizer
 *       = Scanner
 *       = List/Set/Map
 *    = java.text
 *       = DecimalFormat => 1,000
 *       = SimpleDateFormat => 2026-03-30
 *       = Choice Format => switch 대체
 *       = MessageFormat => 츨력형식 => 출력(SQL)
 *    = java.net
 *       = 네트워크
 *       = URL/Socket/ServerSocket
 *    = java.io
 *       = File관련
 *    = java.sql
 *       = 데이터베이스
 *       = Connection/Statement/ResultSet
 *       
 *    ---------------------- javax(jakarta)
 *                           웹서버: ~tomcat9 => javax
 *                                 tomcat10~ => jakarta
 *                                 
 *   1. 람다: 함수포인터 => 소스 간결하게 만들때 사용
 *      람다스트림 16,17
 *      => JWT / Spring 보안
 *      => 데이터베이스를 간단하게 출력
 *   2. 제네릭: 데이터형 통일화 => 형변환없이 사용 쉽게
 *      => 컬렉션 => 클래스를 모아서 관리 => Object
 *   3. 어노테이션 : 인덱스 => 검색
 *      => 메서드/클래스/멤버변수
 *      => Spring
 *   4. 리플렉션 : new없이 클래스명으로 메모리 할당
 *      => Spring
 *   5. 정규식 : 크롤링 (검색) => 패턴으로 문자열을 찾는 경우
 *      ----------------------------------------
 *      파일 => txt,csv,json
 *                    ----- 자바에서 데이터 모아서 => Vue/React
 *                    
 *  1권 : 문법
 *       변수/연산자/제아문
 *       메서드
 *       클래스
 *       클래스 생성 : 객체
 *       클래스 종류 (추상,인터페이스)
 *       예외처리
 *       --------------------
 *  2권 : 실제 프로그램 개발
 *       = 네트워크 : 흐름파악(C/S)=> Client/Server 
 *       = 데이터베이스 : 웹
 *       
 *  12장 => 라이브러리 클래스
 *  
 *  499p
 *  -------
 *      Object 클래스 : 모든 클래스 상위 클래스
 *        => extends Object => java.lang.Object
 *                             ----------------
 *                             | System/String/Number/StringBuffer/Thread
 *      1. 객체생성 ~ 소멸
 *         new     finalize()
 *                 => 메모리에서 해제
 *      2. 복제 / 비교
 *      3. 문자열
 *      
 *   
 */
// finalize()
class Sawon {
	private String name;
	private String dept;
	public Sawon(String name,String dept) {
		this.name=name;
		this.dept=dept;
		// this는 static => 모든 클래스에 대입
		// this는 new를 이용해 객체 생성시에 주소값을 대입
	}
	/*
	 *   this는 클래스 {}에서 사용이 가능
	 *   => 생성자
	 *   => 인스턴스 메서드
	 *   => 인스턴스 초기화 블록 / static{} / static 메서드에서는 사용 불가
	 */
	public void print() {
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 해제");
	}
	/*
	 *     class제작 ===== new 생성자() ===== 객체.메서드()
	 *                                        |
	 *                                     객체=null
	 *                                        | 
	 *                                     GC()에 의해 해제
	 */
	
	//소멸자
	
}
public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체생성
		Sawon sa=new Sawon("홍길동", "개발부");
		//객체활용
		sa.print();
		//객체소멸
		sa=null;
		//자동으로 GC => 수거 => 메모리가 많은 상태 => 종료후 나중에 회수
		//finalize가 호출
		//바로 해제
		System.gc();
		//Object : 객체 생성 ~ 객체 소멸
	}

}
