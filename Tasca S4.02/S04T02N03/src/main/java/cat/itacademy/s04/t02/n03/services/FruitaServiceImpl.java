package cat.itacademy.s04.t02.n03.services;

import cat.itacademy.s04.t02.n03.model.Fruita;
import cat.itacademy.s04.t02.n03.repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitaServiceImpl implements FruitaService {

    @Autowired
    private FruitaRepository fruitaRepository;

    @Override
    public Fruita addFruita(Fruita fruita) {
        return fruitaRepository.save(fruita);
    }

    @Override
    public Fruita updateFruita(Fruita fruita) {
        return fruitaRepository.save(fruita);
    }

    @Override
    public void deleteFruita(String id) {
        fruitaRepository.deleteById(id);
    }

    @Override
    public Optional<Fruita> getFruitaById(String id) {
        return fruitaRepository.findById(id);
    }

    @Override
    public List<Fruita> getAllFruites() {
        return fruitaRepository.findAll();
    }
}
