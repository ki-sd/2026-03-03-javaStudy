import java.util.Scanner;

public class 선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		
		while(isRunning) {
			System.out.print("아이디를 입력해주세요:");
			String id = sc.nextLine();
			System.out.print("패스워드를 입력해주세요:");
			String pw = sc.nextLine();
			
			if(id.equals("admin") && pw.equals("1234")) {
				System.out.println("로그인되었습니다.");
				isRunning = false;
			}
			else {
				System.out.println("id 혹은 pw가 잘못되었습니다.");
			}
		}	
	}

}
