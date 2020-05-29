package service.impl;

import model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;
import service.base.BaseServiceImpl;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{
    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUUID(String uuid) {
        return null;
    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }
}
