package it.model;

public class Prodotti {
	

	private int disponibilitā;
	private int id_prodotti;
	private int prezzo;
	private String nome_prodotto;
	private String luogo_stoccaggio;
	
	public Prodotti() {
		
	}
	
	public Prodotti(int disponibilitā, int id_prodotti, int prezzo, String nome_prodotto, String luogo_stoccaggio) {
	
		this.disponibilitā = disponibilitā;
		this.id_prodotti = id_prodotti;
		this.prezzo = prezzo;
		this.nome_prodotto = nome_prodotto;
		this.luogo_stoccaggio = luogo_stoccaggio;
	}
	public int getDisponibilitā() {
		return disponibilitā;
	}
	public void setDisponibilitā(int disponibilitā) {
		this.disponibilitā = disponibilitā;
	}
	public int getId_prodotti() {
		return id_prodotti;
	}
	public void setId_prodotti(int id_prodotti) {
		this.id_prodotti = id_prodotti;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	public String getNome_prodotto() {
		return nome_prodotto;
	}
	public void setNome_prodotto(String nome_prodotto) {
		this.nome_prodotto = nome_prodotto;
	}
	public String getLuogo_stoccaggio() {
		return luogo_stoccaggio;
	}
	public void setLuogo_stoccaggio(String luogo_stoccaggio) {
		this.luogo_stoccaggio = luogo_stoccaggio;
	}
	
	@Override
	public String toString() {
		return "Prodotti [disponibilitā=" + disponibilitā + ", id_prodotti=" + id_prodotti + ", prezzo=" + prezzo
				+ ", nome_prodotto=" + nome_prodotto + ", luogo_stoccaggio=" + luogo_stoccaggio + "]";
	}
	
}
