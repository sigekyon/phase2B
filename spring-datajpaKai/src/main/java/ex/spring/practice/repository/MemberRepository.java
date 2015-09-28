package ex.spring.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ex.spring.practice.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

	// 名前によるクエリメソッド生成
	public List<Member> findByMail(String mail) ;

	@Query(name="Member.testSelect")
	public  Member testSelect(
			@Param("id") Long id
			);
}
