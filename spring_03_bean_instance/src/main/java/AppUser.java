import com.yxy.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppUser {
    public static void main(String[] args) {

        // // 创建实例工厂对象
        // UserDaoFactory userDaoFactory = new UserDaoFactory();
        // // 通过实例工厂对象创建对象
        // UserDao userDao = userDaoFactory.getUserDao();
        // userDao.save();

        ApplicationContext act = new ClassPathXmlApplicationContext("applitcationContext.xml");
        UserDao userDao2 = (UserDao) act.getBean("userDao");
        UserDao userDao1 = (UserDao) act.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);

        // userDao.save();
    }
}
