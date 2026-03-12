// => 10개의 정수 임의로 추출 => 배열에 저장
// => 최대값 / 최소값
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[10];
		for(int i=0;i<number.length;i++) {
			number[i] = (int)(Math.random()*100)+1;
		}
		for(int i:number) {
			System.out.print(i+" ");
		}
		System.out.println("\n====== 결과값 ======");
		int max = number[0];
		int min = number[0];
		
		for(int i:number) {
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		System.out.println("max="+max+"\nmin="+min);
		
		for(int i=0;i<number.length;i++) {
			if(max==number[i])
				System.out.println("max값은 "+(i+1)+"번째 위치");
			if(min==number[i])
				System.out.println("min값은 "+(i+1)+"번째 위치");
		}
	}

}
