/*
 *     예외처리
 *      목적 : 비정상 종료를 방지하고 정상 수행 가능하게 만든다.
 *      정의 : 사전에 에러를 방지하는 프로그램
 *      예외처리 => 에러가 발생하면 부분 제외하고 수행
 *                          ------- 건너뛴다
 *      에러의 일종 (예외)
 *       사용자 : 입력 => 잘못 입력된 경우
 *       개발자 : 실수 => 인덱스 번호 / 변환 (윈도우, 웹 => 문자열)
 *       ---------------------------------------------
 *        에러: 수정불가
 *        예외: 소스상 수정 가능
 *       상속 과정
 *       -------
 *                      Object
 *                      ------
 *                         |
 *                     Throwable : 에러처리
 *                         |
 *            -------------------------
 *            |                       |
 *          Error                 Exception
 *                                    |
 *                        -------------------------
 *                        | => 컴파일시              | => 실행시
 *                        | => 반드시 예외처리         | => 상황에 따라 예외처리
 *                  CheckException           UncheckException
 *                  |                                       |
 *                  IOException : File                      RuntimeException
 *                    => java.io                                           |
 *                  SQLException : Oracle                              NumberFormatException : 정수변환 => Integer.parseInt()
 *                    => java.sql                                      ArrayIndexOutOfBoundsException
 *                  MalformedURLException : 네트워크                      NullPointerException
 *                    => java.net                                      ClassCastException
 *                    => URL                                           ...
 *                  ClassNotFoundException : 메모리 할당                  => 메서드 -> if문 -> 예외처리
 *                    => java.lang                                     => 에러확인
 *                  InterruptedException : 쓰레드 관련                       ------
 *                    => java.lang                                        catch절에서 주로 사용
 *                    ...                                                 getMessage() / printStackTrace()
 *                    ...                                                               *-----------------
 */
class A {
	
}
class B extends A {
	
}
public class 예외처리_1 {
	String msg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer.parseInt("100 ".trim());
//		int[] arr=new int[2];
//		try {
//		arr[0]=10;
//		arr[2]=20;
//		}catch(ArrayIndexOutOfBoundsException ex) {
//			System.out.println(ex.getMessage());
//		}
//		System.out.println(arr[0]);
//		예외처리_1 a=new 예외처리_1();
//		예외처리_1 a=null;
//		a.msg.substring(2);
		try {
		A a=new A();
		B b=(B)a;
		}catch(ClassCastException ex) {
			ex.printStackTrace();
		}
		
		
//		Runnable r=()->{
//			System.out.println("12345");
//		};
//		new Thread(r).start();
		
//		Runnable r=new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("12345");
//			}
//		};
//		new Thread(r).start();
	}

}
