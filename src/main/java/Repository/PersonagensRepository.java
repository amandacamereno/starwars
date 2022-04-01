package Repository;

import com.example.sw.entidades.Personagens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagensRepository extends JpaRepository <Personagens ,Integer> {

}
