package io.cucumber.skeleton;

public class ReservationService {
    public String processRequest(int row, String memberNr) {

        if (row <= 0 || row > 12)
            return "Ungültige Reihe";

        if (!isMemberNrValid(memberNr)) {
            return "Kein Mitglied";
        }
        if (memberNr.length() == 5) {
            return "8";
        } else {
            return "9";
        }
    }

    protected boolean isMemberNrValid(String memberNr) {
        if (memberNr.length() == 0) {
            return true;
        }
        if ((memberNr.length() > 0) && memberNr.length() != 5) {
            return false;
        }
        try {
            Integer.parseInt(memberNr);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
 }
