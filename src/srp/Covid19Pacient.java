package srp;

public class Covid19Pacient extends Pacient{
	public Covid19Pacient(String name, int age, boolean isAlergic) {
		super(name, age, isAlergic);

	}
	public double covid19Impact() {
		double afection=0;
		double increment=0;
		double impact;
		//calculate affection
		calculateImpact a=new calculateImpact();
		afection=afection+a.calculateImpact(cardios);
		afection=afection+a.calculateImpact(neuros);
		afection=afection+a.calculateImpact(respirs);

		//calculate increment

		calculateIncrement b=new calculateIncrement();
		if (getAge()> 65) increment=b.calculateIncrement(afection, 0.5);
		//calculate impact
		impact= afection+ increment;
		return impact;
	}
}

