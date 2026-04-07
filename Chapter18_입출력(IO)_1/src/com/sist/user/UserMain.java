package com.sist.user;
import java.util.*;
import com.sist.service.*;
import com.sist.vo.FoodVO;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FoodService fService=new FoodService();
		while(true) {
			System.out.println("===== Menu =====");
			System.out.println("1. 목록");
			System.out.println("2. 상세보기");
			System.out.println("3. 검색(음식종류)");
			System.out.println("4. 검색(주소)");
			System.out.println("5. 종료");
			System.out.println("================");
			System.out.print("메뉴 선택:");
			int menu=sc.nextInt();
			switch(menu) {
				case 5->{
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				case 1->{
					System.out.print("페이지 입력:");
					int page=sc.nextInt();
					List<Optional<FoodVO>> fList=fService.food_list(page);
//					String result=fList.stream()
//							.flatMap(Optional::stream)
//							.map(FoodVO::getName)
//							.findFirst()
//							.orElse("데이터가 없음");
					List<FoodVO> foods=fList.stream()
							.flatMap(Optional::stream)
							.toList();
					if(foods.isEmpty()) {
						System.out.println("데이터 없음");
					}else {
						foods.forEach(f->System.out.println(f.getNo()+"."+f.getName()));
					}
//					System.out.println(result);
//					String result=Optional.ofNullable(fList)
//							.map(n->n.getNO())
//							.map(t->t.getName())
//							.orElse("데이터가 없음");
//					fList.stream()
//				     .map(opt -> opt.map(f -> f.getNo() + " : " + f.getName()).orElse("데이터가 없음"))
//				     .forEach(System.out::println);
//					fList.stream()
//						.forEach(food->System.out.println(food.getNo()+"."+food.getName()));
				}
				case 2->{
					System.out.print("상세볼 맛집 번호:");
					int no=sc.nextInt();
					FoodVO vo=fService.food_detail(no);
					System.out.println(vo);
				}
				case 3->{
					System.out.print("한식,중식,양식,일식,분식:");
					String type=sc.next();
					List<FoodVO> list=fService.food_type_find(type);
					list.stream().forEach(food->System.out.println(
							food.getName()+" ("+food.getType()+")"
							));
				}
				case 4->{
					System.out.print("주소 입력:");
					String addr=sc.next();
					List<FoodVO> list=fService.food_address_find(addr);
					list.stream().forEach(food->System.out.println(
							food.getName()+" ("+food.getAddress()+")"
							));
				}
				default->{
					System.out.println("없는 메뉴입니다.");
				}
			}
		}
	}

}
