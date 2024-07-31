//package jvbz.boot.vss.member.service;
//
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import jakarta.inject.Inject;
//import jvbz.boot.vss.member.entity.Member;
//import jvbz.boot.vss.member.repository.MemberRepository;
//
//// spring의 서비스 컴포넌트임을 나타낸다.
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//	@Inject
//	private MemberRepository memberRepository;
//
//	// 사용자 이름인 userId을 기반으로 사용자 세부 정보를 로드한다.
//	@Override
//	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
//		// 사용자 이름이 admin일 경우에 하드코딩된 관리자 계정을 반환한다.
//		if ("admin".equals(userId)) {
//			return User.withUsername("admin").password("{noop}1234").roles("ADMIN").build();
//		}
//		// memberRepository를 사용하여 DB에서 사용자 정보를 조회한다.
//		Member member = memberRepository.findByUserId(userId);
//		if (userId == null) {
//			// 사용자를 찾지 못한 경우 예외를 발생시킨다.
//			throw new UsernameNotFoundException("아이디를 찾을 수 없습니다.");
//		}
//
//		// 일반 유저에 해당하는 UserDetails 객체를 생성하여 반환한다.
//		return User.withUsername(member.getUserId())
//				.password(member.getUserPw())
//				.roles(member.getUserGrade())
//				.build();
//	}
//
//}
