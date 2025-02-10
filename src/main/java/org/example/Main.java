package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Besitzer besitzer1 = new Besitzer("Tanja", 25, "Maria straße 12, Hamburg");
        Besitzer besitzer2 = new Besitzer("Max", 30, "Musterstraße 1, Berlin");
        Besitzer besitzer3 = new Besitzer("Anna", 25, "Hauptstraße 12, München");

        TierArt hundArt = new TierArt("Hund", 500);  // Futterbedarf 500 Gramm pro Tag
        TierArt katzeArt = new TierArt("Katze", 200);

        Tier tier1 = new Tier(1, "Bello", "Hund", 5, besitzer1, hundArt);
        Tier tier2 = new Tier(2, "Miezi", "Katze", 3, besitzer2, katzeArt);
        Tier tier3 = new Tier(1, "Bello", "Hund", 5, besitzer3, hundArt);
        Tier tier4 = new Tier(1, "Bello", "Hund", 5, besitzer3, hundArt);

        // Testen der automatisch generierten toString() Methode
        System.out.println("\nTier Informationene: ");
        System.out.println("tier1: " + tier1);
        System.out.println("tier2: " + tier2);
        System.out.println("tier3" + tier4);

        // Testen der automatisch generierten equals() Methode
        System.out.println("\nTieren Verlgeich: ");
        System.out.println("tier1 und tier2 sind gleich: " + tier1.equals(tier2));  // false
        System.out.println("tier3 und tier4 sind gleich: " + tier3.equals(tier4));
    }
}