package interfaces.exercicio1.service;

import java.time.Duration;

import interfaces.exercicio1.entities.CarRental;
import interfaces.exercicio1.entities.Invoice;

public class RentalService {

	private double pricePerHour;
	private double pricePerDay;
	private TaxService taxService;

	public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		Duration duration = Duration.between(carRental.getStart(), carRental.getFinish());
		double diff = duration.toMinutes();
		System.out.println(diff);
		// 720 min = 12 horas
		if (diff > 720) {
			if(diff > 1440) {
				double days = Math.ceil(diff = diff / 60 / 24);
				double basicPayment = days * pricePerDay;
				double tax =  taxService.tax(basicPayment);
				carRental.setInvoice(new Invoice(basicPayment, tax));
			}
			
		}else {
			double hours = Math.ceil(diff / 60);
			double basicPayment = hours * pricePerHour;
			double tax =  taxService.tax(basicPayment);
			carRental.setInvoice(new Invoice(basicPayment, tax));
		}
	}
}
