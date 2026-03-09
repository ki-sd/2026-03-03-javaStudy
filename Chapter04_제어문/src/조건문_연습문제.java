
public class 조건문_연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번
		int num=10;
		if(num>10) {
			System.out.println("10보다 큽니다.");
		}
		//2번
		int score = 60;
		if(score >= 60) {
			System.out.println("합격");
		}
		//3번
		int age = 20;
		if(age >= 20) {
			System.out.println("성인입니다.");
		}
		//4번
		int num1 = 4;
		if(num1%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		//5번
		int score1 = 60;
		if(score1>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		//6번
		int temperature = 30;
		if(temperature >= 30) {
			System.out.println("덥다");
		}
		else {
			System.out.println("덥지않다");
		}
		//7번
		int score2 = 70;
		if(score2>=90) {
			System.out.println("A");
		}
		else if(score2>=80) {
			System.out.println("B");
		}
		else if(score2>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		//8번
		int num2 = 5;
		if(num2>0) {
			System.out.println("양수");
		}
		else if(num2==0) {
			System.out.println("0");
		}
		else {
			System.out.println("음수");
		}
		//9번
		int age1 = 20;
		if(age1<=13) {
			System.out.println("어린이");
		}
		else if(age1<=19) {
			System.out.println("청소년");
		}
		else {
			System.out.println("성인");
		}
		//10번
		int num3 = 6;
		if(num3>10) {
			System.out.println("10보다 큼");
		}
		else if(num3==10) {
			System.out.println("10과 같음");
		}
		else {
			System.out.println("10보다 작음");
		}
	}

}
