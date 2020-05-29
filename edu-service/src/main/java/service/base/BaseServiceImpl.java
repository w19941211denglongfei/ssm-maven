package service.base;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    protected UserMapper userMapper;
}
