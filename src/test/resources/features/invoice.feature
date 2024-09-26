Feature: Invoice Adding

  Background:
    Given navigate to home page
    Then login to codease

  Scenario: Add CodEase Areas
    Given open timesheet page
    When open slats panel
    And open 7 task
    And set 4 "FigoPara" customer
    And set 3 "Setur" customer
    And set projects to "QA"
    And set "12.09.2024" for day
    Then wait for manuel enter

    #Change blue text to organize your helper:

    # set 16 task
    # set 1 "Ray Sigorta" customer
    # set 3 "FigoPara" customer
    # set 12 "Setur" customer

    # !!!!!! 16 = 1 + 3 + 12 !!!!!!!

    #QA
    #Setur
    #FigoPara
    #12.09.2024
