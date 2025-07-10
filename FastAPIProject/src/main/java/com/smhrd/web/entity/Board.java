package com.smhrd.web.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
	
	// 게시글 하나를 표현할 수 있는 나만으 자료형(VO)
	private int bnum;// 게시글을 구분할 수 있느 ㄴ고유번호
	private String title;// 제목
	private String writer;// 작서앚
	private String content; // 내용
	private int bcnt; // 조회수
	private Date indate;// 게시글 작성일

}
