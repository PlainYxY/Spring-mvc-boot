import com.yxy.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppOrder {
    public static void main(String[] args) {
        // 通过静态工厂造对象
        // OrderDao orderDao = OrderDaoFactory.getOrderDao();
        // orderDao.save();

        // 使用静态工厂实例化bean
        ApplicationContext act = new ClassPathXmlApplicationContext("applitcationContext.xml");
        OrderDao orderDao = (OrderDao) act.getBean("orderDao");
        orderDao.save();
    }
}
