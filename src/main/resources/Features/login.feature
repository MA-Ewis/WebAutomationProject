Feature: LOGIN
  @smo
  Scenario Outline: USER CAN LOGIN
    Given USER CLICK ON SIGN UP LOGIN BUTTON
    When USER ENTER EMAIL "<EMAIL>"
    And USER ENTER PASSWORD "<PASSWORD>"
    Then USER CLICK ON LOGIN BUTTON
    Examples:
      | EMAIL |PASSWORD|
      | ffffff |ytttttt|
      | ffffff |ytttttt|