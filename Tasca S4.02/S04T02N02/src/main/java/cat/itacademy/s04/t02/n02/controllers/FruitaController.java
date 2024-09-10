package cat.itacademy.s04.t02.n02.controllers;

import cat.itacademy.s04.t02.n02.model.Fruita;
import cat.itacademy.s04.t02.n02.services.FruitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruita")
public class FruitaController {

    @Autowired
    private FruitaService fruitaService;

    @PostMapping("/add")
    public ResponseEntity<Fruita> addFruita(@RequestBody Fruita fruita) {
        if (fruita.getNom() == null || fruita.getNom().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Fruita newFruita = fruitaService.addFruita(fruita);
        return new ResponseEntity<>(newFruita, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Fruita> updateFruita(@RequestBody Fruita fruita) {
        if (fruita.getId() == 0 || fruita.getNom() == null || fruita.getNom().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return fruitaService.getFruitaById(fruita.getId())
                .map(existingFruita -> {
                    Fruita updatedFruita = fruitaService.updateFruita(fruita);
                    return new ResponseEntity<>(updatedFruita, HttpStatus.OK);
                })
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruita(@PathVariable int id) {
        if (fruitaService.getFruitaById(id).isPresent()) {
            fruitaService.deleteFruita(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruita> getFruita(@PathVariable int id) {
        return fruitaService.getFruitaById(id)
                .map(fruita -> new ResponseEntity<>(fruita, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruita>> getAllFruites() {
        List<Fruita> fruites = fruitaService.getAllFruites();
        if (fruites.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(fruites, HttpStatus.OK);
    }
}

