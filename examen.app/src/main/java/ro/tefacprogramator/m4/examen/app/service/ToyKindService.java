package ro.tefacprogramator.m4.examen.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.tefacprogramator.m4.examen.app.repository.ToyKindRepository;



@Service
public class ToyKindService {
    
    @Autowired
    private ToyKindRepository toyKindRepository;
}
