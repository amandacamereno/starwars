package com.example.sw.controller;


import Service.FilmeService;
import com.example.sw.entidades.Filme;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value= "/filmes")
public class FilmeController {

   //@Autowired
    private FilmeService filmeService;

    @GetMapping
    public List <Filme> findAll() {
        Filme filme = new Filme(null, "A new hope", "4", "A princesa Leia é mantida refém pelas forças imperiais comandadas por Darth Vader. Luke Skywalker e o capitão Han Solo precisam libertá-la e restaurar a liberdade e a justiça na galáxia.", "George Lucas", "Gary Kurtz, Rick McCallum", "1977-05-25", "2022-04-04", "ainda nao");
        return filmeService.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Filme>findById(@PathVariable Integer id) {
        Filme filme= filmeService.findById(id);
        return ResponseEntity.ok().body(filme);
    }

    @PostMapping
    public Filme registro(@RequestBody Filme filme) {
        filme = filmeService.registro(filme);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(filme.getId()).toUri();
        return filmeService.registro(filme);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){
        filmeService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Filme> atualizar(@PathVariable Integer id,@RequestBody Filme filme) {
        filme = filmeService.atualizar(id, filme);
        return ResponseEntity.ok().body(filme);
    }
}