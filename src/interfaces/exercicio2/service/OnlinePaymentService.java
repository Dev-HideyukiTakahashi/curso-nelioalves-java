package interfaces.exercicio2.service;

public interface OnlinePaymentService {

	public double paymentFee(double amount);

	public double interest(double amount, int months);
}
