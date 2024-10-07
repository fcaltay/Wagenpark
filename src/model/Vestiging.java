package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Vestiging {
    private String plaats;
    private String manager;
    private ArrayList<Auto> autos;

    public Vestiging(String plaats, String manager) {
        this.plaats = plaats;
        this.manager = manager;
        this.autos = new ArrayList<>();

    }

    public void voegAuto(Auto auto) {
        autos.add(auto);
    }

    @Override
    public String toString() {
        Collections.sort(autos);
        return String.format("Plaats: %s\nmanager: %s\n\n%s", this.plaats, this.manager, geefAutoDetails());
    }

    public String geefAutosNaDatum(LocalDate datum) {
        StringBuilder result = new StringBuilder();
        for (Auto auto : autos) {
            if (datum.isBefore(auto.getDatumAfgifteKenteken())) {
                result.append(auto.toString()).append("\n");
            }
        }
        return result.toString();
    }

    public String geefAutoDetails(){
        StringBuilder details = new StringBuilder();
        for (Auto auto1 : autos) {
            details.append(auto1.toString()).append("\n\n");
        }
        return details.toString();
    }
}
