

Feature:  Aile Butcem Login Page Test
  @wip
  Scenario: Kullanici aile butcem uygulamasina basarili bir sekilde giris yaparak ilgili gorevleri yerine getirir

    Given Kullanici kurulumlari tamamlar
    Then ilk ekran ayarlarini yapar ve "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
    Then "mail" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap"
    Then uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin
    Then sol kisimdaki menuden hesabim bolumune gidin
    Then hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin
    And ardindan degisiklerin yapildigini dogrulayin
  