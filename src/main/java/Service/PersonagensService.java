package Service;

import Repository.PersonagensRepository;
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
}
