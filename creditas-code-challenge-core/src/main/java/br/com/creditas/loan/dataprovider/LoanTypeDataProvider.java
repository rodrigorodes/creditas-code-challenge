package br.com.creditas.loan.dataprovider;

import java.util.Optional;

import br.com.creditas.loan.entity.Modality;
import br.com.creditas.loan.usecase.response.LoanRateTypeResponse;

public interface LoanTypeDataProvider {

	Optional<LoanRateTypeResponse> accept(Modality modality);
}
