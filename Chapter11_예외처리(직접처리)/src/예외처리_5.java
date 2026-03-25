/*
 *     1. 인터페이스
 *        => 표준화 가능
 *        => 소스 통일화
 *        => 다른 클래스와 연결시에 주로 사용 : 리모컨
 *           ----------------------
 *           => 결합성이 낮아진다
 *           => client =|= server
 *                   interface
 */
interface Animal {
	int a=100; // 상수형 => 반드시 초기값
	// public static final int a=100;
	public void eat();
	// private 사용시 interface 자체에서만 사용
	private void display() {
		System.out.println("공통 사용");
	}
	public default void aaa() {
		display();
	}
	public default void bbb() {
		display();
	}
	public default void ccc() {
		display();
	}
}

public class 예외처리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
