/*
 * 		16bit ==> 32767
 * 		---------------
 * 		10
 * 		0000 0000 0000 1010
 */
import java.util.Scanner;
public class 이진법변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] binary = new int[16];
		//저장 순서
		int index = 15; //뒤부터 저장
		
		System.out.println("0~32767 사이의 정수 입력:");
		int num = sc.nextInt();
		// 라이브러리
		System.out.println("라이브러리:"+Integer.toBinaryString(num));
		System.out.println("라이브러리:"+Integer.toOctalString(num));
		System.out.println("라이브러리:"+Integer.toHexString(num));
		// 횟수가 지정 안됨 -> while
		while(true) {
			binary[index] = num%2;
			num/=2;
			if(num==0)
				break;
			index--;
		}
		for(int i=0;i<binary.length;i++) {
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}

}
