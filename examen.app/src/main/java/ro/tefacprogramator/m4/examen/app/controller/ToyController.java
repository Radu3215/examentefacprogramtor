package ro.tefacprogramator.m4.examen.app.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ro.tefacprogramator.m4.examen.app.service.ToyService;
import ro.tefacprogramator.m4.examen.app.entity.Toy;
@RestController
public class ToyController {
    
    @Autowired
    private ToyService service;

    @GetMapping("/toys")
    @CrossOrigin
    public Object getToys() {
        if(service.getAllToys().isEmpty()){
            return "There are no records available.";
        }
        return service.getAllToys();
    }
    
    @PostMapping("/toys")
    @CrossOrigin
    public Object getToys(@RequestBody Toy toy) {
        var response = new HashMap<String, Object>();
        boolean result = service.createNewToy(toy);
        if (result) {
            response.put("message", "Toy created");
            response.put("succes", true);
            return ResponseEntity.ok().body(response);
        } else {
            response.put("message", "Toy not created");
            response.put("succes", false);
            return ResponseEntity.ok().body(response);
        }
    }
}
