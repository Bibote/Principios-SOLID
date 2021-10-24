package isp;

import java.util.Map;

public class calculateImpact {
	double calculateImpact(Covid19Pacient covid19Pacient){
		double afection=0;
		for (lsk.Symptom c:covid19Pacient.symptoms.keySet())
			afection=afection+c.getSeverityIndex()*covid19Pacient.symptoms.get(c);
		
		return afection;
	}
	
}
