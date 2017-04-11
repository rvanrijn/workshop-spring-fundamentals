package nl.ncim;

import nl.ncim.model.Programmer;
import nl.ncim.service.ProgrammerService;
import nl.ncim.service.ProgrammerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
       // ProgrammerService programmerService = new ProgrammerServiceImpl();


        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ProgrammerService service = appContext.getBean("programmerService", ProgrammerService.class);

        System.out.println(service.findAll().get(0).getFirstname());
    }

}
