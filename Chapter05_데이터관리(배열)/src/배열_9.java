//	로또번호 추출 ==> 6개 (1~45) ==> 중복없는

import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;

			//중복제거
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
//		System.out.println(Arrays.toString(lotto));
		Arrays.sort(lotto);
		for(int i=lotto.length-1;i>=0;i--) {
			Thread.sleep(2000);
			System.err.print(lotto[i] + " ");
		}
	}

}
