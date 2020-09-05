
import com.plsProject.model.Speaker;
import com.plsProject.service.SpeakerService;
import com.plsProject.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //Nu mai este nevoie  // SpeakerService service = new SpeakerServiceImpl();

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service); // adresa obiectului service pt a vedea daca este singleton
        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getSeedNum());

        //SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
        //System.out.println(service2); // adresa obiectului service2 pt a vedea daca este singleton
    }
}