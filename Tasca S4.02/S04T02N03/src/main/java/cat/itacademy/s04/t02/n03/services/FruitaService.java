package cat.itacademy.s04.t02.n03.services;

import cat.itacademy.s04.t02.n03.model.Fruita;

import java.util.List;
import java.util.Optional;

public interface FruitaService {
    Fruita addFruita(Fruita fruita);
    Fruita updateFruita(Fruita fruita);
    void deleteFruita(String id);
    Optional<Fruita> getFruitaById(String id);
    List<Fruita> getAllFruites();
}
