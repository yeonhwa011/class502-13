package member.repositories;

import member.entities.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface MemberRepository extends CrudRepository<Member, Long> {

}
