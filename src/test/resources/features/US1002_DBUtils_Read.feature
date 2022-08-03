Feature: US1002 kullanici DB Utils ile database baglantisi yapabilir

  Scenario: TC02 kullanici DB Utils ile database'deki bilgileri okur

    Given kullanici DBUtils ile HMC veri tabanina baglanir
    And kullanici DBUtils ile "tHOTELROOM" tablosundaki "Price" verilerini alir
    #SELECT Price FROM tHOTELROOM
  And kullanici DBUtils ile "Price" sutunundaki verileri okur