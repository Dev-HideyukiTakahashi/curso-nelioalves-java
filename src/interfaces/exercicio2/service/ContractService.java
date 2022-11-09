package interfaces.exercicio2.service;

import java.time.LocalDate;

import interfaces.exercicio2.entities.Contract;
import interfaces.exercicio2.entities.Installment;

public class ContractService {

	private OnlinePaymentService paymentService;

	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public OnlinePaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, int months) {
		
		double partialValue = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			// Setando próximo mês, para gerar parcela do mês seguinte
			LocalDate nextMonth = contract.getDate().plusMonths(i);
			
			double totalValueOfMounth = partialValue + paymentService.interest(partialValue, i);
			totalValueOfMounth = totalValueOfMounth + paymentService.paymentFee(totalValueOfMounth);
			
			
			System.out.println(nextMonth);
			contract.addContract(new Installment(nextMonth, totalValueOfMounth));
		}
	}
}
