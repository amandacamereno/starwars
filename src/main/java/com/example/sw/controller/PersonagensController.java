package com.example.sw.controller;


import com.example.sw.Service.PersonagensService;
import com.example.sw.entidades.Personagens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value= "/personagens")
public class PersonagensController {

    @Autowired
    private PersonagensService personagensService;


    @GetMapping
    public ResponseEntity<List<Personagens>> findAll() {
        List<Personagens> list = personagensService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Personagens> findById(@PathVariable Integer id) {
        Personagens obj = personagensService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Personagens> inserir(@RequestBody Personagens obj) {
        obj = personagensService.registro(obj);
        //URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.ok(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        personagensService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Personagens> atualizar(@PathVariable Integer id, @RequestBody Personagens obj) {
        obj = personagensService.atualizar(id, obj);
        return ResponseEntity.ok().body(obj);

    }
}


