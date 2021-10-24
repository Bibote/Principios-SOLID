package dip;

public class Covid19Pacient extends Pacient {
	public Covid19Pacient(String name, int age, boolean isAlergic) {
		super(name, age, isAlergic);
	}

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
}

