package io.cucumber.skeleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReservationServiceTest {

    private  ReservationService reservationService;

    @Before
    public void setup() {
        reservationService = new ReservationService();
    }

    @Test
    public void testReihe123OhneMitgliedsnummer() {
        // Execute
        String result = reservationService.processRequest(1,"");
        // Verify
        assertEquals("9",result);
    }

    @Test
    public void testReihe123MitGueltigeMitgliedsnummer() {
        // Execute
        String result = reservationService.processRequest(1,"20000");
        // Verify
        assertEquals("8",result);
    }

    @Test
    public void testReihe123MitUnueltigeMitgliedsnummerZuLang() {
        // Execute
        String result = reservationService.processRequest(1,"200000");
        // Verify
        assertEquals("Kein Mitglied",result);
    }

    @Test
    public void testReihe123MitUnueltigeMitgliedsnummerMitBuchstaben() {
        // Execute
        String result = reservationService.processRequest(1,"2000a");
        // Verify
        assertEquals("Kein Mitglied",result);
    }
}
