// 1~10 => for => 난수:0~2 사이 => /
/*
 * 
 */
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			int num=(int)(Math.random()*3);
			try{
				System.out.println(i+"/"+num+"="+i/num);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

}
