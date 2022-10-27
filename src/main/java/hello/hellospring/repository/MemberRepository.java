package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    java.lang.reflect.Member save(java.lang.reflect.Member member);

    Member save(Member member);
    Optional<Member> findById(Long Id);
    Optional<Member> findByName(String Name);
    List<Member> findAll();
}
