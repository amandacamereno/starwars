package com.example.sw.controller;

import com.example.sw.entidades.Personagens;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value= "/personagens")
public class PersonagensController {


    @GetMapping
    public ResponseEntity<Personagens> findAll() {
        Personagens teste1 = new Personagens(null, "Luke", 1.72, 60.0,
                "XXXX", "31/03/2022", "ainda nao");
        return ResponseEntity.ok().body(teste1);
    }
}


