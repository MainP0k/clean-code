package ex1;

import java.util.Date;

/**
 * Classe représentant les informations de base d'une entreprise.
 */

public class Entreprise {

    public static final int CAPITAL_MAX = 3000000;
    private int siret;
    private String nom;
    private String adresse;
    private Date dateCreation;

    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {
        System.out.println("Siret: " + siret);
        System.out.println("Nom: " + nom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Date de création: " + dateCreation);
    }

    // Getters et Setters
    public int getSiret() {
        return siret;
    }

    public void setSiret(int siret) {
        this.siret = siret;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
