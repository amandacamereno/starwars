package com.example.sw.Repository;

import com.example.sw.entidades.Personagens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonagensRepository extends JpaRepository <Personagens,Integer> {
    Optional<Personagens> findById(Integer id);

}
