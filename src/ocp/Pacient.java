package ocp;

import java.util.HashMap;
import java.util.Map;

public class Pacient { 
	int age; 
	boolean isAlergic;
	protected Map<CardioVascularSymptom, Integer> cardios = new
				HashMap<CardioVascularSymptom, Integer>();
	protected Map<NeuroMuscularSymptom, Integer> neuros = new
				HashMap<NeuroMuscularSymptom, Integer>();
	protected Map<RespiratorySymptom, Integer> respirs = new
				HashMap<RespiratorySymptom, Integer>();
	public Pacient(int age, boolean isAlergic) {
		super();
		this.age = age;
		this.isAlergic = isAlergic;
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
	
}
