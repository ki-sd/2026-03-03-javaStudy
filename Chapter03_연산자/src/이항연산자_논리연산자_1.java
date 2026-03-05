import java.util.Scanner;
public class 이항연산자_논리연산자_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력(0~100):");
		
		int score=sc.nextInt();
		
		String res=score>=0 && score <= 100?"정상입력":"비정상입력";
		System.out.println("res:"+res);
	}
}
