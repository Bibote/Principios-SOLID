package ocp;

public class NeuroMuscularSymptom extends Symtom { 
	int covidImpact; 
	int severityIndex;
	public NeuroMuscularSymptom(int covidImpact, int severityIndex) {
		super();
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
	}

}
