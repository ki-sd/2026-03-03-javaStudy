/*
 * 		3개의 숫자 난수
 * 		-----------
 * 		사용자 3개 입력
 * 		----------- 힌트
 * 
 * 		자리수+숫자 => S
 * 		숫자 => B
 * 
 * 
 *		1.난수 발생
 *		-----------------
 *		2.사용자 입력
 *		3.비교
 *		4.힌트
 *		5.정답확인 => 종료
 *		----------------- 반복문
 */
import java.util.Scanner;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if(com[j]==com[i]) {
					i--;
					break;
				}
			}
		}
		
		while(true) {
			System.out.print("세자리 정수 입력:");
			int input = sc.nextInt();
			if(999<input || input <100) {
				System.err.println("😭 잘못된 입력입니다!!");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2]) {
				System.err.println("😭 같은 수는 사용할 수 없습니다!!");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.err.println("😭 0은 사용할 수 없습니다!!");
				continue;
			}
			int s=0,b=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(com[i]==user[j]) {
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			if(s==3) {
				System.out.println("🎉 Game Over!!");
				break;
			}
		}
	}

}
