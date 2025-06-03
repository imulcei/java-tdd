package fr.afpa.converter.tool;

/**
 * Classe utilitaire permettant de passer des nombres d'une base à l'autre.
 * 
 * Base suportées:
 * - binaire
 * - décimale
 * - hexadécimale
 */
public final class ConverterTool {

    /**
     * Constructeur privé pour cacher celui déclaré par défaut en public.
     */
    private ConverterTool() {
    }

    /**
     * Convertit un nombre binaire (représentation sous forme de chaîne de
     * caractère) en sa représentation décimale.
     * 
     * @param binary Nombre binaire à traiter
     * @return Répresentation décimale du nombre, -1 si la conversion est impossible
     */
    public static int binaryToDecimal(String binary) {
        try {
            return Integer.parseInt(binary, 2);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /**
     * Convertit un nombre décimal en sa représentation binaire.
     * 
     * @param decimal Nombre décimal à traiter
     * @return Répresentation binaire du nombre
     */
    public static String decimalToBinary(int decimal) {
        String result = "";
        if (decimal == 0 || decimal < 0) {
            return "0";
        }
        while (decimal > 0) {
            int modulo = decimal % 2;
            result = modulo + result;
            decimal = decimal / 2;
        }
        return result;
    }

    /**
     * Convertit un nombre binaire (représentation sous forme de chaîne de
     * caractère) en sa représentation héxadécimale.
     * 
     * @param binary Nombre binaire à traiter
     * @return Répresentation héxadécimale du nombre
     */
    public static String binaryToHexadecimal(String binary) {
        try {
            int decimal = Integer.parseInt(binary, 2);
            return Integer.toHexString(decimal);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * Convertit un nombre décimal en sa représentation héxadécimale.
     * 
     * @param decimal Nombre décimal à traiter
     * @return Répresentation binaire du nombre
     */
    public static String decimalToHexadecimal(int decimal) {
        String result = decimalToBinary(decimal);
        result = binaryToHexadecimal(result);
        return result;
    }

    /**
     * Convertit un nombre hexadécimal en sa représentation décimale.
     * 
     * @param decimal Nombre décimal à traiter
     * @return Répresentation binaire du nombre
     */
    public static int hexadecimalToDecimal(String hexadecimal) {
        try {
            return Integer.parseInt(hexadecimal, 16);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static String hexadecimalToBinary(String hex) {
        int dec = hexadecimalToDecimal(hex);
        String result = decimalToBinary(dec);
        return result;
    }

    /**
     * Vérifie si une chaîne de caractères en paramètre représente un nombre
     * hexadécimal
     * 
     * @param toCheck Chaîne à vérifier
     * @return true si la chaîne passée en paramètre contient des symboles
     *         hexadécimaux, faux sinon
     */
    public static boolean checkIfHexadecimal(String toCheck) {
        try {
            Long.parseLong(toCheck, 16);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Vérifie si une chaîne de caractères en paramètre représente un nombre entier
     * 
     * @param toCheck Chaîne à vérifier
     * @return true si la chaîne passée en paramètre est un nombre entier, faux
     *         sinon
     */
    public static boolean checkIfDecimal(String toCheck) {
        if (toCheck.matches("^[0-9]+$")) {
            return true;
        } else {
            return false;
        }
    }
}
