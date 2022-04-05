package Service;

import Repository.FilmeRepository;
import com.example.sw.entidades.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> findAll() {
        return filmeRepository.findAll();
    }

    public Filme findById(Integer id) {
        Optional<Filme> filme = filmeRepository.findById(id);
        return filme.get();
    }

    public Filme registro(Filme obj) {
        return filmeRepository.save(obj);
    }

    public void deletar(Integer id) {
        filmeRepository.deleteById(id);
    }

    public Filme atualizar(Integer id,Filme obj) {
        Filme filme = filmeRepository.getOne(id);
        updateData(filme,obj);
        return filmeRepository.save(filme);
    }

    private void updateData(Filme filme, Filme obj) {
        filme.setTitulo(obj.getTitulo());
        filme.setEpisodio(obj.getEpisodio());
        filme.setSinopse(obj.getSinopse());
        filme.setDiretor(obj.getDiretor());
        filme.setProdutor(obj.getProdutor());
        filme.setDataLancamento(obj.getDataLancamento());
        filme.setCriated(obj.getCriated());
        filme.setEdited(obj.getEdited());
    }
}