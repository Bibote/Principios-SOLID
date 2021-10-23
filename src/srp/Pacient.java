package srp;

import java.util.HashMap;
import java.util.Map;

public class Pacient { 
	String name;
	int age; 
	boolean isAlergic;
	protected Map<CardioVascularSymptom, Integer> cardios = new
				HashMap<CardioVascularSymptom, Integer>();
	protected Map<NeuroMuscularSymptom, Integer> neuros = new
				HashMap<NeuroMuscularSymptom, Integer>();
	protected Map<RespiratorySymptom, Integer> respirs = new
				HashMap<RespiratorySymptom, Integer>();
	public Pacient(String name, int age, boolean isAlergic) {
		super();
		this.name=name;
		this.age = age;
		this.isAlergic = isAlergic;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAlergic() {
		return isAlergic;
	}
	public void setAlergic(boolean isAlergic) {
		this.isAlergic = isAlergic;
	}
	public void addCardioSymptom(CardioVascularSymptom c, Integer weight) {
		cardios.put(c, weight);
	}
	public void addNeuroMuscularSymptom(NeuroMuscularSymptom nm, Integer weight) {
		neuros.put(nm, weight);
	}
	public void addRespiratorySymptom(RespiratorySymptom r, Integer weight) {
		respirs.put(r, weight);
	}
	public int sanatedDays() {
		int days=0;
		for (Symptom c:cardios.keySet())
			days=days+c.getAffectedDays();
		for (NeuroMuscularSymptom c:neuros.keySet())
			days=days+c.getAffectedDays();
		for (Symptom c:respirs.keySet())
			days=days+c.getAffectedDays();
		return days;
		
	}
	
}
