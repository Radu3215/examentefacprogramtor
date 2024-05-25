package ro.tefacprogramator.m4.examen.app.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.tefacprogramator.m4.examen.app.entity.Toy;
import ro.tefacprogramator.m4.examen.app.repository.ToyRepository;


@Service
public class ToyService {
    
    @Autowired
    private ToyRepository toyRepository;

    public List<Toy> getAllToys() {
        var getAllToys = new ArrayList<Toy>();
        toyRepository.findAll().forEach(p -> getAllToys.add(p));
        return getAllToys;
    }

    public boolean createNewToy(Toy toy) {
        if(toy.getDescription() == null){
            return false;
        }
        if(toy.getPrice() <= 0){
            return false;
        }
        toyRepository.save(toy);
        return true;
    }
}
