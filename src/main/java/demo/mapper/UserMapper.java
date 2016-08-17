package demo.mapper;

import demo.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016-8-17.
 */
@Repository
public interface UserMapper {
    public int addUser(User user);
}
