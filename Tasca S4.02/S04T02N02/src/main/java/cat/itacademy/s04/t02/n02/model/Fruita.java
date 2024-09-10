package cat.itacademy.s04.t02.n02.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fruita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private int quantitatQuilos;

    public Fruita() {}

    public Fruita(String nom, int quantitatQuilos) {
        this.nom = nom;
        this.quantitatQuilos = quantitatQuilos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }
}
