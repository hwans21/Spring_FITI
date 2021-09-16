package com.spring.wefit.command;

import java.util.Date;

public class NoticeBoardVO {
	/*
	  CREATE TABLE "SPRINGWEFIT"."NOTICEBOARD" 
	   (	"NBNUM" NUMBER(10,0) NOT NULL ENABLE, 
		"MNUM" NUMBER(20,0) NOT NULL ENABLE, 
		"NBTITLE" VARCHAR2(200 BYTE) NOT NULL ENABLE, 
		"NBCONTENT" VARCHAR2(2000 BYTE), 
		"NBIMAGE1" VARCHAR2(50 BYTE), 
		"NBREALIMAGE1" VARCHAR2(50 BYTE), 
		"NBLOOKCOUNT" NUMBER(20,0) DEFAULT 0 NOT NULL ENABLE, 
		"NBIMAGECOUNT" NUMBER(2,0) NOT NULL ENABLE, 
		"NBREGDATE" DATE DEFAULT SYSDATE NOT NULL ENABLE, 
		 CONSTRAINT "PK_NOTICEBOARD" PRIMARY KEY ("NBNUM")
	  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
	  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
	  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
	  TABLESPACE "SYSTEM"  ENABLE
	   ) SEGMENT CREATION IMMEDIATE 
	  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
	  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
	  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
	  TABLESPACE "SYSTEM" ;
	  */
	
	private int nbnum;
	private int membernum;
	private String nbtitle;
	private String nbcontent;
	private String nbimage1;
	private String nbrealimage1;
	private int nblookcount;
	private int nbimagecount;
	private Date nbregdate;
	
	public int getNbnum() {
		return nbnum;
	}
	public void setNbnum(int nbnum) {
		this.nbnum = nbnum;
	}
	public int getMnum() {
		return membernum;
	}
	public void setMnum(int mnum) {
		this.membernum = membernum;
	}
	public String getNbtitle() {
		return nbtitle;
	}
	public void setNbtitle(String nbtitle) {
		this.nbtitle = nbtitle;
	}
	public String getBscontent() {
		return nbcontent;
	}
	public void setBscontent(String bscontent) {
		this.nbcontent = nbcontent;
	}
	public String getNbimage1() {
		return nbimage1;
	}
	public void setNbimage1(String nbimage1) {
		this.nbimage1 = nbimage1;
	}
	public String getNbrealimage1() {
		return nbrealimage1;
	}
	public void setNbrealimage1(String nbrealimage1) {
		this.nbrealimage1 = nbrealimage1;
	}
	public int getNblookcount() {
		return nblookcount;
	}
	public void setNblookcount(int nblookcount) {
		this.nblookcount = nblookcount;
	}
	public int getNbimagecount() {
		return nbimagecount;
	}
	public void setNbimagecount(int nbimagecount) {
		this.nbimagecount = nbimagecount;
	}
	public Date getNbregdate() {
		return nbregdate;
	}
	public void setNbregdate(Date nbregdate) {
		this.nbregdate = nbregdate;
	}
	
	
	
	
	

}
