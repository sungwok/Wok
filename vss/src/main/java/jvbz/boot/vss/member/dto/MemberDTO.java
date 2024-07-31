package jvbz.boot.vss.member.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MemberDTO {
	
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_bdate;
	private int user_age;
	private String user_email;
	private String user_phone;
	private LocalDate user_regdate;
	private String user_grade;
	
}
