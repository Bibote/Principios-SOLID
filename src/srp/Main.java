package srp;
public class Main {
	public static void main(String[] args) {
		Covid19Pacient cp= new Covid19Pacient("Juan", 53, false);
		CardioVascularSymptom c=
				new CardioVascularSymptom("Dolor pecho", 34, 3);
		cp.addCardioSymptom(c, 3);
		RespiratorySymptom r= new RespiratorySymptom("Silvido", 56, 5);
		cp.addRespiratorySymptom(r, 2);
		NeuroMuscularSymptom n=
				new NeuroMuscularSymptom("Dificultad Hablar", 78, 5);
		cp.addNeuroMuscularSymptom(n, 3);
		System.out.println("El impacto del paciente Covid "+cp.getName()+
				" es "+cp.covid19Impact());
	}
}
