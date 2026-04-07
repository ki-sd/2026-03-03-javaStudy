package com.sist.lambda;
/*
 *     1. 코딩 
 *     2. 메모하는 습관
 *     3. 실전 => 구현
 *     4. 확장
 *     ----------------------- 자신감 / 끈기
 *     
 *     람다식은 이름없는 함수 => 선언이 없음 => 코드가 간결해짐
 *     () -> {}
 *     |함수  |구현부
 *     |매개변수
 *     
 *     => 메서드 참조 : 클래스 (::)
 *        System.out::println ==> Customer::getName
 *        ----------             ---------
 *     => 처리
 *        스트림
 *        중간 처리 =========== 최종처리
 *        |filter            |forEach
 *         => if             => 출력
 *        |map               |collect() / toList()
 *         => format(변환)    => 데이터 모아서 전송
 *        |sorted            |max / min / count
 *         => 정렬
 *         |groupby,Optional
 *         => Null 처리
 *     
 *     => 소스가 간결 => 유지보수 편리
 *     => 재사용 / 복잡한 코딩의 경우 사용X
 *        => 람다: 즉석처리
 *     => 스프링부트 : 보안처리
 *        ---------------
 *     =? JPA : 데이터베이스
 *     
 *     
 *    => 최종 : 보안 / JPA / Mybatis
 *       -------------------------
 *       
 *    주요 매서드
 *    filter()
 *    map()
 *    sorted() => ASC만 가능 (DESC는 역순)
 *    ------------------------------------------------
 *    ****** 면접 => 자바/오라클
 *    객체 지향 프로그램(OOP)
 *       객체 협력해서 상호작용 기준 => 조립식
 *       코드 재사용성 / 유지보수 / 확장 / 신뢰성
 *    함수형 프로그램 (람다)
 *       결과값이 오직 => 입력값에 따라 영향
 *       검증의 용이성 / 성능 최적화(캐시)       
 *       캐시: 임시메모리 => 메모리 리소스를 아낄수 있음
 *       임시메모리에서 데이터를 갖고 오기 => 스트림
 *       ----------------------
 *       스트림 : 데이터 처리
 *              ------- 조건 / 출력 / 데이터 모아서 사용
 *       람다 : 코드를 짧게 쓴다 (함수를 한줄로 줄여 사용)
 *             자바( -> ) / 자바스크립트 ( => )
 *       functional funcName()
 *       {
 *       
 *       }
 *       
 *       let funcName=()=>{}
 *       
 *       핵심
 *         (매개변수)->{실행코드}
 *     
 */
import java.util.*;
public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		numbers.stream()
			.filter(n->n%2==0)
			.forEach(n->System.out.println(n));
//		String name=null;
//		System.out.println(name.length());
//		System.out.println("프로그램 종료");
		Optional<String> name=Optional.ofNullable(null);
		System.out.println(name.orElse("이름 없음"));
		// 검색 / 데이터베이스 프로그램
		// 데이터베이스 => isNotNull()  isNull => NVL()
		Optional<String> userName=Optional.of("홍길동");
		// 값이 있는 경우 실행
		userName.ifPresent(n->System.out.println("이름:"+n));
		// null에 주의
		/*
		 *   orElse("기본값") -> 값이 없는 경우(null) 대신 사용
		 *   ifPresent() => 값이 있는 경우에만 수행
		 *   isPresent() => 값 있는지 확인
		 *   
		 *   람다 => 코드 줄임
		 *   스트림 => 임시메모리(캐시)에서 데이터 한개씩 읽음
		 *   Option => null 안전하게 처리
		 *   
		 *   Optional<String> a=Optional.of("hello")  => null값이 아니다
		 *   Optional<String> a=Optional.ofNullable(null) => null값일 가능성이 있다
		 *   Optional<String> a=Optional.empty() => 빈값
		 *   
		 */
		//값 변경
		Optional<String> opt=Optional.of("Hello");
		Optional<Integer> len=opt.map(s->s.length());
		System.out.println(len.get());
		
		// Optional안 prional => 첨부
		Optional<String> opt2=Optional.of("Hello");
		Optional<Integer> result=opt2.flatMap(s->Optional.of(s.length()));
		// flatMap : optional 제거
		System.out.println(result.get());
		
		//필터링
		Optional<Integer> opt3=Optional.of(10);
		opt3.filter(n->n>5).ifPresent(n->System.out.println("5보다 큼"));
		// filter의 조건이 true일때만 수행
		
		Optional<String> opt4=Optional.ofNullable(null);
		System.out.println(opt4.isPresent());
		System.out.println(opt4.isEmpty());
	}

}
