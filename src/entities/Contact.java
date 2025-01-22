package entities;

public class Contact {
	private int id;
    private String nom;
    private long telephone;
    private String adress;
    public static int count=0;
	public Contact(int id, String nom, long telephone, String adress) {
		super();
		this.id = count++;
		this.nom = nom;
		this.telephone = telephone;
		this.adress = adress;
	}
	public Contact(String nom, long telephone, String adress) {
		super();
		this.id = count++;
		this.nom = nom;
		this.telephone = telephone;
		this.adress = adress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getTelephone() {
		return telephone;
	}
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", nom=" + nom + ", telephone=" + telephone + ", adress=" + adress + "]";
	}
	

}
