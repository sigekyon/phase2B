package jp.ex.sample.repositories;

import jp.ex.sample.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<User, Integer>
{

    @Query(name = "User.findByUserIdAndPassWord")
    public User findByUserIdAndPassWord(
            @Param("userId") Integer user_id,
            @Param("passWord") String passWord
            );
}
