import java.util.Random;
public class 선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int i = r.nextInt(100)+1;
		
		System.out.println("정수값:"+i);
		
		if(i%2==0)
			System.out.println(i+"는(은) 짝수입니다.");
		else
			System.out.println(i+"는(은) 홀수입니다.");
		
		char c = 'A';
		if(c >= 'A' && c <= 'Z')
			System.out.println(c+"는(은) 대문자입니다.");
		else
			System.out.println(c+"는(은) 소문자입니다.");
	}

}
