package nl.ncim;


import nl.ncim.service.ProgrammerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        ProgrammerService service = appContext.getBean("programmerService", ProgrammerService.class);

        System.out.println(service.findAll().get(0).getFirstname());
    }

}
