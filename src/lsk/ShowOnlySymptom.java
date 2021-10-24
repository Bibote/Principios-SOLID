package lsk;

public class ShowOnlySymptom extends Symptom implements Icure{
	public ShowOnlySymptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
	}

	public void cure() {
		System.out.println("ERROR, can not be treated");
	}
}