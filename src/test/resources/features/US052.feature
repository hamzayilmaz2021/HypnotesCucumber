Feature: US_052	As a user (therapist) I should be able to add new client
    ### Add Client zorunlu bilgiler ile kayıt oluştur.
    ### examples bölümü oluştursak, oradaki ifadelere göre inputları doldursak

    ### Kayıt oluşturulduktan sonra, Clients sayfasında kaydının varolduğunu doğrula.
    ### Kayıt limitinin önüne geçmek için, deneme amaçlı oluşturulan client'ları sil.

  Background:
    Given user goes to the "/dashboard/add-client" with "login"
    When user accepts the cookies
    When user types "<data>" to the "<input_name>" input on add client page
    And user clicks on the add button on the add client page
    And user clicks on the yes button on the add client page

  Scenario Outline: TC_001 A client should be created with the added information.
    And user gets the id of add client from the current url
    And user goes to the "/dashboard/clients" with "null"
    Then user verifies the client is added to the clients list
    And user deletes the added client from the clients list
    And user logs out of the system
    Examples:
      | data                                                                        | input_name                      |
      | Ahmet,Mete,United States,Alabama,Alexander City                             | name,surname,country,state,city |
      | Emin,Bey,C:\Users\ceng\Desktop\Hypnotes\src\test\resources\images\resim.jpg | name,surname,image              |
      | Hamza,Yilmaz                                                                | name,surname                    |
      | Mehmet,Mete,Duran                                                           | name,middleName,surname         |
      | Ali,Cakir,alicakir@gmail.com                                                | name,surname,email              |
      | Ayse,Gul,No Addres                                                          | name,surname,address            |


  Scenario Outline: TC_002 A client should not be created with the missing information.
    And user waits for "5" seconds
    And user verifies the url is "/dashboard/add-client"
    And user logs out of the system
    Examples:
      | data  | input_name   |
      | Ahmet | name         |
      | Mete  | surname      |
      |       | name,surname |


