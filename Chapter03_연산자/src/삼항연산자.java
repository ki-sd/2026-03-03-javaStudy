/*
 * 		삼항연산자
 * 		 => 피연산자가 3개인 경우
 * 		 => (조건)?값1?값2 =====> 결과값은 프로그램에 따라 결정
 * 				-------
 * 			조건 : true : 값1
 * 				 false : 값2
 * 				 => 부정연산자/비교연산자/논리연산자
 * 		 => 일반프로그램보다는 게임/웹에서 주로 사용
 * 						--- -----
 * 							자바 + HTML
 * 						|소스가 길다
 * 
 */
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=(int)(Math.random()*100)+1;
//		System.out.println("num"+num);
//		
//		String result=num%2==0?"짝수":"홀수";
//		System.out.println(num+"는(은) "+result+"입니다");
		
//		int num=(int)(Math.random()*2); //0,1
//		char c=num==0?(char)((int)(Math.random()*26)+65):
//					  (char)((int)(Math.random()*26)+97);
//		System.out.println("c="+c);
//		
//		String result=(c>='A' && c<='Z')?"대문자":"소문자";
//		System.out.println(c+"는(은)"+result+"입니다");
		
		int num1=(int)(Math.random()*100)+1;
		int num2=(int)(Math.random()*100)+1;
		int num3=(int)(Math.random()*100)+1;
		
		int max=num1<num2?num2:num1;
		int min=num1<num2?num1:num2;
		System.out.println(num1+", "+num2);
		System.out.println("큰 수:"+max);
		System.out.println("작은 수:"+min);
		
		String result=num3%3==0?"3의배수입니다":"3의배수가 아닙니다";
		System.out.println(num3+"는(은) "+result);
		}

}
