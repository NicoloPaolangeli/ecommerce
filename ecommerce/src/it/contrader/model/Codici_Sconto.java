package it.contrader.model;
/**
 * Per dettagli vedi guida sez 4 Model
 */
public class Codici_Sconto {

	/**
	 * Qui sotto definisco gli attributi di User. 
	 */
	private int id_codice_sconto;

	private int id_ordini;
	
	private int sconto_percentuale;
	
	private String data_emissione;
	
	private Boolean riscossione;
	
	private String data_scadenza;
	
	
	

	/**
	 * Definisco i due costruttori, uno vuoto e uno con tre parametri per costrire oggetti di tipo User
	 */
	public Codici_Sconto() {
		
	}

	public Codici_Sconto (int id_ordini, int sconto_percentuale, String data_emissione, Boolean riscossione, String data_scadenza) {
		this.id_ordini = id_ordini;
		this.sconto_percentuale = sconto_percentuale;
		this.data_emissione = data_emissione;
		this.riscossione = riscossione;
		this.data_scadenza = data_scadenza;
	}

	public Codici_Sconto (int id_codice_sconto, int id_ordini, int sconto_percentuale, String data_emissione, Boolean riscossione, String data_scadenza) {
		this.id_codice_sconto = id_codice_sconto;
		this.id_ordini = id_ordini;
		this.sconto_percentuale = sconto_percentuale;
		this.data_emissione = data_emissione;
		this.riscossione = riscossione;
		this.data_scadenza = data_scadenza;
	}

	public int getId_codice_sconto() {
		return id_codice_sconto;
	}

	public void setId_codice_sconto(int id_codice_sconto) {
		this.id_codice_sconto = id_codice_sconto;
	}

	public int getId_ordini() {
		return id_ordini;
	}

	public void setId_ordini(int id_ordini) {
		this.id_ordini = id_ordini;
	}

	public int getSconto_percentuale() {
		return sconto_percentuale;
	}

	public void setSconto_percentuale(int sconto_percentuale) {
		this.sconto_percentuale = sconto_percentuale;
	}

	public String getData_emissione() {
		return data_emissione;
	}

	public void setData_emissione(String data_emissione) {
		this.data_emissione = data_emissione;
	}

	public Boolean getRiscossione() {
		return riscossione;
	}

	public void setRiscossione(Boolean riscossione) {
		this.riscossione = riscossione;
	}

	public String getData_scadenza() {
		return data_scadenza;
	}

	public void setData_scadenza(String data_scadenza) {
		this.data_scadenza = data_scadenza;
	}

	@Override
	public String toString() {
		return "Codici_Sconto [id_codice_sconto=" + id_codice_sconto + ", id_ordini=" + id_ordini
				+ ", sconto_percentuale=" + sconto_percentuale + ", data_emissione=" + data_emissione + ", riscossione="
				+ riscossione + ", data_scadenza=" + data_scadenza + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Codici_Sconto other = (Codici_Sconto) obj;
		if (data_emissione == null) {
			if (other.data_emissione != null)
				return false;
		} else if (!data_emissione.equals(other.data_emissione))
			return false;
		if (data_scadenza == null) {
			if (other.data_scadenza != null)
				return false;
		} else if (!data_scadenza.equals(other.data_scadenza))
			return false;
		if (id_codice_sconto != other.id_codice_sconto)
			return false;
		if (id_ordini != other.id_ordini)
			return false;
		if (riscossione == null) {
			if (other.riscossione != null)
				return false;
		} else if (!riscossione.equals(other.riscossione))
			return false;
		if (sconto_percentuale != other.sconto_percentuale)
			return false;
		return true;
	}

	

	
	
	
	//end	
}
