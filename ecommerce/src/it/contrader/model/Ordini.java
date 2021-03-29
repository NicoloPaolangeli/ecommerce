package it.contrader.model;
/**
 * Per dettagli vedi guida sez 4 Model
 */
public class Ordini {

	/**
	 * Qui sotto definisco gli attributi di User. 
	 */
	private int id_ordini;

	private int id_prodotti;
	
	private int quantita;
	
	private int id_clienti;
	
	private int iva;
	
	private int prezzo_totale;
	
	private String data_ordine;
	
	private String indirizzo_spedizione;
	
	private String modalita_pagamento;
	
	

	/**
	 * Definisco i due costruttori, uno vuoto e uno con tre parametri per costrire oggetti di tipo User
	 */
	public Ordini() {
		
	}

	public Ordini (int id_prodotti, int quantita, int id_clienti, int iva, int prezzo_totale, String data_ordine, String indirizzo_spedizione, String modalita_pagamento) {
		this.id_prodotti = id_prodotti;
		this.quantita = quantita;
		this.id_clienti = id_clienti;
		this.iva = iva;
		this.prezzo_totale = prezzo_totale;
		this.data_ordine = data_ordine;
		this.indirizzo_spedizione = indirizzo_spedizione;
		this.modalita_pagamento = modalita_pagamento;
	}

	public Ordini (int id_ordini, int id_prodotti, int quantita, int id_clienti, int iva, int prezzo_totale, String data_ordine, String indirizzo_spedizione, String modalita_pagamento) {
		this.id_ordini = id_ordini;
		this.id_prodotti = id_prodotti;
		this.quantita = quantita;
		this.id_clienti = id_clienti;
		this.iva = iva;
		this.prezzo_totale = prezzo_totale;
		this.data_ordine = data_ordine;
		this.indirizzo_spedizione = indirizzo_spedizione;
		this.modalita_pagamento = modalita_pagamento;
	}

	/**
	 * Getter e Setter: servono alle altre classi a recuperare e modificare gli attributi di User
	 */
	
	


	public int getId_ordini() {
		return id_ordini;
	}

	public void setId_ordini(int id_ordini) {
		this.id_ordini = id_ordini;
	}

	public int getId_prodotti() {
		return id_prodotti;
	}

	public void setId_prodotti(int id_prodotti) {
		this.id_prodotti = id_prodotti;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public int getId_clienti() {
		return id_clienti;
	}

	public void setId_clienti(int id_clienti) {
		this.id_clienti = id_clienti;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getPrezzo_totale() {
		return prezzo_totale;
	}

	public void setPrezzo_totale(int prezzo_totale) {
		this.prezzo_totale = prezzo_totale;
	}

	public String getData_ordine() {
		return data_ordine;
	}

	public void setData_ordine(String data_ordine) {
		this.data_ordine = data_ordine;
	}

	public String getIndirizzo_spedizione() {
		return indirizzo_spedizione;
	}

	public void setIndirizzo_spedizione(String indirizzo_spedizione) {
		this.indirizzo_spedizione = indirizzo_spedizione;
	}

	public String getModalita_pagamento() {
		return modalita_pagamento;
	}

	public void setModalita_pagamento(String modalita_pagamento) {
		this.modalita_pagamento = modalita_pagamento;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordini other = (Ordini) obj;
		if (data_ordine == null) {
			if (other.data_ordine != null)
				return false;
		} else if (!data_ordine.equals(other.data_ordine))
			return false;
		if (id_clienti != other.id_clienti)
			return false;
		if (id_ordini != other.id_ordini)
			return false;
		if (id_prodotti != other.id_prodotti)
			return false;
		if (indirizzo_spedizione == null) {
			if (other.indirizzo_spedizione != null)
				return false;
		} else if (!indirizzo_spedizione.equals(other.indirizzo_spedizione))
			return false;
		if (iva != other.iva)
			return false;
		if (modalita_pagamento == null) {
			if (other.modalita_pagamento != null)
				return false;
		} else if (!modalita_pagamento.equals(other.modalita_pagamento))
			return false;
		if (prezzo_totale != other.prezzo_totale)
			return false;
		if (quantita != other.quantita)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ordini [id_ordini=" + id_ordini + ", id_prodotti=" + id_prodotti + ", quantita=" + quantita
				+ ", id_clienti=" + id_clienti + ", iva=" + iva + ", prezzo_totale=" + prezzo_totale + ", data_ordine="
				+ data_ordine + ", indirizzo_spedizione=" + indirizzo_spedizione + ", modalita_pagamento="
				+ modalita_pagamento + ", getId_ordini()=" + getId_ordini() + ", getId_prodotti()=" + getId_prodotti()
				+ ", getQuantita()=" + getQuantita() + ", getId_clienti()=" + getId_clienti() + ", getIva()=" + getIva()
				+ ", getPrezzo_totale()=" + getPrezzo_totale() + ", getData_ordine()=" + getData_ordine()
				+ ", getIndirizzo_spedizione()=" + getIndirizzo_spedizione() + ", getModalita_pagamento()="
				+ getModalita_pagamento() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
