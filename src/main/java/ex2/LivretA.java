package ex2;

/**
 * Représente un livret A, qui est un type de compte bancaire avec un taux de rémunération.
 */
public class LivretA extends CompteBancaire {

    /**
     * Constructeur pour créer un Livret A avec un solde initial et un taux de rémunération.
     * @param type de compte verifier que ce sois bien un "Livret A"
     * @param solde le solde initial du livret A
     * @param tauxRemuneration le taux de rémunération applicable au livret A
     */
    public LivretA(String type; double solde, double tauxRemuneration) {
        
        // Appel du constructeur de la classe parente CompteBancaire
        // Avec le type, le solde initial, 0 comme découvert autorisé (car un Livret A n'a pas de découvert autorisé) et le taux de rémunération
        // Utilisation du constructeur pour livret A
        if (!type.equals("LA")) {
            throw new IllegalArgumentException("Type de compte invalide. Le type doit être 'LA' pour un Livret A.");
        }
        super(type, solde, 0, tauxRemuneration);
    }
}
