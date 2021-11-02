package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Die Klasse fuehrt Teste fuer die Methoden aus
 */
class BenutzerTest {


    /**
     * Die Methode testet ob die Gesammtzeit,die furs Sport treiben verbraucht wurde
     *gut berechnet wurde
     */
    @Test
    void testKalkuliereZeit() {
        ArrayList<Sport> lieblingssport=new ArrayList<>();

        Mannschaftsport basketballMontag =new Basketball();
        Mannschaftsport fussballDienstag =new Fussball();
        Mannschaftsport basketballMittwoch =new Basketball();
        Leichtathletik hindernislaufDonnerstag=new Hindernislauf();
        Leichtathletik hochsprungFreitag=new Hochsprung();

        lieblingssport.add(basketballMontag);
        lieblingssport.add(fussballDienstag);
        lieblingssport.add(basketballMittwoch);
        lieblingssport.add(hindernislaufDonnerstag);
        lieblingssport.add(hochsprungFreitag);

        Benutzer benutzer=new Benutzer("TestVN","TestNN",lieblingssport);

        assertEquals(benutzer.kalkuliereZeit(),225);

    }


    /**
     * Die Methode testet ob die Durchschnittszeit(Minuten),die furs Sport treiben verbraucht wurde
     *gut berechnet wurde
     */
    @Test
    void testKalkuliereDurchschnittsZeit() {


        ArrayList<Sport> lieblingssport=new ArrayList<>();

        Mannschaftsport basketballMontag =new Basketball();
        Mannschaftsport fussballDienstag =new Fussball();
        Mannschaftsport basketballMittwoch =new Basketball();
        Leichtathletik hindernislaufDonnerstag=new Hindernislauf();
        Leichtathletik hochsprungFreitag=new Hochsprung();

        lieblingssport.add(basketballMontag);
        lieblingssport.add(fussballDienstag);
        lieblingssport.add(basketballMittwoch);
        lieblingssport.add(hindernislaufDonnerstag);
        lieblingssport.add(hochsprungFreitag);

        Benutzer benutzer=new Benutzer("TestVN","TestNN",lieblingssport);

        assertEquals(benutzer.kalkuliereDurchschnittsZeit(),45);



    }


    /**
     *  Die Methode testet ob die Gesammtzeit,die man die fuer eine gegebenen Sportarten braucht
     *gut berechnet wurde
     */
    @Test
    void testKalkuliereZeitFuerEineSportArt() {

        ArrayList<Sport> lieblingssport=new ArrayList<>();

        Mannschaftsport basketballMontag =new Basketball();
        Mannschaftsport fussballDienstag =new Fussball();
        Mannschaftsport basketballMittwoch =new Basketball();
        Leichtathletik hindernislaufDonnerstag=new Hindernislauf();
        Leichtathletik hochsprungFreitag=new Hochsprung();

        lieblingssport.add(basketballMontag);
        lieblingssport.add(fussballDienstag);
        lieblingssport.add(basketballMittwoch);
        lieblingssport.add(hindernislaufDonnerstag);
        lieblingssport.add(hochsprungFreitag);

        Benutzer benutzer=new Benutzer("TestVN","TestNN",lieblingssport);

        assertEquals(benutzer.kalkuliereZeit(new Basketball()),110);
    }
}