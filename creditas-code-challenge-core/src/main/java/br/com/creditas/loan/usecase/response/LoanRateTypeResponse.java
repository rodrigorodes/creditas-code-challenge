package br.com.creditas.loan.usecase.response;

public class LoanRateTypeResponse {

	private String type;
	private int taxes;

	public LoanRateTypeResponse(String type, int taxes) {
		this.type = type;
		this.taxes = taxes;
	}

	public String getType() {
		return type;
	}

	public int getTaxes() {
		return taxes;
	}

}
