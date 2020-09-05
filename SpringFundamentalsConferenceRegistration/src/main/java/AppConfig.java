import com.plsProject.repository.HibernateSpeakerRepositoryImpl;
import com.plsProject.repository.SpeakerRepository;
import com.plsProject.service.SpeakerService;
import com.plsProject.service.SpeakerServiceImpl;
import com.plsProject.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.plsProject"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();  // De aici obtinem instanta din Factory-ul nostru
    }
/*
    @Bean(name = "speakerService")
    @Scope(value= BeanDefinition.SCOPE_SINGLETON) //BeanDefinition.SCOPE_SINGLETON =="singleton"
    public SpeakerService getSpeakerService() {
        //Constructor Injection //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //Setter Injection //service.setRepository(getSpeakerRepository()); //chemama bean-ul creat mai jos pentru a seta Repository pt Service.
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
    }


    //Cream un bean nou pt speakerRepository
    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }*/
}


