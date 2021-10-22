package ocp;

public class Covid19Pacient extends Pacient{
	public Covid19Pacient(int age, boolean isAlergic) {
		super(age, isAlergic);
		// TODO Auto-generated constructor stub
	}
	public double covid19Impact() {
		double afection=0;
		double increment=0;
		double impact;
		//calculate affection
		for (Symtom c:cardios.keySet())
			afection=afection+c.getSeverityIndex()*cardios.get(c);
		for (NeuroMuscularSymptom c:neuros.keySet())
			afection=afection+c.getSeverityIndex()*neuros.get(c);
		for (Symtom c:respirs.keySet())
			afection=afection+c.getSeverityIndex()*respirs.get(c);
		afection=afection/(cardios.size()+neuros.size()+respirs.size());
		//calculate increment
		if (getAge()> 65) increment=afection*0.5;
		//calculate impact
		impact= afection+ increment;
		return impact;
	}
}

