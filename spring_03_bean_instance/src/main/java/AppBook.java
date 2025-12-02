import com.yxy.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBook {
    public static void main(String[] args) {
        // 1.构造方法注入
        ApplicationContext act = new ClassPathXmlApplicationContext("applitcationContext.xml");
        BookDao bookDao = (BookDao) act.getBean("bookDao");
        bookDao.save();
    }
}
