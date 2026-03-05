/*
 * 		논리연산자 => 결과값은 boolean  => 삼항연산자 / 조건문 (if)
 * 		------
 * 		  =>최적화 연산자
 * 		  =>연산기호
 * 			&& => 포함된 경우
 * 			|| => 포함이 안된 경우
 * 
 * 		  (조건) && (조건)
 * 		  ----     ----
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 9;
		boolean res = x>10 && ++y==x;
		System.out.println("결과값:"+res);
		System.out.println("y="+y);
	}

}
