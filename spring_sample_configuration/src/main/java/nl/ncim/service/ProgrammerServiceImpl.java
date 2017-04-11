package nl.ncim.service;

import nl.ncim.model.Programmer;
import nl.ncim.repository.HibernateProgrammerRepositoryImpl;
import nl.ncim.repository.ProgrammerRepository;

import java.util.List;


public class ProgrammerServiceImpl implements ProgrammerService {


    private ProgrammerRepository programmerRepository = new HibernateProgrammerRepositoryImpl();


    @Override
    public List<Programmer> findAll() {
        return programmerRepository.findaAll();
    }


    public void setProgrammerRepository(HibernateProgrammerRepositoryImpl programmerRepository) {
    }
}
