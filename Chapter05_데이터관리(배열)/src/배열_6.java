//
//

import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100,200,300,400,500};
		int[] copy=arr; 		// 얕은복사(참조 메모리 주소를 복사)
		
		copy[0]=1000;
		System.out.println(arr[0]);
		System.out.println("arr="+arr);
		System.out.println("copy="+copy);
		
		int[] copy2=arr.clone(); //	깊은복사(값을 직접 복사해서 별개의 메모리주소로 저장)
		
		System.out.println("copy2="+copy2);
		copy2[0]=5000;
		
		System.out.println("=====arr값=====");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("=====copy값=====");
		System.out.println(Arrays.toString(copy));
		
		System.out.println("=====copy2값=====");
		System.out.println(Arrays.toString(copy2));
	}

}
