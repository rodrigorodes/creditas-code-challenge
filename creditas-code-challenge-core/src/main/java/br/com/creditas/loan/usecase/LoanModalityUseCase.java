package br.com.creditas.loan.usecase;

import br.com.creditas.loan.usecase.request.LoanModalityRequest;
import br.com.creditas.loan.usecase.response.LoanModalityResponse;

public interface LoanModalityUseCase {

	LoanModalityResponse execute(LoanModalityRequest request);

}
