package srp;

import java.util.Map;

public class calculateImpact {
	double calculateImpact(Map<Symptom, Integer> sintoma){
		double afection=0;
		for (Symptom c:sintoma.keySet())
			afection=afection+c.getSeverityIndex()*sintoma.get(c);
		
		return afection;
	}

}
