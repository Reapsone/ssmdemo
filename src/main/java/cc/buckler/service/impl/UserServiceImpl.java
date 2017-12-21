package cc.buckler.service.impl;

import cc.buckler.dao.UserMapper;
import cc.buckler.pojo.User;
import cc.buckler.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userDao;

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}
