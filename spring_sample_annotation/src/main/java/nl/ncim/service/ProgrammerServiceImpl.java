package nl.ncim.service;

import nl.ncim.model.Programmer;
import nl.ncim.repository.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("programmerService")
public class ProgrammerServiceImpl implements ProgrammerService {


    //@Autowired
    private ProgrammerRepository programmerRepository;


    @Autowired
    public ProgrammerServiceImpl(ProgrammerRepository programmerRepository) {
        System.out.print("Constructor Injection");
        this.programmerRepository = programmerRepository;
    }

    //@Autowired
    public void setCustomerRepository(ProgrammerRepository customerRepository) {
        System.out.println("Setter Injection");
        this.programmerRepository = customerRepository;
    }

    @Override
    public List<Programmer> findAll() {
        return programmerRepository.findaAll();
    }


}
