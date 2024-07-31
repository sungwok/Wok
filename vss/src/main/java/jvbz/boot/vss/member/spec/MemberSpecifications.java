package jvbz.boot.vss.member.spec;

import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jvbz.boot.vss.member.entity.Member;

public class MemberSpecifications {
	public static Specification<Member> hasUserId(String userId) {
		return (Root<Member> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
			if (userId == null || userId.isEmpty()) {
				return cb.conjunction();
			}
			return cb.equal(root.get("userId"), userId);
		};
	}

}
