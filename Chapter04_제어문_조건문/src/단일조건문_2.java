import java.util.Scanner;

public class 단일조건문_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		boolean isRunning = true;
		
		while(isRunning) {
			System.out.println("=".repeat(6)+" 메뉴 "+"=".repeat(6));
			System.out.println("1. 영화 목록");
			System.out.println("2. 뮤직 목록");
			System.out.println("3. 맛집 목록");
			System.out.println("4. 레시피 목록");
			System.out.println("5. 종료");
			System.out.println("=".repeat(17));
			System.out.print("메뉴 선택:");
			int menu = sc.nextInt();
			switch (menu) {
			case 1 -> {Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://cgv.co.kr");
				break;
				}
			case 2 -> {Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe https://www.genie.co.kr/chart/top200");
				break;
				}
			case 3 -> {Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe https://www.diningcode.com/");
				break;
				}
			case 4 -> {Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe https://www.10000recipe.com/index.html");
				break;
				}
			case 5 -> {System.out.println("종료합니다.");
				isRunning = false;
				}
			default -> {System.out.println("잘못된 입력입니다.\n");
				break;
				}
			}
		}	
	}

}
