package model.contract.services;

public interface OnlinePaymentService {
	double paymentFree(Double amount);
	double interest(Integer months, Double amount);

}
