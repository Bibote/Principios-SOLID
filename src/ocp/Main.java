package ocp;
public class Main {
	public static void main(String[] args) {
		Covid19Pacient cp= new Covid19Pacient( 53, false);
		CardioVascularSymptom c=
				new CardioVascularSymptom(34, 3);
		cp.addCardioSymptom(c, 3);
		RespiratorySymptom r= new RespiratorySymptom(56, 5);
		cp.addRespiratorySymptom(r, 2);
		NeuroMuscularSymptom n=
				new NeuroMuscularSymptom( 78, 5);
		cp.addNeuroMuscularSymptom(n, 3);
		System.out.println("El impacto del paciente Covid "+
				" es "+cp.covid19Impact());
	}
}
	