@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the choucair Academy with the
  @scenario1
  Scenario: Search for a automation course
    Given  than jeferson wants to learn automation at Academy choucair
      | strUser   | strPassword  |
      |1143847066|Choucair2021*|
    When he  search forma the course
      | strCourse                |
      | Metodologia Bancolombia  |
    Then he finds the course called
      | strCourse                |
      | Metodologia Bancolombia  |