package jp.ex.sample.services;

import jp.ex.sample.entities.User;
import jp.ex.sample.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("service")
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;


    public User findByUserIdAndPassWord(Integer user_id,String password){

        return userRepository.findByUserIdAndPassWord(user_id,password);

    }

}
