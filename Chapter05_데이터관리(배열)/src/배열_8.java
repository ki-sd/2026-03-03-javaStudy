//	=> 컴퓨터와 가위바위보 10번 => 10번중 2승 2무 6패
import java.util.*;
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0, lose=0, same=0;
		String[] res= {"가위","바위","보"};
		for(int i=0;i<10;i++) {
			int com=(int)(Math.random()*3);
			Scanner sc = new Scanner(System.in);	
			System.out.print("가위(0), 바위(1), 보(2):");				// 0 -> 1, 1 -> 2, 2 -> 0
			int user = sc.nextInt();
			if(user<0 || user>2) {
				System.err.println("잘못된 입력입니다!!");
				i--;
				continue;
			}
			else {
				System.out.println("컴퓨터: "+res[com]);
				System.out.println("사용자: "+res[user]);
				int r = com-user;
				if(r==-1 || r==2) {
					System.out.println("User Win!!");
					win++;
					System.out.println("-".repeat(20));
				}
				else if(r==1 || r==-2) {
					System.out.println("Computer Win!!");
					lose++;
					System.out.println("-".repeat(20));
				}
				else {
					System.out.println("비겼습니다!!");
					same++;
					System.out.println("-".repeat(20));
				}
			}
			
		}
		System.out.printf("결과: %d전 %d승 %d무 %d패\n",win+same+lose,win,same,lose);
		
	}

}
