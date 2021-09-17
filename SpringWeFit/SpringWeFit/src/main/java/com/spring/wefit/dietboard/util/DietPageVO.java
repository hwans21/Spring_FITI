package com.spring.wefit.dietboard.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DietPageVO {

	//페이징관련 변수
	private int pageNum;
	private int countPerPage;
	
	//검색관련 변수
	private String keyword;
	private String condition;
	
	public DietPageVO() {
		this.pageNum = 1;
		this.countPerPage = 9;
	}
	
	
	
	
}




