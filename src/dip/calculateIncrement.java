package dip;

public class calculateIncrement {


	public double calculateIncrement(Covid19Pacient covid19Pacient, double afection) {
		if (covid19Pacient.getAge()> 65) return afection* 0.8;
		return 0;
	}

}
