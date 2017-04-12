package nl.ncim;

import nl.ncim.repository.HibernateProgrammerRepositoryImpl;
import nl.ncim.repository.ProgrammerRepository;
import nl.ncim.service.ProgrammerService;
import nl.ncim.service.ProgrammerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="programmerService")
    public ProgrammerService getProgrammerService() {
        return new ProgrammerServiceImpl();
    }

    @Bean(name="programmerRepository")
    public ProgrammerRepository getProgrammerRepository(){
        return new HibernateProgrammerRepositoryImpl();
    }
}
