package isp;

public interface IPerson {

	String getName();

	void setName(String name);

	int getAge();

	void setAge(int age);

	void setAlergic(boolean isAlergic);

	boolean isAlergic();

	void addSymptom(Symptom c, Integer weight);

}