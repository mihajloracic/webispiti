package primer04;

import java.util.ArrayList;
import java.util.HashMap;

public class Repository {
	ArrayList<Ispit> items;
	
	public void addIspit(Ispit ispit){
		items.add(ispit);
	}
	
	
	
	public ArrayList<Ispit> getItems() {
		return items;
	}

	public void setItems(ArrayList<Ispit> items) {
		this.items = items;
	}

	public String toHtml(){
		String retVal = "<table border=\"1\"><tr><th>Kandidat</th><th>Instruktor</th><th>Nacin polaganja</th><th>Datum</th><th>Bodovi</th></tr>";
		for(Ispit i : items){
			retVal += i.toHtml();
		}
		retVal +="</table><p><a href=\"index.html\">nazad na index</a></p>";
		return retVal;
	}
	
	@Override
	public String toString() {
		String retVal = "\nIspiti:\n";
		for(Ispit i : items){
			retVal += i.toString();
		}
		return retVal;
	}

	public Repository() {
		super();
		items = new ArrayList<Ispit>();
		// TODO Auto-generated constructor stub
	}
	
	
}
