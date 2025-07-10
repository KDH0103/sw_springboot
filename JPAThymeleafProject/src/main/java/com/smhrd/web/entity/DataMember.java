package com.smhrd.web.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.hibernate.annotations.ColumnDefault;

import lombok.Data;

@Data
// 엔티티
@Entity
// 해당하는 클래스가 datamember 테이블을 나타내는 클래스임을 표시
@Table(name="datamember")
public class DataMember {
	// DB 테이블 자체를 의미하는 클래스
	
	// @Id : primary key 의미
	@Id// 제공하는 package가 persistence여야 함 ! 다른 패키지랑 헷갈리지 말것
	//@Column : 해당하는 필드에 대응되는 테이블 컬럼의 디테일한 설정 가능
	@Column(name="id",length = 100)
	private String id;
	@Column(nullable=false,length = 100)
	private String pw;
	
	@ColumnDefault("'users'")
	@Column(nullable = false)
	private String role = "users";
}
