package vvgtest.ja;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Testne_sripte implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Testnikorak")
   private java.lang.Long testni_korak;
   @org.kie.api.definition.type.Label("Opis testnog koraka")
   private java.lang.String opis_testnog_koraka;
   @org.kie.api.definition.type.Label("Rezultat testnog koraka")
   private java.lang.String rezultat_testnog_koraka;
   @org.kie.api.definition.type.Label("Status ispravnosti testnoh koraka")
   private java.lang.String sts_ispravnosti;
   @org.kie.api.definition.type.Label("ZahtjevID")
   private Zahtjevi id_zahtjeva;
   @org.kie.api.definition.type.Label("naruciteljID")
   private java.lang.String narucitelj;

   @org.kie.api.definition.type.Label("analizaID")
   private Analiza id_analize;

   @org.kie.api.definition.type.Label("korisnik")
   private Korisnici id_korisnika;

   @org.kie.api.definition.type.Label("testnaskriptaID")
   private java.lang.Long id_test_skripte;

   @org.kie.api.definition.type.Label(value = "u kojem je statusu")
   private vvgtest.ja.Statusi id_status;

   public Testne_sripte()
   {
   }

   public java.lang.Long getTestni_korak()
   {
      return this.testni_korak;
   }

   public void setTestni_korak(java.lang.Long testni_korak)
   {
      this.testni_korak = testni_korak;
   }

   public java.lang.String getOpis_testnog_koraka()
   {
      return this.opis_testnog_koraka;
   }

   public void setOpis_testnog_koraka(java.lang.String opis_testnog_koraka)
   {
      this.opis_testnog_koraka = opis_testnog_koraka;
   }

   public java.lang.String getRezultat_testnog_koraka()
   {
      return this.rezultat_testnog_koraka;
   }

   public void setRezultat_testnog_koraka(
         java.lang.String rezultat_testnog_koraka)
   {
      this.rezultat_testnog_koraka = rezultat_testnog_koraka;
   }

   public java.lang.String getSts_ispravnosti()
   {
      return this.sts_ispravnosti;
   }

   public void setSts_ispravnosti(java.lang.String sts_ispravnosti)
   {
      this.sts_ispravnosti = sts_ispravnosti;
   }

   public java.lang.String getNarucitelj()
   {
      return this.narucitelj;
   }

   public void setNarucitelj(java.lang.String narucitelj)
   {
      this.narucitelj = narucitelj;
   }

   public vvgtest.ja.Korisnici getId_korisnika()
   {
      return this.id_korisnika;
   }

   public void setId_korisnika(vvgtest.ja.Korisnici id_korisnika)
   {
      this.id_korisnika = id_korisnika;
   }

   public vvgtest.ja.Zahtjevi getId_zahtjeva()
   {
      return this.id_zahtjeva;
   }

   public void setId_zahtjeva(vvgtest.ja.Zahtjevi id_zahtjeva)
   {
      this.id_zahtjeva = id_zahtjeva;
   }

   public vvgtest.ja.Analiza getId_analize()
   {
      return this.id_analize;
   }

   public void setId_analize(vvgtest.ja.Analiza id_analize)
   {
      this.id_analize = id_analize;
   }

   public java.lang.Long getId_test_skripte()
   {
      return this.id_test_skripte;
   }

   public void setId_test_skripte(java.lang.Long id_test_skripte)
   {
      this.id_test_skripte = id_test_skripte;
   }

   public vvgtest.ja.Statusi getId_status()
   {
      return this.id_status;
   }

   public void setId_status(vvgtest.ja.Statusi id_status)
   {
      this.id_status = id_status;
   }

   public Testne_sripte(java.lang.Long testni_korak,
         java.lang.String opis_testnog_koraka,
         java.lang.String rezultat_testnog_koraka,
         java.lang.String sts_ispravnosti, vvgtest.ja.Zahtjevi id_zahtjeva,
         java.lang.String narucitelj, vvgtest.ja.Analiza id_analize,
         vvgtest.ja.Korisnici id_korisnika, java.lang.Long id_test_skripte,
         vvgtest.ja.Statusi id_status)
   {
      this.testni_korak = testni_korak;
      this.opis_testnog_koraka = opis_testnog_koraka;
      this.rezultat_testnog_koraka = rezultat_testnog_koraka;
      this.sts_ispravnosti = sts_ispravnosti;
      this.id_zahtjeva = id_zahtjeva;
      this.narucitelj = narucitelj;
      this.id_analize = id_analize;
      this.id_korisnika = id_korisnika;
      this.id_test_skripte = id_test_skripte;
      this.id_status = id_status;
   }

}