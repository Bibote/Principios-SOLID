package dip;

import java.util.HashMap;
import java.util.Map;

public class Pacient { 
	String name;
	int age; 
	boolean isAlergic;
	protected Map<Symptom, Integer> symptoms = new
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
	public void addSymptom(Symptom c, Integer weight) {
		symptoms.put(c, weight);
	}

	public int sanatedDays() {
		int days=0;
		for (Symptom c:symptoms.keySet())
			days=days+c.getAffectedDays();
		for (Symptom c:symptoms.keySet())
			days=days+c.getAffectedDays();
		for (Symptom c:symptoms.keySet())
			days=days+c.getAffectedDays();
		return days;
		
	}
	public void showSymptoms(){
		for (Symptom s: symptoms.keySet()) {
			s.show();
		}

	}
	public void cure(){
		for (Icure s: symptoms.keySet()) {
			s.cure();
		}

	}
	
}
