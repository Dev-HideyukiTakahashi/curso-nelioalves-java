package enums.exercicio1;
import java.time.LocalDate;

public class HourContract {

	private LocalDate date;
	private double valuePerHour;
	private int hours;

	public HourContract(LocalDate date, double valuePerHour, int hour) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		hours = hour;
	}

	public LocalDate getLocalDate() {
		return date;
	}

	public void setLocalDate(LocalDate date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public int getHour() {
		return hours;
	}

	public void setHour(int hour) {
		hours = hour;
	}

	public double totalValue() {
		return valuePerHour * hours;
	}
}
