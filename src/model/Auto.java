package model;

import java.time.LocalDate;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Auto implements Comparable<Auto> {
    private String merk;
    private String model;
    private LocalDate datumAfgifteKenteken;
    private int kilometerstand;
    private String kenteken;

    public Auto(String merk, String model, LocalDate datumAfgifteKenteken, int kilometerstand, String kenteken) {
        this.merk = merk;
        this.model = model;
        this.datumAfgifteKenteken = datumAfgifteKenteken;
        this.kilometerstand = kilometerstand;
        this.kenteken = kenteken;
    }

    public LocalDate getDatumAfgifteKenteken() {
        return datumAfgifteKenteken;
    }

    @Override
    public String toString() {
        return String.format("Merk: %s\nModel: %s\nDatum kenteken: %s\nKilometerstand: %s\nKenteken: %s", this.merk, this.model, this.datumAfgifteKenteken, this.kilometerstand, this.kenteken);
    }


    @Override
    public int compareTo(Auto andereAuto) {
        return this.datumAfgifteKenteken.compareTo(andereAuto.getDatumAfgifteKenteken());
    }


}
