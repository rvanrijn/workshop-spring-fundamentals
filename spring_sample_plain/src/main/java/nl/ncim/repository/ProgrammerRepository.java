package nl.ncim.repository;

import nl.ncim.model.Programmer;

import java.util.List;

public interface ProgrammerRepository {
    List<Programmer> findaAll();
}
