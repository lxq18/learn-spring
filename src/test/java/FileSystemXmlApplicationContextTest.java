import com.lxq18.learn.spring.service.TeacherService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationContextTest {

    @Test
    public void test() {
        String configLocation = "E:\\lxq\\my_projects\\codes\\learn-spring\\src\\test\\resources\\application-context.xml";
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(configLocation);
        TeacherService teacherService = (TeacherService) applicationContext.getBean("teacherService");
        teacherService.teach();
    }
}
