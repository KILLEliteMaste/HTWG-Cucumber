package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class PasswordCheckStepDefinitions {

    PasswordCheck passwordCheck;
    boolean result;

    @Given("The user enters password dialog")
    public void the_user_enters_password_dialog() {
        passwordCheck = new PasswordCheckerImpl();
    }

    @When("The user enters {string} as password")
    public void the_user_enters_password(String password) {
        result = passwordCheck.checkPassword(password);
    }

    @Then("{string} is returned")
    public void returned(String returnedString) {
        if (returnedString.equals("Invalid Password")) {
            assertFalse(result);
        }
        if (returnedString.equals("Valid Password")) {
            assertTrue(result);
        }
        fail("Invalid Parameter");
    }
}
