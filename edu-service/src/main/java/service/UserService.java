package service;

import model.User;
import service.base.BaseService;

public interface UserService extends BaseService<User> {
    public User login(String username, String password);
}
