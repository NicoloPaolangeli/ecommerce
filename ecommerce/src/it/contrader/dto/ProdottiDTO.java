package it.dto;

public class ProdottiDTO {
	private int disponibilità;
	private int id_prodotti;
	private int prezzo;
	private String nome_prodotto;
	private String luogo_stoccaggio;
	
	public ProdottiDTO() {
		
	}
	
	public ProdottiDTO(int disponibilità, int id_prodotti, int prezzo, String nome_prodotto, String luogo_stoccaggio) {
		
		this.disponibilità = disponibilità;
		this.id_prodotti = id_prodotti;
		this.prezzo = prezzo;
		this.nome_prodotto = nome_prodotto;
		this.luogo_stoccaggio = luogo_stoccaggio;
	}
	public int getDisponibilità() {
		return disponibilità;
	}
	public void setDisponibilità(int disponibilità) {
		this.disponibilità = disponibilità;
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
		return "Prodotti [disponibilità=" + disponibilità + ", id_prodotti=" + id_prodotti + ", prezzo=" + prezzo
				+ ", nome_prodotto=" + nome_prodotto + ", luogo_stoccaggio=" + luogo_stoccaggio + "]";
	}

}
