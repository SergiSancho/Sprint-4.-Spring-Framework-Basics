package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.model.Fruita;
import java.util.List;
import java.util.Optional;

public interface FruitaService {
    Fruita addFruita(Fruita fruita);
    Fruita updateFruita(Fruita fruita);
    void deleteFruita(int id);
    Optional<Fruita> getFruitaById(int id);
    List<Fruita> getAllFruites();
}
