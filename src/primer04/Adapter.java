package primer04;

import java.util.HashMap;

public class Adapter {
	public Ispit getIspit(HashMap<String, String> request){
		Ispit retVal = new Ispit();
		retVal.setBrojBodova(Integer.parseInt(request.get("bodovi")));
		retVal.setImeKandidata(request.get("kandidat"));
		retVal.setImeInstruktora(request.get("instruktor"));
		retVal.setDatum(request.get("datum"));
		retVal.setTipIspita(request.get("nacinpolaganja"));
		return retVal;
	}
}
