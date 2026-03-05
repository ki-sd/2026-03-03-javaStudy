
public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char c=65;
//		char d=(char)((int)(Math.random()*26)+65);
//		System.out.println(d);
		
		int sum=0;
		int even=0, odd=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			sum+=i;
		}
		System.out.println("짝수합="+even);
		System.out.println("홀수합="+odd);
		System.out.println("총합="+sum);
		
		String alpha="";
		for(char c='A';c<='Z';c++) {
			alpha+=c;
		}
		System.out.println(alpha);
	}

}
