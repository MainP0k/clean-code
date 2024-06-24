package ex3;

/**
 * Classe de l'application pour gérer le zoo.
 */
public class ZooApplication {

    /**
     * Méthode principale pour exécuter l'application du zoo.
     *
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        // Création d'une instance de Zoo avec le nom "Thoiry"
        Zoo zoo = new Zoo("Thoiry");

        // Ajout des animaux au zoo
        zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
        zoo.addAnimal("Zèbre", "MAMMIFERE", "HERBIVORE");
        zoo.addAnimal("Lion", "MAMMIFERE", "CARNIVORE");             // zoo.addAnimal("Lion", "MAMMIFERE", "HERBIVORE");            // Correction : devrait être CARNIVORE
        zoo.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
        zoo.addAnimal("Requin blanc", "POISSON", "CARNIVORE")         // zoo.addAnimal("Requin blanc", "POISSON", "HERBIVORE");     // Correction : devrait être CARNIVORE
        zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
        zoo.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
        zoo.addAnimal("Python", "SERPENT", "CARNIVORE");

        // Affichage de la liste des animaux
        zoo.afficherListeAnimaux();
    }
}
