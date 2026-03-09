import java.util.Scanner;
public class 이항연산자_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수를 입력해주세요:");
		int kor = sc.nextInt();
		System.out.print("영어점수를 입력해주세요:");
		int eng = sc.nextInt();
		System.out.print("수학점수를 입력해주세요:");
		int math = sc.nextInt();
		int total = kor + eng + math;
		double avg = total / 3.0;
		System.out.print("총점:"+total);
		System.out.printf(" 평균:%.2f\n",avg);
		System.out.println(5%0.0);
	}

}
