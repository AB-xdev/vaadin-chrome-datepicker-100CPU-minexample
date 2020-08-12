package db;

import java.util.Date;

public class Import
{
	private Date freigabeAb;

	private String modellBezeichnung = "";

	private String vlModellname = "";

	private String verbandModellname = "";

	private String modellBeschreibung = "";

	private String mindestBestellwert = "";

	private String mindestBestellmenge = "";

	private String lieferzeit = "";

	private String preisInfo = "";

	private Date modellAuslauf;

	private String bemerkungVerband = "";

	private String artikelBezeichnung = "";

	private String bestellNummer = "";

	private String eanNummer = "";

	private String ausfuehrungMerge;
	private String beschreibungMerge;

	private Double breite;

	private Double hoehe;

	private Double tiefe;

	private Double laenge;

	private Double durchmesser;

	private Double gewicht;

	private String einkaufText = "";

	private String verpackungsEinheit = "";

	private String artikelMindestBestellwert = "";

	private String artikelMindestBestellmenge = "";

	private String artikelLieferzeit = "";

	private Date artikelModellauslauf;

	private Double ekVorSkonto;

	private Double skontoProzentwert;
	
	private Double ekNettoNetto;

	private Date preisGueltigAb;
	
	private Date preisGueltigBis;

	private String b2cOnlineBezeichnung = "";

	private String b2cKurzbeschreibung = "";

	private String b2cOnlineBeschreibung = "";

	private Double b2cUnverbindlicherVerkaufspreis;

	private Double vkPreis;


	public Double getVkPreis()
	{
		return this.vkPreis;
	}

	public void setVkPreis(final Double vkPreis)
	{
		this.vkPreis = vkPreis;
	}

	public Date getFreigabeAb()
	{
		return this.freigabeAb;
	}

	public String getModellBezeichnung()
	{
		return this.modellBezeichnung;
	}

	public String getVlModellname()
	{
		return this.vlModellname;
	}

	public String getVerbandModellname()
	{
		return this.verbandModellname;
	}

	public String getModellBeschreibung()
	{
		return this.modellBeschreibung;
	}

	public String getMindestBestellwert()
	{
		return this.mindestBestellwert;
	}

	public String getMindestBestellmenge()
	{
		return this.mindestBestellmenge;
	}

	public String getLieferzeit()
	{
		return this.lieferzeit;
	}

	public String getPreisInfo()
	{
		return this.preisInfo;
	}

	public Date getModellAuslauf()
	{
		return this.modellAuslauf;
	}

	public String getBemerkungVerband()
	{
		return this.bemerkungVerband;
	}

	public String getArtikelBezeichnung()
	{
		return this.artikelBezeichnung;
	}

	public String getBestellNummer()
	{
		return this.bestellNummer;
	}

	public String getEanNummer()
	{
		return this.eanNummer;
	}

	public String getAusfuehrungMerge()
	{
		return this.ausfuehrungMerge;
	}

	public String getBeschreibungMerge()
	{
		return this.beschreibungMerge;
	}

	public Double getBreite()
	{
		return this.breite;
	}

	public Double getHoehe()
	{
		return this.hoehe;
	}

	public Double getTiefe()
	{
		return this.tiefe;
	}

	public Double getLaenge()
	{
		return this.laenge;
	}

	public Double getDurchmesser()
	{
		return this.durchmesser;
	}

	public Double getGewicht()
	{
		return this.gewicht;
	}

	public String getEinkaufText()
	{
		return this.einkaufText;
	}

	public String getVerpackungsEinheit()
	{
		return this.verpackungsEinheit;
	}

	public String getArtikelMindestBestellwert()
	{
		return this.artikelMindestBestellwert;
	}

	public String getArtikelMindestBestellmenge()
	{
		return this.artikelMindestBestellmenge;
	}

	public String getArtikelLieferzeit()
	{
		return this.artikelLieferzeit;
	}

	public Date getArtikelModellauslauf()
	{
		return this.artikelModellauslauf;
	}

	public Double getEkVorSkonto()
	{
		return this.ekVorSkonto;
	}

	public Double getSkontoProzentwert()
	{
		return this.skontoProzentwert;
	}

	public Double getEkNettoNetto()
	{
		return this.ekNettoNetto;
	}

	public Date getPreisGueltigAb()
	{
		return this.preisGueltigAb;
	}

	public Date getPreisGueltigBis()
	{
		return this.preisGueltigBis;
	}

	public String getB2cOnlineBezeichnung()
	{
		return this.b2cOnlineBezeichnung;
	}

	public String getB2cKurzbeschreibung()
	{
		return this.b2cKurzbeschreibung;
	}

	public String getB2cOnlineBeschreibung()
	{
		return this.b2cOnlineBeschreibung;
	}

	public Double getB2cUnverbindlicherVerkaufspreis()
	{
		return this.b2cUnverbindlicherVerkaufspreis;
	}

