import entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangxiang
 * @since 2021/3/26 10:03
 */
public class FirstSpringDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myBean.xml");
        Person person = (Person) applicationContext.getBean("wang");
        Person person2 = (Person) applicationContext.getBean("wang");
        System.out.println(person);
        System.out.println(person == person2);
    }
}
