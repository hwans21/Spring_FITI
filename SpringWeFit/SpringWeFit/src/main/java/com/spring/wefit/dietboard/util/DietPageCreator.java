package com.spring.wefit.dietboard.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DietPageCreator {

	private DietPageVO paging;
	private int articleTotalCount;
	private int beginPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	private final int buttonNum = 5;
	
	//페이지 알고리즘
	private void calcPage() {
		
		endPage = (int) (Math.ceil(paging.getPageNum() / (double) buttonNum) * buttonNum);
		beginPage = (endPage - buttonNum) + 1;
		prev = (beginPage == 1) ? false : true;
		next = articleTotalCount <= (endPage * paging.getCountPerPage()) ? false : true;
		if(!next) {
			endPage = (int) Math.ceil(articleTotalCount / (double) paging.getCountPerPage()); 
		}
	}
	
	public void setArticleTotalCount(int articleTotalCount) {
		this.articleTotalCount = articleTotalCount;
		calcPage();
	}
	
	
}





