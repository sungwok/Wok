package jvbz.boot.vss.member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MailDTO {
	
	private String address;
	private String title;
	private String message;
	private String verificationCode;
	private String from; // 보내는 사람 이메일 추가

}
