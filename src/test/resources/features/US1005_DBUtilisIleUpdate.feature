Feature: US1005 kullanici database update yapar

  Scenario: TC05 kullanici update yapabilmeli

    Given kullanici DBUtils ile HMC veri tabanina baglanir
    Then tHOTEL tablosunda IDHotel degeri 1016 olan kaydin Email bilgisini "sizOldunuz@gmail.com" yapar