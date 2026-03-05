/*
 *		결과값은 boolean => true / false
 *		== 같다
 *		!= 다르다
 *		< 작다
 *		> 크다
 *		<= 작거나 같다
 *		>= 크거나 같다
 *
 *		----------------- 사용 가능한 데이터
 *			정수 / 실수 / 문자 => 전체 사용 가능
 *			논리 => ==, != 만 사용가능
 *			문자열 : 사용X : equals() / compare()
 *			===== 주소 이용 (참조 데이터)
 */
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = 6==7;
		System.out.println("b1="+b1);
		
		b1= 6!=7;
		System.out.println("b1="+b1);
		
		b1= 6<7;
		System.out.println("b1="+b1);
		
		b1= 6>7;
		System.out.println("b1="+b1);
		
		b1= 6<=7;
		System.out.println("b1="+b1);
		
		b1= 6>=7;
		System.out.println("b1="+b1);
		System.out.println("=========================");
		
		b1 = 'A'=='C';
		System.out.println("b1="+b1);
		
		b1= 'A'!='C';
		System.out.println("b1="+b1);
		
		b1= 'A'<'C';
		System.out.println("b1="+b1);
		
		b1= 'A'>'C';
		System.out.println("b1="+b1);
		
		b1= 'A'<='C';
		System.out.println("b1="+b1);
		
		b1= 'A'>='C';
		System.out.println("b1="+b1);
		
		boolean r1=false;
		boolean r2=true;
		
		b1=r1==r2;
		System.out.println("b1="+b1);
		b1=r1!=r2;
		System.out.println("b1="+b1);
		
		b1 = 'A'==66;
		System.out.println("b1="+b1);
		b1 = 'A'!=66;
		System.out.println("b1="+b1);
		b1 = 'A'<66;
		System.out.println("b1="+b1);
		b1 = 'A'>66;
		System.out.println("b1="+b1);
		b1 = 'A'<=66;
		System.out.println("b1="+b1);
		b1 = 'A'<=66;
		System.out.println("b1="+b1);
		
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'0');
	}

}
