/*
 * 	1.배열 선언
 * 	2.배열 초기화
 * 	3.반복문을 이용한 데이터 출력
 * 	4.배열 복사
 * 	5.동적 생성
 * 
 * 	1) 선언
 * 		데이터형[] 배열명;  권장
 * 		데이터형 배열명[];	C언어 호환
 * 
 * 		=> 정수
 * 			int[] arr
 * 		=> 문자
 * 			char[] arr
 * 		=> 문자열
 * 			String[] arr
 * 		=> 실수
 * 			double[] arr
 * 		=> 논리
 * 			boolean[] arr
 * 	2) 몇개? => 초기화
 * 		10,20,30,40,50
 * 
 * 		int[] arr={10,20,30,40,50}; // 선언+초기화
 * 		==> 참조변수 (저장된 메모리의 주소만 갖고있음) (배열은 Stack, 실제 메모리는 Heap에)
 * 		
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
//		System.out.println(arr[0]+"\n"+arr[1]+"\n"+arr[2]+"\n"+arr[3]+"\n"+arr[4]);
//		
//		arr[0]=100;
//		arr[1]=200;
//		System.out.println(arr[0]+"\n"+arr[1]+"\n"+arr[2]+"\n"+arr[3]+"\n"+arr[4]);
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("===============");
		// 향상된 for문
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
