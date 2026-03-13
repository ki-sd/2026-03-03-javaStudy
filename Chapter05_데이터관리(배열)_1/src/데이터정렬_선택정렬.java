/*
 * 		정렬
 * 		40  20  50  10  30
 */

import java.util.Arrays;

public class 데이터정렬_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n정렬 후:");
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
