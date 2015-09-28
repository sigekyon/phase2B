package jp.ex.sample.services;

import jp.ex.sample.entities.User;

public interface UserService {
    public User findByUserIdAndPassWord(Integer user_id,String password);
}
