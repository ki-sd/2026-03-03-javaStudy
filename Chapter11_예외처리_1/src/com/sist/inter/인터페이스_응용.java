package com.sist.inter;
import java.util.*;
interface Game {
	public void start();
}
class MoleGame implements Game {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	
}
class SpeedGame implements Game {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("⚡ 순발력 게임 시작!!");
		System.out.println("👍 지금! 이 뜨면 Enter를 누르세요!!");
		System.out.println("🤦‍♂️ 빨리 누르면 실패!!");
		try {
			System.out.println("\n 👻준비...");
			Thread.sleep(rand.nextInt(3000)+2000); //2~5초
			
		}catch(Exception ex) {}
		long startTime=System.currentTimeMillis();
		System.out.println("👍 지금!");
		sc.nextLine();
		long endTime=System.currentTimeMillis();
		
		long time=endTime-startTime;
		if(time<100) {
			System.out.println("☠️반칙! 너무 빨랐습니다!!");
		}
		else if(time<300) {
			System.out.println("엄청 빠름:["+time+"ms]");
		}
		else if(time<700) {
			System.out.println("보통:["+time+"ms]");
		}
		else {
			System.out.println("엄청 느림:["+time+"ms]");
		}
	}
	
}
public class 인터페이스_응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.print("게임 선택[두더지 게임(1), 순발력(2)]:");
//		int menu=sc.nextInt();
//		Game game=null;
//		if(menu==1) {
//			game=new MoleGame();
//		}
//		else if(menu==2) {
//			game=new SpeedGame();
//		}
//		game.start();
//		MoleGame mole=new MoleGame();
//		SpeedGame speed=new SpeedGame();
//		
//		if(mole instanceof Game)
//			System.out.println("mole<Game");
//		else
//			System.out.println("mole>Game");
//		
//		if(speed instanceof Game)
//			System.out.println("speed<Game");
//		else
//			System.out.println("speed>Game");
		Object obj=new Object();
		String str=new String();
		StringBuffer sb=new StringBuffer();
		
		if(str instanceof Object)
			System.out.println("String<Object");
		
		if(obj instanceof String)
			System.out.println("Object<String");
		
		/*
		 *     일반 기본형 => == !=
		 *     문자열 => equals
		 *     객체 => instanceof ==> 객체 찾기
		 *     @Autowired => 자동화
		 */
	}

}
