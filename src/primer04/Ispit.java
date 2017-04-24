package primer04;

public class Ispit {
	String imeKandidata;
	String imeInstruktora;
	String tipIspita;
	String datum;
	int brojBodova;
	public Ispit(String imeKandidata, String imeInstruktora, String tipIspita, String datum, int brojBodova) {
		super();
		this.imeKandidata = imeKandidata;
		this.imeInstruktora = imeInstruktora;
		this.tipIspita = tipIspita;
		this.datum = datum;
		this.brojBodova = brojBodova;
	}
	public Ispit() {
		super();
		// TODO Auto-generated constructor stub
	}
	String fieldTd(String field){
		return "<td>" + field + "</td>";
	}
	public String toHtml(){
		String color = "<td style=\"background-color: ";
		if(brojBodova < 50){
			color += "red";
		}else{
			color += "green";
		}
		color += ";\">" + Integer.toString(brojBodova) + "</td>";
		return "<tr>" + fieldTd(imeKandidata) + fieldTd(imeInstruktora) + fieldTd(tipIspita) + fieldTd(datum)+ color + "</tr>";
	}
	
	@Override
	public String toString() {
		return "Ispit [imeKandidata=" + imeKandidata + ", imeInstruktora=" + imeInstruktora + ", tipIspita=" + tipIspita
				+ ", datum=" + datum + ", brojBodova=" + brojBodova + "]";
	}
	public String getImeKandidata() {
		return imeKandidata;
	}
	public void setImeKandidata(String imeKandidata) {
		this.imeKandidata = imeKandidata;
	}
	public String getImeInstruktora() {
		return imeInstruktora;
	}
	public void setImeInstruktora(String imeInstruktora) {
		this.imeInstruktora = imeInstruktora;
	}
	public String getTipIspita() {
		return tipIspita;
	}
	public void setTipIspita(String tipIspita) {
		this.tipIspita = tipIspita;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public int getBrojBodova() {
		return brojBodova;
	}
	public void setBrojBodova(int brojBodova) {
		this.brojBodova = brojBodova;
	}
	
}
