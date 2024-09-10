package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.model.Fruita;
import cat.itacademy.s04.t02.n01.repository.FruitaRepository;
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
    public void deleteFruita(int id) {
        fruitaRepository.deleteById(id);
    }

    @Override
    public Optional<Fruita> getFruitaById(int id) {
        return fruitaRepository.findById(id);
    }

    @Override
    public List<Fruita> getAllFruites() {
        return fruitaRepository.findAll();
    }
}
