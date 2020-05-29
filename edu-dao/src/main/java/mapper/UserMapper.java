package mapper;

import mapper.base.BaseMapper;
import model.User;

public interface UserMapper extends BaseMapper<User> {
    public User findById(Integer id);
    public void deleteById(Integer id);
    public void update(User user);
    public void insert(User user);
}
