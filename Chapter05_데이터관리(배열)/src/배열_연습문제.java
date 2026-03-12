import java.util.*;
public class 배열_연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.다음 중 배열 선언이 잘못된 것은?
//				1) int[] n = {1, 2, 3, 4, 5};
//				2) int n[] = {0};
//				3) int[] n = new int[3];
//				4) int n[3] = new int[3]; ✓
		
//		2.배열을 선언하고 생성하는 다음 물음에 답하라.
//		
//				1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
//				
					int[] c = new int[10];

//				2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
//					
					int[] n = {0,1,2,3,4,5};

//				3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
//				
					char[] day = {'일','월','화','수','목','금','토'};

//				4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.
					
					boolean[] bool = {true,false,false,true};
					
//		3.배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하시오.
//			
				char[] alpha = {'a', 'b', 'c', 'd'};
		
				for(int i=0;i<alpha.length;i++){
				     System.out.print(alpha[i]);
				}
				System.out.println();
				System.out.println("-".repeat(20));
				
//		4.양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
				
				int[] num = new int[10];
				Scanner sc = new Scanner(System.in);
				for(int i=0;i<num.length;i++) {
					num[i] = (int)(Math.random()*10)+1;
				}
				System.out.println(Arrays.toString(num));
				for(int i=0;i<num.length;i++) {
					if(num[i]%3==0)
						System.out.print(num[i]+" ");
				}
				System.out.println();
				System.out.println("-".repeat(20));
				
//		5.정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
				
				int[] number = new int[10];
				int sum=0;
				for(int i=0;i<number.length;i++) {
					number[i] = (int)(Math.random()*10)+1;
					sum+=number[i];
				}
				System.out.println(Arrays.toString(number));
				System.out.println((double)sum/number.length);
				
				System.out.println("-".repeat(20));
				
//		6. 1)5개 정수를 입력받은 후 차례로 출력하는 프로그램 
//			  입력예) 5 10 9 3 2 출력예) 5 10 9 3 2
				
				int[] num6 = new int[5];
				for(int i=0;i<num6.length;i++) {
					num6[i] = (int)(Math.random()*5)+1;
				}
				for(int a:num6) {
					System.out.print(a+" ");
				}
				System.out.println();
				System.out.println("-".repeat(20));
				
//		   2)문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
//				입력예) A B C D E F G H I J 출력예) ABCDEFGHIJ
				
				String[] alpha1 = new String[10];
				for(int i=0;i<alpha1.length;i++) {
					alpha1[i] = sc.next();
				}
				for(String a:alpha1)
					System.out.print(a);
				
				System.out.println();
				System.out.println("-".repeat(20));
				
//			3)정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
//				입력예) 5 3 9 6 8 4 2 8 10 1출력예) 9 8 1

				int[] num3 = new int[10];
				for(int i=0;i<num3.length;i++) {
					num3[i] = (int)(Math.random()*10)+1;
				}
				System.out.println(Arrays.toString(num3));
				for(int i=0;i<num3.length;i++) {
					if(i==2 || i==4 || i==num3.length-1)
						System.out.print(num3[i]+" ");
				}
				System.out.println();
				System.out.println("-".repeat(20));
				
//			4)10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
//				입력예) 5 10 8 55 6 31 12 24 61 2출력예) 61
				
				int[] num4 = new int[10];
				int max=0;
				for(int i=0;i<num4.length;i++) {
					num4[i] = (int)(Math.random()*10)+1;
					max=num4[i];
					for(int j=0; j<num4.length; j++) {
						if(num4[j]>max)
							max=num4[j];
					}
				}
				System.out.println(Arrays.toString(num4));
				System.out.println(max);
				System.out.println("-".repeat(20));
				
//			5)10명의 컴퓨터 정수를 입력받아 배열에 저장하고 총점과 평균을 구하여 출력하는 프로그램을 작성
				
				int[] num5 = new int[10];
				int sum1=0;
				for(int i=0;i<num5.length;i++) {
					num5[i] = (int)(Math.random()*10)+1;
					sum1+=num5[i];
				}
				System.out.println(Arrays.toString(num5));
				System.out.println("총점:"+sum1);
				System.out.println("평균:"+sum1/(double)num5.length);
				System.out.println("-".repeat(20));
				
//			6)5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하는 프로그램 
//				출력예) 50 75 85 95 100

				int[] n1 = {95,75,85,100,50};
				Arrays.sort(n1);
				for(int a:n1) {
					System.out.print(a+" ");
				}
				


					


	}

}
