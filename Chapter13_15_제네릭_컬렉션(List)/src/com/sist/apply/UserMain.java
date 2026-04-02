package com.sist.apply;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor
class Sawon {
	private int sabun;
	private String name;
//	public Sawon(int sabun, String name) {
//		this.sabun = sabun;
//		this.name = name;
//	}
//	public Sawon() {}
}
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		list.add(new Sawon(1,"aaa"));
		list.add(new Sawon(2,"bbb"));
		list.add(new Sawon(3,"ccc"));
//		list.add(4);
		for(Sawon s:list) {
//			Sawon s=(Sawon)o;
			System.out.println(s.getSabun()+" "+s.getName());
		}
	}

}
