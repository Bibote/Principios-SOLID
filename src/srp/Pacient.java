package srp;

import java.util.HashMap;
import java.util.Map;

public class Pacient { 
	String name;
	int age; 
	boolean isAlergic;
	protected Map<Symptom, Integer> cardios = new
				HashMap<Symptom, Integer>();
	protected Map<Symptom, Integer> neuros = new
				HashMap<Symptom, Integer>();
	protected Map<Symptom, Integer> respirs = new
				HashMap<Symptom, Integer>();
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
	public void addCardioSymptom(Symptom c, Integer weight) {
		cardios.put(c, weight);
	}
	public void addNeuroMuscularSymptom(Symptom nm, Integer weight) {
		neuros.put(nm, weight);
	}
	public void addRespiratorySymptom(Symptom r, Integer weight) {
		respirs.put(r, weight);
	}
	public int sanatedDays() {
		int days=0;
		for (Symptom c:cardios.keySet())
			days=days+c.getAffectedDays();
		for (Symptom c:neuros.keySet())
			days=days+c.getAffectedDays();
		for (Symptom c:respirs.keySet())
			days=days+c.getAffectedDays();
		return days;
		
	}
	
}
