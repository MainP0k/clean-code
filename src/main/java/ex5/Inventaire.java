package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente l'inventaire contenant plusieurs caisses.
 */
public class Inventaire {

    private List<Caisse> caisses;

    /**
     * Constructeur pour créer un inventaire avec des caisses prédéfinies.
     */
    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", 5));
        caisses.add(new Caisse("Moyens objets", 20));
        caisses.add(new Caisse("Grands objets", Integer.MAX_VALUE));
    }

    /**
     * Ajoute un item à la caisse appropriée selon son poids.
     *
     * @param item l'objet à ajouter
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.peutAccepter(item)) {
                caisse.getItems().add(item);
                return;
            }
        }
        throw new IllegalArgumentException("Aucune caisse ne peut accepter cet objet : " + item.getNom());
    }

    /**
     * Retourne le nombre total d'items dans toutes les caisses.
     *
     * @return le nombre total d'items
     */
    public int taille() {
        int total = 0;
        for (Caisse caisse : caisses) {
            total += caisse.getItems().size();
        }
        return total;
    }
}
