package dip;
public class Main {
	public static void main(String[] args) {
		Covid19Pacient cp= new Covid19Pacient("Juan", 53, false);
		CardioVascularSymptom c=
				new CardioVascularSymptom("Dolor pecho", 34, 3);
		cp.addSymptom(c, 3);
		RespiratorySymptom r= new RespiratorySymptom("Silvido", 56, 5);
		cp.addSymptom(r, 2);
		NeuroMuscularSymptom n=
				new NeuroMuscularSymptom("Dificultad Hablar", 78, 5);
		cp.addSymptom(n, 3);
		Symptom a= new ShowOnlySymptom("Dificultad Hablar", 78, 5);
		cp.addSymptom(a, 5);
		System.out.println("El impacto del paciente Covid "+cp.getName()+
				" es "+cp.getCovidImpact());
		cp.showSymptoms();
		cp.cure();
	}
}
