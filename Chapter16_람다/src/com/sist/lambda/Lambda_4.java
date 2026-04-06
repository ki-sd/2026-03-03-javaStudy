package com.sist.lambda;
/*
 *     stream() : 내부 반복자 => 전체 데이터 수집
 *     filter() : if => 조건검색 => 데이터 추출
 *     forEach => 반복 출력 (추출된 데이터 출력)
 *     ===> sort / min , max / sum / avg ...
 */
/*
 *  1|
 *  아름드리카페|
 *  카페/주점-카페|
 *  (070) 8872-4418|
 *  강원 동해시 평릉동 487-1|
 *  0.0|
 *  10대, 주차방법: 무료, 주차장소: 업소앞|
 *  /restaurant/restimg/002/zzmenuimg/d20034222_z.jpg|
 *  10:30 ~ 22:00|
 *  펜션과 함께 운영하고 있는 아름드리 커피숍을 소개한다. 깔끔하고 넓은 매장 내부는 탁 트인 주변 경치도 구경할 수 있게 되어 있어서 좋은 곳이다. 비영리 봉사단체에서 운영하는 곳으로 여러 사람들의 정성을 모아 이웃들에게 함께 나누는 착한 카페이다. 예쁜 그릇에 담긴 팥빙수와 진한 향의 페퍼민트, 그리고 너무 예쁜 카페라떼까지 분위기 좋은 곳에서 함께 즐기기 좋은 카페이다.|
 *  일상데이트 , 더운날 , 야외테라스 , 포장 가능|
 *  5,000원미만
 */

import java.util.*;
import java.io.*;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
class Food {
	private int no;
	private String name,type,phone,address,parking,poster,time,content,theme,price;
	private double score;
}
class FoodManager {
	public static List<Food> fList=
			new ArrayList<Food>();
	static {
		try {
			FileReader fr=new FileReader("c:\\javaDev\\food.txt");
			StringBuffer sb=new StringBuffer();
			// => 파일읽는 경우 => 1글자
			// => 한줄씩 읽을 수 있다
			// BufferedReader => IO
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			fr.close();
			String[] datas=sb.toString().split("\n");
			for(String food:datas) {
				StringTokenizer st=new StringTokenizer(food,"|");
				Food f=new Food();
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setName(st.nextToken());
				f.setType(st.nextToken());
				f.setPhone(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster(st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setTheme(st.nextToken());
				f.setPrice(st.nextToken());
				fList.add(f);
			}
		}catch(Exception ex) {}
	}
}
public class Lambda_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FoodManager fm=new FoodManager();
		while(true) {
			System.out.println("====== 메뉴 ======");
			System.out.println("1. 전체 목록");
			System.out.println("2. 평점 4.0 이상");
			System.out.println("3. ");
			System.out.println("4. 종료");
			System.out.println("================");
			System.out.print("메뉴 입력:");
			int menu=sc.nextInt();
			switch (menu) {
				case 4->{
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				case 1->{
					fm.fList.forEach(food->System.out.println(food.getNo()+"."+food.getName()));
				}
				case 2->{
					fm.fList.stream()
						.filter(f->f.getScore()>=4.0)
						.forEach(f->System.out.println(f.getName()+":"+f.getScore()));
				}
				case 3->{
					fm.fList.stream()
						.sorted()
				}
				default->{
					System.out.println("없는 메뉴입니다.");
				}
			}
		}
	}
}
