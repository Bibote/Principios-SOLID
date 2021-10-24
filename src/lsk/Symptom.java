package lsk;

public class Symptom implements Icure {
	protected String name;
	protected int covidImpact;
	protected int severityIndex;
	protected int affectedDays;

	public Symptom(String name, int covidImpact, int severityIndex  ) {
		this.name=name;
		this.covidImpact=covidImpact;
		this.severityIndex=severityIndex;
				
	}

	public int getCovidImpact() {
		return covidImpact;
	}

	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}

	public int getSeverityIndex() {
		return severityIndex;
	}

	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAffectedDays() {
		return affectedDays;
	}

	public void setAffectedDays(int affectedDays) {
		this.affectedDays = affectedDays;
	}
	public void show(){
		System.out.println("symptom value :"+name+" severityIndex :"+
		severityIndex+" covidImpact:"+covidImpact);
	}
	@Override
	public void cure(){
		System.out.println("treatment applied to: "+affectedDays+ " days");
	}
	

}