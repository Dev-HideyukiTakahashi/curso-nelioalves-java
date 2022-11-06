package herancapolimorfismo.exercicios;

public class Company extends TaxPayer {

	private int numberOfEmployees;

	public Company(String name, double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double tax = 0;
		if(numberOfEmployees < 10) {
			tax = getAnnualIncome() * 0.16;
		}else {
			tax = getAnnualIncome() * 0.14;
		}
		return tax;
	}

}
