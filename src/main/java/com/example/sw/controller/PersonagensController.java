package com.example.sw.controller;


import Service.PersonagensService;
import com.example.sw.entidades.Filme;
import com.example.sw.entidades.Personagens;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping(value= "/personagens")
public class PersonagensController {

    //@Autowired
    private PersonagensService personagensService;


    @GetMapping
    public ResponseEntity<Personagens> findAll() {
        Personagens teste1 = new Personagens(null, "Luke", 1.72, 60.0,
                "XXXX", "31/03/2022", "ainda nao");
        return ResponseEntity.ok().body(teste1);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Personagens> findById(@PathVariable Integer id) {
        Personagens obj = personagensService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Personagens> inserir (@RequestBody Personagens obj){
        obj = personagensService.registro(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }


}


