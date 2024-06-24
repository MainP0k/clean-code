package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * Utilitaires pour formater les dates.
 */
public class DateUtils {

    // Constante pour le motif de formatage par défaut
    private static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

    /**
     * Formate une date selon un motif spécifié.
     *
     * @param pattern le motif de formatage (ex. "dd/MM/yyyy")
     * @param date la date à formater
     * @return la date formatée en chaîne de caractères
     * @throws IllegalArgumentException si le pattern ou la date est null
     */
    public static String format(String pattern, Date date) {
        // Vérification que le pattern et la date ne sont pas nulls
        Objects.requireNonNull(pattern, "Le motif de formatage ne peut pas être null");
        Objects.requireNonNull(date, "La date ne peut pas être null");

        try {
            // Création d'un formateur avec le motif spécifié
            SimpleDateFormat formateur = new SimpleDateFormat(pattern);
            // Formatage de la date et retour du résultat sous forme de chaîne de caractères
            return formateur.format(date);
        } catch (Exception e) {
            // Gestion d'éventuelles exceptions de formatage
            throw new RuntimeException("Erreur lors du formatage de la date", e);
        }
    }

    /**
     * Formate une date selon un motif par défaut.
     * Le motif par défaut est "dd/MM/yyyy HH:mm:ss".
     *
     * @param date la date à formater
     * @return la date formatée en chaîne de caractères
     * @throws IllegalArgumentException si la date est null
     */
    public static String formatDefaut(Date date) {
        // Vérification que la date n'est pas null
        Objects.requireNonNull(date, "La date ne peut pas être null");

        try {
            // Création d'un formateur avec le motif par défaut
            SimpleDateFormat formateur = new SimpleDateFormat(DEFAULT_PATTERN);
            // Formatage de la date et retour du résultat sous forme de chaîne de caractères
            return formateur.format(date);
        } catch (Exception e) {
            // Gestion d'éventuelles exceptions de formatage
            throw new RuntimeException("Erreur lors du formatage de la date", e);
        }
    }
}
