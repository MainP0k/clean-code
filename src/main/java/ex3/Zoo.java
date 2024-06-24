package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un zoo avec une liste d'animaux.
 */
public class Zoo {

    private String nom;
    private List<String> types;
    private List<String> noms;
    private List<String> comportements;

    /**
     * Constructeur pour créer un zoo avec un nom.
     *
     * @param nom le nom du zoo
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.types = new ArrayList<>();
        this.noms = new ArrayList<>();
        this.comportements = new ArrayList<>();
    }

    /**
     * Ajoute un animal au zoo.
     *
     * @param nomAnimal le nom de l'animal
     * @param typeAnimal le type de l'animal (ex. mammifère, poisson, etc.)
     * @param comportement le comportement de l'animal (ex. herbivore, carnivore, etc.)
     */
    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    /**
     * Affiche la liste des animaux présents dans le zoo.
     */
    public void afficherListeAnimaux() {
        for (int i = 0; i < types.size(); i++) {
            System.out.println(noms.get(i) + " " + types.get(i) + " " + comportements.get(i));
        }
    }

    /**
     * Retourne la taille du zoo (le nombre d'animaux).
     *
     * @return le nombre d'animaux dans le zoo
     */
    public int taille() {
        return types.size();
    }

    /**
     * Getter pour le nom du zoo.
     *
     * @return le nom du zoo
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom du zoo.
     *
     * @param nom le nom à définir pour le zoo
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
