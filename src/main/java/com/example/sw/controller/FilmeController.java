package com.example.sw.controller;


import org.springframework.beans.factory.annotation.Autowired;
import com.example.sw.Service.FilmeService;
import com.example.sw.entidades.Filme;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;

@RequestMapping (value = "/filme")
@RestController
public class FilmeController {
    @Autowired
    private FilmeService filmeService;


    @GetMapping
    public ResponseEntity<List<Filme>> findAll(){
        List<Filme> list = filmeService.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping( "/{id}")
    public ResponseEntity<Filme> findById(@PathVariable Integer id){
        Filme obj = filmeService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @PostMapping
    public ResponseEntity<Filme> registro(@RequestBody Filme obj){
        obj = filmeService.registro(obj);
        return ResponseEntity.ok().body(obj);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){
        filmeService.deletar(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Filme> atualizar (@PathVariable Integer id, @RequestBody Filme obj){
        obj = filmeService.atualizar(id, obj);
        return ResponseEntity.ok().body(obj);

    }





}
