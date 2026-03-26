package com.sist.inter;
import java.util.*;
interface 게시판 {
	public void handlerRequest();
}
class 게시판_글쓰기 implements 게시판 {
	public void handlerRequest() {
		System.out.println("글쓰기 요청");
	}
}
class 게시판_목록 implements 게시판 {
	public void handlerRequest() {
		System.out.println("목록보기 요청");
	}
}
class 게시판_상세보기 implements 게시판 {
	public void handlerRequest() {
		System.out.println("게시판 상세보기 요청");
	}
}
class 게시판_수정 implements 게시판 {
	public void handlerRequest() {
		System.out.println("게시판 수정 요청");
	}
}
class 게시판_삭제 implements 게시판 {
	public void handlerRequest() {
		System.out.println("게시판 삭제 요청");
	}
}

public class 인터페이스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.글쓰기");
		System.out.println("2.목록");
		System.out.println("3.상세보기");
		System.out.println("4.수정");
		System.out.println("5.삭제");
		System.out.print("메뉴입력:");
		int menu=sc.nextInt();
//		게시판 a=null;
//		if(menu==1)
//			a=new 게시판_글쓰기();
//		else if(menu==2)
//			a=new 게시판_목록();
//		else if(menu==3)
//			a=new 게시판_상세보기();
//		else if(menu==4)
//			a=new 게시판_수정();
//		else if(menu==5)
//			a=new 게시판_삭제();
		Map map=new HashMap<>();
		map.put(1, new 게시판_글쓰기());
		map.put(2, new 게시판_목록());
		map.put(3, new 게시판_상세보기());
		map.put(4, new 게시판_수정());
		map.put(5, new 게시판_삭제());
		
		게시판 a=(게시판)map.get(menu);
		a.handlerRequest();
	}

}
