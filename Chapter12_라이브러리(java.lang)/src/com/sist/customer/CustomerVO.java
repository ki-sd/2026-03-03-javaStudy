package com.sist.customer;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

// C001,user001,pw001,김민수,minsu.kim1@test.com,010-1000-0001,서울,2023-01-02,VIP
@Getter@Setter
//@EqualsAndHashCode
public class CustomerVO {
	private String customer_id, login_id, pw, name, email, phone, loc, regdate, grade;
}
