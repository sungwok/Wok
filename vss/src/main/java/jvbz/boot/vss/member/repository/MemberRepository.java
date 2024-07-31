package jvbz.boot.vss.member.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import jvbz.boot.vss.member.entity.Member;

// Member 엔티티에 대한 데이터 접근 계층을 정의하며 기본적인 CRUD 작업을 자동으로 제공한다.
public interface MemberRepository extends JpaRepository<Member, String>, JpaSpecificationExecutor<Member>{
	Member findByUserId(String userId);

	// 이메일과 전화번호 기준 회원 조회 메서드
	List<Member> findByUserEmailAndUserPhone(String userEmail, String userPhone);
	
	// 이메일과 아이디 기준 회원 조회 메서드
	Member findByUserEmailAndUserId(String userEmail, String userId);

	Member findByUserEmail(String userEmail);

}
