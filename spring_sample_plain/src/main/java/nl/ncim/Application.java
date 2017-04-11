package nl.ncim;

import nl.ncim.service.ProgrammerService;
import nl.ncim.service.ProgrammerServiceImpl;

public class Application {

    public static void main(String[] args) {
        ProgrammerService programmerService = new ProgrammerServiceImpl();

        System.out.println(programmerService.findAll().get(0).getFirstname());
    }

}
