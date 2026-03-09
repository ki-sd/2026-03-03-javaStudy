import java.util.Scanner;

public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력:");
		int year = sc.nextInt();
		System.out.println("입력된 연도:" + year);
		
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println(year + "년도는 윤년입니다.");
		}
		else {
			System.out.println(year + "년도는 윤년이 아닙니다.");
		}
	}
	


}
