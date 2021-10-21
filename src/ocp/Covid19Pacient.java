package ocp;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient{
	public Covid19Pacient(int age, boolean isAlergic) {
		super(age, isAlergic);
		// TODO Auto-generated constructor stub
	}
	private Map<CardioVascularSymptom, Integer> cardios=new
			HashMap<CardioVascularSymptom, Integer>();
	private Map<NeuroMuscularSymptom, Integer> neuros=new
			HashMap<NeuroMuscularSymptom, Integer>();
	private Map<RespiratorySymptom, Integer> respirs=new
			HashMap<RespiratorySymptom, Integer>();
	public void addCardioSymptom(CardioVascularSymptom c, Integer weight){
		cardios.put(c, weight);
	}
	public void addNeuroMuscularSymptom(NeuroMuscularSymptom nm,
			Integer weight){
		neuros.put(nm, weight);
	}
	public void addRespiratorySymptom (RespiratorySymptom r,
			Integer weight){
		respirs.put(r, weight);
	}
	public double covid19Impact() {
		double afection=0;
		double increment=0;
		double impact;
		//calculate affection
		for (CardioVascularSymptom c:cardios.keySet())
			afection=afection+c.getSeverityIndex()*cardios.get(c);
		for (NeuroMuscularSymptom c:neuros.keySet())
			afection=afection+c.getSeverityIndex()*neuros.get(c);
		for (RespiratorySymptom c:respirs.keySet())
			afection=afection+c.getSeverityIndex()*respirs.get(c);
		afection=afection/(cardios.size()+neuros.size()+respirs.size());
		//calculate increment
		if (getAge()> 65) increment=afection*0.5;
		//calculate impact
		impact= afection+ increment;
		return impact;
	}
}

