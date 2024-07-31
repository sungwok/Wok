package jvbz.boot.vss.member.service;

import java.util.Random;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.inject.Inject;
import jakarta.mail.internet.MimeMessage;
import jvbz.boot.vss.member.dto.MailDTO;

@Service
public class EmailSendService {
	@Inject
	private JavaMailSender javaMailSender;

	public void sendEmail(MailDTO mailDTO) {
		try {
			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");

			helper.setTo(mailDTO.getAddress());
			helper.setSubject(mailDTO.getTitle());
			helper.setText(mailDTO.getMessage(), true); // HTML 형식으로 전송
			helper.setFrom("21st_bp@naver.com"); // 발신자 설정

			javaMailSender.send(mimeMessage);
		} catch (Exception e) {
			e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
			throw new RuntimeException("이메일 전송 중 오류가 발생했습니다.", e); // 예외를 RuntimeException으로 래핑하여 전파
		}
	}

	// 6자리 숫자를 랜덤으로 생성하는 메소드
	public String generateVerificationCode() {
		Random random = new Random();
		int code = random.nextInt(900000) + 100000; // 100000 이상 999999 이하의 랜덤 숫자 생성
		return String.valueOf(code);
	}
}