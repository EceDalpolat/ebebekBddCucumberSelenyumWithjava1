@Test
Feature: E-bebek Sepet İşlemleri
  Scenario Outline:  Kullanıcı e-bebek sayafasında arama yapmalı

  Given Kullanıcı e-bebek sitesini açabilmeli
  When Çıkan reklamlar ve çerezler kapatılmalı
  And Kullanıcı  arama çubuğuna  tıklayabilmeli
  And Kullanıcı arama çubuğuna "<urun_adi>" yazabilmeli
  And Kullanıcı ilk çıkan ürüne tıklayabilmeli
  And Kullanıcı sepete ekle butonuna tıklayabilmeli
  And Kullanıcı sepeti göster butonuna tıklayabilmeli
  Then Kullanıcı sepette ürünü görmeli
    Examples:
      | urun_adi |
      | biberon |
      | emzik |