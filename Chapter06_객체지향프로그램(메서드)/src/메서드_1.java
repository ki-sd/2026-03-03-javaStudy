/*
 * 		static ===
 * 
 * 
 * 
 * 
 * 
 * 
 * 		
 */
class Methods {
	int a=10;
	String name="홍길동";
	static int b=20;
	static void display() {
		System.out.println("Commons Methods");
	}
	void display(int a) {
		System.out.println("Instance Method");
	}
}
public class 메서드_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 메모리에 저장
		// Methods m=new Methods();
		System.out.println("b="+Methods.b);
		Methods.display();
		// 목록 => 한번저장
		Methods m=new Methods();
		m.display(100);
		System.out.println("a="+m.a);
		
	}

}
