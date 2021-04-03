package br.com.creditas.loan.usecase.response;

public class LoanRateTypeResponse {

	private String type;
	private int taxes;
	private boolean hasLoan;

	public LoanRateTypeResponse(String type, int taxes, boolean hasLoan) {
		this.type = type;
		this.taxes = taxes;
		this.hasLoan = hasLoan;
	}

	public boolean hasLoan() {
		return hasLoan;
	}

	public String getType() {
		return type;
	}

	public int getTaxes() {
		return taxes;
	}

}
