package herancapolimorfismo.exercicios;

public class Individual extends TaxPayer {

	private double healthExpenditures;

	public Individual(String name, double annualIncome, double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double tax = 0;
		
		if(getAnnualIncome() < 20000.00) {
			tax = getAnnualIncome() * 0.15 ;
		}else {
			tax = getAnnualIncome() * 0.25 ;
		}
		
		if(healthExpenditures > 0 ) {
			tax = tax - healthExpenditures * 0.50;
		}
		
		return tax;
	}

}
