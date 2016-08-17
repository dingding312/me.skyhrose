import demo.mapper.UserMapper;
import demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestUserDAO {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testAddUser() {
        User user=new User();
        user.setUsername("admin");
        user.setPassword("pass");
        userMapper.addUser(user);
    }
}

