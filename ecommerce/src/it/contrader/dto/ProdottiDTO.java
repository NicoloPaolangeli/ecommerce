package it.dto;

public class ProdottiDTO {
	private int disponibilit�;
	private int id_prodotti;
	private int prezzo;
	private String nome_prodotto;
	private String luogo_stoccaggio;
	
	public ProdottiDTO() {
		
	}
	
	public ProdottiDTO(int disponibilit�, int id_prodotti, int prezzo, String nome_prodotto, String luogo_stoccaggio) {
		
		this.disponibilit� = disponibilit�;
		this.id_prodotti = id_prodotti;
		this.prezzo = prezzo;
		this.nome_prodotto = nome_prodotto;
		this.luogo_stoccaggio = luogo_stoccaggio;
	}
	public int getDisponibilit�() {
		return disponibilit�;
	}
	public void setDisponibilit�(int disponibilit�) {
		this.disponibilit� = disponibilit�;
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
		return "Prodotti [disponibilit�=" + disponibilit� + ", id_prodotti=" + id_prodotti + ", prezzo=" + prezzo
				+ ", nome_prodotto=" + nome_prodotto + ", luogo_stoccaggio=" + luogo_stoccaggio + "]";
	}

}
