package jvbz.boot.vss.member.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//기본 생성자를 자동으로 생성한다.
@NoArgsConstructor
@Getter
@Setter
//클래스가 JPA 엔티티임을 나타낸다.
@Entity
//클래스명을 테이블명으로 선언한다.
public class Member {
	// 필드가 엔티티의 기본키임을 나타낸다.
	@Id
	
	@Column(name = "user_id")
	private String userId;

	@Column(name = "user_pw")
	private String userPw;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_bdate")
	private String userBdate;

	@Column(name = "user_age")
	private int userAge;

	@Column(name = "user_email")
	private String userEmail;

	@Column(name = "user_phone")
	private String userPhone;

	@Column(name = "user_regdate")
	private LocalDate userRegdate;

	@Column(name = "user_grade")
	private String userGrade;

	@Column(name = "verification_code") // 인증 코드 필드 추가
	private String verificationCode; // 회원 가입 시 인증 코드 저장

}