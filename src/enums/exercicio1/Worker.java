package enums.exercicio1;
import java.util.ArrayList;
import java.util.List;

public class Worker {

	private String name;
	private WorkerLevel level;
	private double baseSalary;
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int month, int year) {
		double total = baseSalary;
		for(HourContract c: contracts) {
			if(c.getLocalDate().getMonthValue() == month && c.getLocalDate().getYear() == year) {
				total += c.totalValue();
			}
		}
		
		return total;
	}
}
