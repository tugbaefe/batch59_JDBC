Feature: US1001 kullanici dogru bilgilerle database baglabilmeli

  @db
  Scenario: TC01 kullanici database'deki bilgileri okur

    Given kullanici HMC veri tabanina baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    # SELECT Price FROM tHOTELROOM;
    And kullanici "Price" sutunundaki verileri okur

