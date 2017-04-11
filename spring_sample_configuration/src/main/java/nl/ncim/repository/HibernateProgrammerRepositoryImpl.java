package nl.ncim.repository;

import nl.ncim.model.Programmer;

import java.util.ArrayList;
import java.util.List;


public class HibernateProgrammerRepositoryImpl implements ProgrammerRepository {

   @Override
   public List<Programmer> findaAll(){
      List customers = new ArrayList<>();

      Programmer programmer = new Programmer();

      programmer.setFirstname("Robert");
      programmer.setLastname("van Rijn");

       customers.add(programmer);
       return customers;
   }


}
