# Created by Kaluscha/Mannsdoerfer at 09/06/2021
Feature: Als ein Kinobesucher möchte ich eine Eintritttskarte kaufen,so dass ich Zutritt zum Kinosaal
  bekomme, in welchem mein gewünschter Film läuft.

  Scenario: Erfolgreiche Reservierung mit gültiger Mitgliedsnummer
    Given Ich bin Kinobesucher
    When Ich waehle die Reihe 1 und habe folgende Mitgliedsnummer "12345"
    Then Ich erhalte als Ausgabe "8"

  Scenario: Erfolgreiche Reservierung ohne Mitgliedsnummer
    Given Ich bin Kinobesucher
    When Ich waehle die Reihe 1 und habe folgende Mitgliedsnummer ""
    Then Ich erhalte als Ausgabe "9"

  Scenario: Der Kunde gibt eine Falsche Reihe ein
    Given Ich bin Kinobesucher
    When Ich waehle die Reihe 13 und habe folgende Mitgliedsnummer ""
    Then Ich erhalte als Ausgabe "Ungültige Reihe"

  Scenario: Der Kunde gibt eine Falsche Mitgliedsnummer ein
    Given Ich bin Kinobesucher
    When Ich waehle die Reihe 4 und habe folgende Mitgliedsnummer "1"
    Then Ich erhalte als Ausgabe "Kein Mitglied"
