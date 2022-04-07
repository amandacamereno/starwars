package com.example.sw.Repository;


import com.example.sw.entidades.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface FilmeRepository extends JpaRepository<Filme,Integer> {
    Optional<Filme> findById(Integer id);

}