	public void setFreigabeAb(final Date freigabeAb)
	{
		this.freigabeAb = freigabeAb;
	}

	public void setModellBezeichnung(final String modellBezeichnung)
	{
		this.modellBezeichnung = modellBezeichnung;
	}

	public void setVlModellname(final String vlModellname)
	{
		this.vlModellname = vlModellname;
	}

	public void setVerbandModellname(final String verbandModellname)
	{
		this.verbandModellname = verbandModellname;
	}

	public void setModellBeschreibung(final String modellBeschreibung)
	{
		this.modellBeschreibung = modellBeschreibung;
	}

	public void setMindestBestellwert(final String mindestBestellwert)
	{
		this.mindestBestellwert = mindestBestellwert;
	}

	public void setMindestBestellmenge(final String mindestBestellmenge)
	{
		this.mindestBestellmenge = mindestBestellmenge;
	}

	public void setLieferzeit(final String lieferzeit)
	{
		this.lieferzeit = lieferzeit;
	}

	public void setPreisInfo(final String preisInfo)
	{
		this.preisInfo = preisInfo;
	}

	public void setModellAuslauf(final Date modellAuslauf)
	{
		this.modellAuslauf = modellAuslauf;
	}

	public void setBemerkungVerband(final String bemerkungVerband)
	{
		this.bemerkungVerband = bemerkungVerband;
	}

	public void setArtikelBezeichnung(final String artikelBezeichnung)
	{
		this.artikelBezeichnung = artikelBezeichnung;
	}

	public void setBestellNummer(final String bestellNummer)
	{
		this.bestellNummer = bestellNummer;
	}

	public void setEanNummer(final String eanNummer)
	{
		this.eanNummer = eanNummer;
	}

	public void setAusfuehrungMerge(final String ausfuehrungMerge)
	{
		this.ausfuehrungMerge = ausfuehrungMerge;
	}

	public void setBeschreibungMerge(final String beschreibungMerge)
	{
		this.beschreibungMerge = beschreibungMerge;
	}

	public void setBreite(final Double breite)
	{
		this.breite = breite;
	}

	public void setHoehe(final Double hoehe)
	{
		this.hoehe = hoehe;
	}

	public void setTiefe(final Double tiefe)
	{
		this.tiefe = tiefe;
	}

	public void setLaenge(final Double laenge)
	{
		this.laenge = laenge;
	}

	public void setDurchmesser(final Double durchmesser)
	{
		this.durchmesser = durchmesser;
	}

	public void setGewicht(final Double gewicht)
	{
		this.gewicht = gewicht;
	}

	public void setEinkaufText(final String einkaufText)
	{
		this.einkaufText = einkaufText;
	}

	public void setVerpackungsEinheit(final String verpackungsEinheit)
	{
		this.verpackungsEinheit = verpackungsEinheit;
	}

	public void setArtikelMindestBestellwert(final String artikelMindestBestellwert)
	{
		this.artikelMindestBestellwert = artikelMindestBestellwert;
	}

	public void setArtikelMindestBestellmenge(final String artikelMindestBestellmenge)
	{
		this.artikelMindestBestellmenge = artikelMindestBestellmenge;
	}

	public void setArtikelLieferzeit(final String artikelLieferzeit)
	{
		this.artikelLieferzeit = artikelLieferzeit;
	}

	public void setArtikelModellauslauf(final Date artikelModellauslauf)
	{
		this.artikelModellauslauf = artikelModellauslauf;
	}

	public void setEkVorSkonto(final Double ekVorSkonto)
	{
		this.ekVorSkonto = ekVorSkonto;
	}

	public void setSkontoProzentwert(final Double skontoProzentwert)
	{
		this.skontoProzentwert = skontoProzentwert;
	}

	public void setEkNettoNetto(final Double ekNettoNetto)
	{
		this.ekNettoNetto = ekNettoNetto;
	}

	public void setPreisGueltigAb(final Date preisGueltigAb)
	{
		this.preisGueltigAb = preisGueltigAb;
	}

	public void setPreisGueltigBis(final Date preisGueltigBis)
	{
		this.preisGueltigBis = preisGueltigBis;
	}

	public void setB2cOnlineBezeichnung(final String b2cOnlineBezeichnung)
	{
		this.b2cOnlineBezeichnung = b2cOnlineBezeichnung;
	}

	public void setB2cKurzbeschreibung(final String b2cKurzbeschreibung)
	{
		this.b2cKurzbeschreibung = b2cKurzbeschreibung;
	}

	public void setB2cOnlineBeschreibung(final String b2cOnlineBeschreibung)
	{
		this.b2cOnlineBeschreibung = b2cOnlineBeschreibung;
	}

	public void setB2cUnverbindlicherVerkaufspreis(final Double b2cUnverbindlicherVerkaufspreis)
	{
		this.b2cUnverbindlicherVerkaufspreis = b2cUnverbindlicherVerkaufspreis;
	}
}
