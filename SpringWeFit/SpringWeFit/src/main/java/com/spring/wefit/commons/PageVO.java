package com.spring.wefit.commons;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageVO {

		//����ڰ� ������ ������ ������ ���� ����.
		private int pageNum;
		private int countPerPage;
		
		//�˻��� �ʿ��� �����͸� ������ ����.
		private String keyword;
		private String condition;
		
		public PageVO() {
			this.pageNum = 1;
			this.countPerPage = 20;
		}
}
