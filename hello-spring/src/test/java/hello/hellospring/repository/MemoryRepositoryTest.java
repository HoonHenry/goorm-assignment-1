package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class MemoryRepositoryTest {
//    MemoryMemberRepository repository = new MemoryMemberRepository();
//
//    @AfterEach
//    public void afterEach() {
//        repository.clearStore();
//    }
//
//    @Test
//    public void save() {
//        Member member = new Member();
//        member.setName("John");
//        repository.save(member);
//        Member result = repository.findById(member.getId()).get();
////        System.out.println("result = " + (result==member));
////        Assertions.assertEquals(member, result);
//        assertThat(member).isEqualTo(result);
//    }
//
//    @Test
//    public void findByName() {
//        Member member1 = new Member();
//        member1.setName("John");
//        repository.save(member1);
//
//        Member member2 = new Member();
//        member2.setName("Sarah");
//        repository.save(member2);
//
//        Member result = repository.findByName("John").get();
//        assertThat(result).isEqualTo(member1);
//    }
//
//    @Test
//    public void findAll() {
//        Member member1 = new Member();
//        member1.setName("John");
//        repository.save(member1);
//
//        Member member2 = new Member();
//        member2.setName("Sarah");
//        repository.save(member2);
//
//        List<Member> result = repository.findAll();
//        assertThat(result.size()).isEqualTo(2);
//    }
}
