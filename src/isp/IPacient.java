package isp;

public interface IPacient {

	String getName();



	void setAge(int age);

	boolean isAlergic();

	void setAlergic(boolean isAlergic);

	void addSymptom(Symptom c, Integer weight);

	int sanatedDays();

	void showSymptoms();

	void cure();
	
	double getCovidImpact();

}