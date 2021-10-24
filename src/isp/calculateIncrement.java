package isp;

public class calculateIncrement {


	public double calculateIncrement(IPerson covid19Pacient, double afection) {
		if (covid19Pacient.getAge()> 65) return afection* 0.8;
		return 0;
	}

}
