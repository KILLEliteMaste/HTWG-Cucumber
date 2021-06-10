Feature: Als ein Kinobesucher möchte ich eine Eintritttskarte kaufen so dass ich Zutritt
  zum Kinosaal bekomme, in welchem mein gewünschter Film läuft.

  Scenario: Ich gebe eine ungültige Reihe ein
    Given Ich habe einen ReservationService
    When Ich eine Reihe 15 und Mitglied "123456" eingebe
    Then Sollte die Nachricht "Ungültige Reihe" zurück gegeben werden

  Scenario: Reihe 2 kein Mitglied
    Given Ich habe einen ReservationService
    When Ich eine Reihe 2 und Mitglied "" eingebe
    Then Sollte die Nachricht "9" zurück gegeben werden

  Scenario: Reihe 2 mit Mitglied
    Given Ich habe einen ReservationService
    When Ich eine Reihe 2 und Mitglied "123456" eingebe
    Then Sollte die Nachricht "8" zurück gegeben werden

  Scenario: Ich gebe eine ungültige Mitgliedsnummer ein
    Given Ich habe einen ReservationService
    When Ich eine Reihe 3 und Mitglied "563123" eingebe
    Then Sollte die Nachricht "Kein Mitglied" zurück gegeben werden

