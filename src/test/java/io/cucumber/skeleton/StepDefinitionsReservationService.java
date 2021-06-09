package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitionsReservationService {

    ReservationService service;
    String ausgabe;

    @Given("Ich bin Kinobesucher")
    public void ich_bin_kinobesucher() {
        service = new ReservationService();
    }

    @When("Ich waehle die Reihe {int} und habe folgende Mitgliedsnummer {string}")
    public void ich_waehle_die_Reihe_und_habe_folgende_Mitgliedsnummer(int row, String mitgliedsnummer) {
        ausgabe = service.processRequest(row, mitgliedsnummer);
    }

    @Then("Ich erhalte als Ausgabe {string}")
    public void ich_erhalte_als_Ausgabe(String message) {
        assertEquals(message, ausgabe);
    }

}
