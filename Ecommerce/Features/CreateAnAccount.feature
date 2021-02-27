Feature: Creating an account with "Your Loga" Website

  Scenario Outline: verify account creation with valid information for all the fileds in the "CREATE AN ACCOUNT" page
    Given user should navigated to 'your Loga' website
     When click on Sign in link
     Then enter Email address at AUTHENTICATION site and click on Create an Account button
     |d35rman4sb7@temporary-mail.net|
     
     Then fill the form details with the following data

    Examples: 
      | Title | First Name | Last Name | Password   | Date of Birth   | First Name | Last Name | Company  | Address     | Address (Line 2) | City          | State         | Zip/Postal Code | Country | Additional information | Home phone | Mobile phone | Assign an address alias for future reference |
      | Mr    | Gidda      | Ratnaji   | Welcome@11 | 26-January-1986 | Gidda      | Ratnaji   | TeleText | Sheelanagar | BandaruTowers    | Visakhapatnam | Andhrapradesh |          530012 | India   | Handle with care       | 0885-91929 |   9642147576 | Tadepaligudem                                |
