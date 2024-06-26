package CW.chatbot.repositories;

import CW.chatbot.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

// JpaRepository를 이용한 데이터 접근
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
