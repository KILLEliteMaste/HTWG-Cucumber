package io.cucumber.skeleton;

public interface PasswordCheck {
    /**
     * Check Password according to the Rules defines in ticker ...
     *
     * @param password the password entered by the user
     * @return <code>true</code> if all rules are matched
     */
    public boolean checkPassword(String password);
}
