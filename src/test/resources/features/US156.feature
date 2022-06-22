Feature: API_US_156

  #Precondition => Bir location kaydına ihtiyacımız var.
  #Precondition => Var olan location id'sini almamız gerekiyor

  Background: Create a new location
    Given user connects to the "/settings/location/add" api
      | addressTitle | address | city  | state | zipCode | country | timeZone |
      | aaaaaa       | bbbbbbb | ccccc | ddddd | 000000  | Yok     | no       |
    Given user connects to the "/dashboard/getUser" api to get data
      | locationInfos[0].id |

  Scenario: TC_001
    Given user connects to the "/settings/location/update" api
      | id           | addressTitle | address | city  | state | zipCode | country | timeZone                |
      | precondition | Başlık       | Adresim | İzmir | İzmir | 034444  | Türkiye | Greenwich Standard Time |
    Then user verifies the values of the fields
      | success |
      | true    |
    Then user connects to the "/settings/location/delete" api
      | id           |
      | precondition |