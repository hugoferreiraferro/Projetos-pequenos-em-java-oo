package model.contract.services;

import java.time.LocalDate;

import model.contract.entites.Contract;
import model.contract.entites.Installment;

public class ContractServices {
	private OnlinePaymentService onlinePaymentServices;

	public ContractServices(OnlinePaymentService onlinePaymentServices) {
		this.onlinePaymentServices = onlinePaymentServices;
	}

	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentServices.interest(i, basicQuota);
            double fee =  onlinePaymentServices.paymentFree(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallment().add(new Installment(dueDate, quota));
        }
		

	}

}
