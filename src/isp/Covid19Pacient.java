package isp;

public class Covid19Pacient extends Pacient implements IPacient, IPerson {
	public Covid19Pacient(String name, int age, boolean isAlergic) {
		super(name, age, isAlergic);
	}
	@Override
	public double getCovidImpact() {
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		calculateImpact ca=new calculateImpact();
		afection=ca.calculateImpact(this);
		//calculate increment
		calculateIncrement incr=new calculateIncrement();
		increment=incr.calculateIncrement(this, afection);
		//calculate impact
		impact=afection+increment;
		return impact;
	}
	@Override
	public void addSymptom(Symptom c, Integer weight) {
		// TODO Auto-generated method stub
		
	}

}

