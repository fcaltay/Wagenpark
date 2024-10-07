package controller;

import model.Auto;
import model.Vestiging;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class WagenparkLauncher {

    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList<>();


        /*autos.add(new Auto("Tesla", "S 100D", LocalDate.of(2019, 5, 5), 12646, "TR-264-X"));
        autos.add(new Auto("Dacia", "Logan MPV", LocalDate.of(2017, 8, 16), 46367, "KS-567-W"));
        autos.add(new Auto("Toyota", "Prius", LocalDate.of(2015, 3, 2), 46367, "KS-567-W"));
*/
        System.out.println();

        Vestiging vestiging = new Vestiging("Goumere", "Albert Mol");
        vestiging.voegAuto(new Auto("Toyota", "Prius", LocalDate.of(2015, 3, 2), 46367, "KS-567-W"));
        vestiging.voegAuto(new Auto("Dacia", "Logan MPV", LocalDate.of(2017, 8, 16), 46367, "KS-567-W"));
        vestiging.voegAuto(new Auto("Tesla", "S 100D", LocalDate.of(2019, 5, 5), 12646, "TR-264-X"));

        System.out.println(vestiging.toString());

        }
    }

