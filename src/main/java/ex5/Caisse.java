package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une caisse contenant des objets.
 */
public class Caisse {

    private String nom;
    private List<Item> items;
    private int poidsMax;

    /**
     * Constructeur pour créer une caisse avec un nom et un poids maximum.
     *
     * @param nom le nom de la caisse
     * @param poidsMax le poids maximum des objets que la caisse peut contenir
     */
    public Caisse(String nom, int poidsMax) {
        this.nom = nom;
        this.items = new ArrayList<>();
        this.poidsMax = poidsMax;
    }

    /**
     * Getter pour l'attribut nom.
     *
     * @return le nom de la caisse
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom.
     *
     * @param nom le nom à définir pour la caisse
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items.
     *
     * @return la liste des items dans la caisse
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items.
     *
     * @param items la liste des items à définir pour la caisse
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * Getter pour l'attribut poidsMax.
     *
     * @return le poids maximum des objets que la caisse peut contenir
     */
    public int getPoidsMax() {
        return poidsMax;
    }

    /**
     * Vérifie si la caisse peut accepter un item basé sur son poids.
     *
     * @param item l'objet à ajouter
     * @return true si l'objet peut être ajouté, false sinon
     */
    public boolean peutAccepter(Item item) {
        return item.getPoids() <= poidsMax;
    }
}
