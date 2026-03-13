/*
 * 	0~9난수 발생 ==> 100개
 * 	
 * 	
 */

import java.util.Arrays;

public class 빈도수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[10];
//		
//		for(int i=0;i<100;i++) {
//			int num=(int)(Math.random()*10);
//			arr[num]++;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(i+"==>"+arr[i]);
//		}
		
		int[] arr = new int[45];
		
		for(int i=1;i<=100;i++) {
			int num=(int)(Math.random()*45);
			arr[num]++;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+"==>"+arr[i]);
		}
		
	}

}
