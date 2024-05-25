package ro.tefacprogramator.m4.examen.app.repository;

import org.springframework.data.repository.CrudRepository;

import ro.tefacprogramator.m4.examen.app.entity.Toy;


public interface ToyRepository extends CrudRepository<Toy, Integer>{

    
}