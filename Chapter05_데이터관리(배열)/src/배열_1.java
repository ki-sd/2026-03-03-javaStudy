/*
 * 	데이터 여러개를 한개 이름으로 관리 => 배열 / 클래스
 * 	명령문을 한개 이름으로 통합해서 관리 => 메서드
 * 	클래스 여러개를 한개 이름으로 관리 => 인터페이스
 * 
 *  자바
 *  = 기초문법 => 변수, 연산자, 제어문
 *  = 데이터 관리 => 배열 / 클래스 / 메서드
 *  = 객체지향 => 데이터 보호 / 재사용 / 수정, 추가 편의성
 *  = 견고한 프로그램 => 예외처리
 *  = 자바에서 제공하는 라이브러리
 *  = 조립법 : 라이브러리 + 사용자 정의 => 프로그램 제작
 *  ---------------------------------------------
 *  |웹, 애플리케이션
 *   | 초점
 *   | => 개발+배포 : devops
 *   | F / B => Full Stack
 *   		 => Spring AI 우대 => RAG
 *   --------------------------------------------
 * 
 */
import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int kor1, kor2, kor3;
//		int eng1, eng2, eng3;
//		int math1, math2, math3;
//		int sum1, sum2, sum3;
//		double avg1, avg2, avg3;
//		System.out.print("학생 1 국어 점수 입력:");
//		kor1 = sc.nextInt();
//		System.out.print("학생 1 영어 점수 입력:");
//		eng1 = sc.nextInt();
//		System.out.print("학생 1 수학 점수 입력:");
//		math1 = sc.nextInt();
//		
//		System.out.print("학생 2 국어 점수 입력:");
//		kor2 = sc.nextInt();
//		System.out.print("학생 2 영어 점수 입력:");
//		eng2 = sc.nextInt();
//		System.out.print("학생 2 수학 점수 입력:");
//		math2 = sc.nextInt();
//		
//		System.out.print("학생 3 국어 점수 입력:");
//		kor3 = sc.nextInt();
//		System.out.print("학생 3 영어 점수 입력:");
//		eng3 = sc.nextInt();
//		System.out.print("학생 3 수학 점수 입력:");
//		math3 = sc.nextInt();
//		
//		int score[] = {kor1,eng1,math1,kor2,eng2,math2,eng1,eng2,eng3};
//		
//		sum1 = score[0]+score[1]+score[2];
//		sum2 = score[3]+score[4]+score[5];
//		sum3 = score[6]+score[7]+score[8];
//		avg1 = sum1/3.0;
//		avg2 = sum2/3.0;
//		avg3 = sum3/3.0;
		System.out.print("학생 수를 입력해주세요:");
		int student = sc.nextInt();
		int kor[] = new int[student];
		int eng[] = new int[student];
		int math[] = new int[student];
		for(int i=0;i<student;i++) {
			System.out.print(i+1+"번째 학생의 국어 점수를 입력해주세요:");
			kor[i] = sc.nextInt();
			System.out.print(i+1+"번째 학생의 영어 점수를 입력해주세요:");
			eng[i] = sc.nextInt();
			System.out.print(i+1+"번째 학생의 수학 점수를 입력해주세요:");
			math[i] = sc.nextInt();
		}
		System.out.println("=".repeat(30));
		for(int i=0;i<student;i++) {
			int sum = kor[i] + eng[i] + math[i];
			double avg = sum / 3.0;
			System.out.printf("%d번째 학생의 점수 총합: %d\n",i+1,sum);
			System.out.printf("%d번째 학생의 평균: %.2f\n",i+1,avg);
			System.out.println("=".repeat(21));
		}
	}

}
