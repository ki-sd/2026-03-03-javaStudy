//	배열은 메모리 주소를 이용하는 프로그램 
//  ==> 주소에 있는 데이터가 손상될수 있음
//  ==> 배열 / 클래스
public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		
		System.out.println("생성된 메모리 갯수:"+alpha.length);
		
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)((int)(Math.random()*26)+65);
		}
		
		
		for(char c:alpha) {
			System.out.print(c+" ");
		}
		
		alpha[0]='X';
		int i=0;
		for(char c='A';c<='J';c++) {
			alpha[i]=c;
			i++;
		}
		System.out.println("\n변경");
		
		for(char c:alpha) {
			System.out.print(c+" ");
		}
		//	다른 클래스에서 사용 => 자체 변경 / 새로운 메모리
		//					  -----대입----------clone
		//	char[] a=alpha char[] b=alpha.clone()
		//	===> 메서드 매개변수 전송
		//	=> 데이터를 모아서 편리하게 관리 => 도구
	}

}
