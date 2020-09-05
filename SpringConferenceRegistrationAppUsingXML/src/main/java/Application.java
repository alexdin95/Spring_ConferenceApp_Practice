
import com.plsProject.service.SpeakerService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpeakerService service = appContext.getBean("speakerService",SpeakerService.class);
        //SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
