package ocp;

public class Pacient { 
	int age; 
	boolean isAlergic;
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
	
}
