package jp.ex.sample.repositories;

import jp.ex.sample.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{

}
