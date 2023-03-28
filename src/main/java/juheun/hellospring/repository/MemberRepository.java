package juheun.hellospring.repository;

import juheun.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
