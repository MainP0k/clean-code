package ex2;

/**
 * Représente un compte bancaire de type compte courant (CC) ou livret A (LA).
 */
public class CompteBancaire {

/**
 * Enumération représentant les types de comptes bancaires disponibles.
 * Chaque type de compte a des caractéristiques et des règles spécifiques :
 * - CC : Compte Courant.
 * - LA : Livret A.
 */
public enum TypeCompte {
    CC, // Compte Courant
    LA  // Livret A
}

    
    private double solde;
    private double decouvert;
    private double tauxRemuneration;
    private final TypeCompte type;

    /**
     * Constructeur pour compte courant.
     */
    public CompteBancaire(double solde, double decouvert) {
        this.type = TypeCompte.CC;
        this.solde = solde;
        this.decouvert = decouvert;
        this.tauxRemuneration = 0.0; // Les Comptes courants on un Taux de Remunération égal à 0.0;
    }

    /**
     * Constructeur pour livret A.
     */
    public CompteBancaire(double solde, double tauxRemuneration) {
        this.type = TypeCompte.LA;
        this.solde = solde;
        this.decouvert = 0.0;  // Les livrets A ne permettent pas de découvert
        this.tauxRemuneration = tauxRemuneration;
    }

    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    public void debiterMontant(double montant) {
        if ((type == TypeCompte.CC && this.solde - montant >= decouvert) ||
            (type == TypeCompte.LA && this.solde - montant >= 0)) {
            this.solde -= montant;
        } else {
            System.err.println("Opération non autorisée: fonds insuffisants");
        }
    }

    public void appliquerRemuAnnuelle() {
        if (type == TypeCompte.LA) {
            this.solde += this.solde * tauxRemuneration / 100;
        }
    }

    // Getters
    public double getSolde() {
        return solde;
    }

    public double getDecouvert() {
        if (type == TypeCompte.CC) {
            return decouvert;
        } else {
            throw new IllegalStateException("Aucun découvert n'est autorisé pour les Livrets A");
        }
    }

    public double getTauxRemuneration() {
        if (type == TypeCompte.LA) {
            return tauxRemuneration;
        } else {
            throw new IllegalStateException("Taux de rémunération non applicable pour les comptes courants");
        }
    }

    public TypeCompte getType() {
        return type;
    }

    // Setters
    public void setDecouvert(double decouvert) {
        if (type == TypeCompte.CC) {
            this.decouvert = decouvert;
        } else {
            throw new IllegalStateException("Modification de découvert non autorisée pour les Livrets A");
        }
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        if (type == TypeCompte.LA) {
            this.tauxRemuneration = tauxRemuneration;
        } else {
            throw new IllegalStateException("Modification de taux de rémunération non autorisée pour les comptes courants");
        }
    }
}
