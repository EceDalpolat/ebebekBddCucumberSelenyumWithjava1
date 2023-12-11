@Tes0t
Feature: E-bebek Select İşlemleri
  Scenario:  Kullanıcı e-bebek sayafasında select işlemrini yapmalı
    Given e-bebek sitesi açılır
    When Çıkan reklamlar ve çerezler kapatır
    And Kategoriler sekmesi açılır
    And  kategorileren bebek giyim tıklanır
    And Akıllı arama selecti açılır
    And Akıllı arama selecti altında tipi seçilir
    And Ilk ürün için sepete ekle butonuna tıklanır
    And Çıkan ekranda istenilen seçeneğe tıklanır
    And Yeniden sepete ekle butonuna tıklanır
    And Sepeti gör butonuna tıklanır
    And Ürünün sayısı max düzeyde arttırılır
    Then Max ürün mesajı ekranda görülür