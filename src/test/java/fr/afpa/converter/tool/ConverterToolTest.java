package fr.afpa.converter.tool;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/***
 * Classe regroupant les tests à compléter.
 * 
 * Il vous est demandé de la compléter en suivant un approche TDD - Test Driven
 * Development
 * 
 * Marche à suivre pour suivre le cycle "Rouge-Vert-Refactor" :
 * 1. Focalisez vous sur 1 fonction (par exemple "testHexadecimalToDecimal")
 * 2. Construisez un jeu de test complet (par exemple une liste de nombres à
 * héxadécimaux à convertir)
 * 3. Ajoutez UNE SEULE assertion qui vérifie un TEST INDIVIDUEL
 * 4. Développez la fonction associée pour qu'elle retourne le bon résultat
 * (that's tour "baby step")
 * 5. Ajoutez UNE AUTRE assertion
 * 6. Vérifiez si le test passe, développez la fonction pour qu'elle retourne le
 * bon résultat
 * 7. Ainsi de suite jusqu'à ce que votre jeu de test soit couvert.
 * 
 * Pour certaines de ces fonctions le jeu de test vous est donné.
 * Pour d'autre, il vous faudra le créer.
 */
class ConverterToolTest {

    @DisplayName("Conversion des nombres binaires en décimaux")
    @Test
    void testBinaryToDecimal() {

        String bin1 = "10";
        String bin2 = "1011";
        String bin3 = "azerty";

        assertEquals(2, ConverterTool.binaryToDecimal(bin1));
        assertEquals(11, ConverterTool.binaryToDecimal(bin2));
        assertEquals(-1, ConverterTool.binaryToDecimal(bin3));
    }

    @DisplayName("Conversion des nombres décimaux en binaire")
    @Test
    void testDecimalToBinary() {
        int dec1 = 2;
        int dec2 = 11;
        int dec3 = -2;

        assertEquals("10", ConverterTool.decimalToBinary(dec1));
        assertEquals("1011", ConverterTool.decimalToBinary(dec2));
        assertEquals("0", ConverterTool.decimalToBinary(dec3));
    }

    @DisplayName("Conversion des nombres binaires en hexadécimal")
    @Test
    void testBinarytoHex() {
        String bin1 = "0101";
        String bin2 = "01110101";
        String bin3 = "azerty";

        assertEquals("5", ConverterTool.binaryToHexadecimal(bin1));
        assertEquals("75", ConverterTool.binaryToHexadecimal(bin2));
        assertEquals(null, ConverterTool.binaryToHexadecimal(bin3));
    }

    @DisplayName("Conversion des nombres décimal en hexadécimal")
    @Test
    void testDecimaltoHex() {
        int dec1 = 2024;
        int dec2 = 156;
        int dec3 = -2;

        assertEquals("7e8", ConverterTool.decimalToHexadecimal(dec1));
        assertEquals("9c", ConverterTool.decimalToHexadecimal(dec2));
        assertEquals("0", ConverterTool.decimalToHexadecimal(dec3));
    }

    @DisplayName("Conversion des nombres hexadécimal en décimal")
    @Test
    void testHextoDecimal() {
        String hex1 = "7e8";
        String hex2 = "9c";
        String hex3 = "azerty";

        assertEquals(2024, ConverterTool.hexadecimalToDecimal(hex1));
        assertEquals(156, ConverterTool.hexadecimalToDecimal(hex2));
        assertEquals(-1, ConverterTool.hexadecimalToDecimal(hex3));
    }

    @DisplayName("Conversion des nombres hexadécimal en binaire")
    @Test
    void testHextoBinaire() {
        String hex1 = "7e8";
        String hex2 = "9c";
        String hex3 = "azerty";

        assertEquals("11111101000", ConverterTool.hexadecimalToBinary(hex1));
        assertEquals("10011100", ConverterTool.hexadecimalToBinary(hex2));
        assertEquals("0", ConverterTool.hexadecimalToBinary(hex3));
    }

    @DisplayName("Vérification de la nature hexadécimale d'une chaîne de caractère")
    @Test
    void testIfHexadecimal() {
        String hex1 = "7e8";
        String hex2 = "9c";
        String hex3 = "azerty";

        assertTrue(ConverterTool.checkIfHexadecimal(hex1));
        assertTrue(ConverterTool.checkIfHexadecimal(hex2));
        assertFalse(ConverterTool.checkIfHexadecimal(hex3));
    }

    @DisplayName("Vérification de la nature décimale d'une chaîne de caractère")
    @Test
    void testIfDecimal() {
        String dec1 = "10";
        String dec2 = "2024";
        String dec3 = "az89";

        assertTrue(ConverterTool.checkIfDecimal(dec1));
        assertTrue(ConverterTool.checkIfDecimal(dec2));
        assertFalse(ConverterTool.checkIfDecimal(dec3));
    }
}
