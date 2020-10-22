package br.com.creditas.loan.usecase.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.inject.Named;

import br.com.creditas.loan.dataprovider.LoanTypeDataProvider;
import br.com.creditas.loan.entity.Modality;
import br.com.creditas.loan.usecase.LoanModalityUseCase;
import br.com.creditas.loan.usecase.request.LoanModalityRequest;
import br.com.creditas.loan.usecase.response.LoanModalityResponse;
import br.com.creditas.loan.usecase.response.LoanRateTypeResponse;

@Named
public class LoanModalityUseCaseImpl implements LoanModalityUseCase {

	private List<LoanTypeDataProvider> loanTypes;

	public LoanModalityUseCaseImpl(List<LoanTypeDataProvider> loanTypes) {
		this.loanTypes = loanTypes;
	}

	@Override
	public LoanModalityResponse execute(LoanModalityRequest request) {

		Modality modality = request.toModel();

		List<LoanRateTypeResponse> loanRateTypes = loanTypes
				.stream()
				.map(loanType -> loanType.accept(modality))
				.filter(Optional :: isPresent)
				.map(Optional :: get)
				.collect(Collectors.toList());
		
		return new LoanModalityResponse(modality.getName(), loanRateTypes);
	}

}
