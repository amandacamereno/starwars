package com.example.sw.Service;

import com.example.sw.Repository.PersonagensRepository;
import com.example.sw.entidades.Personagens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonagensService {

    @Autowired
    private PersonagensRepository personagensRepository;
    public List<Personagens> findAll() {return personagensRepository.findAll();}
    public Personagens findById(Integer id) {
        Optional<Personagens> obj = personagensRepository.findById(id);
        return obj.get();
    }
   public Personagens registro (Personagens obj){
        return personagensRepository.save(obj);
   }
    public void deletar(Integer id) {
        personagensRepository.deleteById(id);
    }

    public Personagens atualizar(Integer id, Personagens obj) {
        Personagens personagens = personagensRepository.getOne(id);
        updateData(personagens,obj);
        return personagensRepository.save(personagens);
    }

    private void updateData(Personagens personagens, Personagens obj) {
        personagens.setNome(obj.getNome());
        personagens.setAltura(obj.getAltura());
        personagens.setPeso(obj.getPeso());
        personagens.setData_aniversario(obj.getData_aniversario());
        personagens.setCriated(obj.getCriated());
        personagens.setEdited(obj.getEdited());
        personagens.setGenero(obj.getGenero());
        personagens.setEspecie(obj.getEspecie());
        personagens.setCorPeleList(obj.getCorPeleList());
        personagens.setCorCabeloList(obj.getCorCabeloList());
        personagens.setCorOlhosList(obj.getCorOlhosList());
    }


}

