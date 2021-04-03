package br.com.creditas.loan.dataprovider;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.creditas.loan.entity.Modality;
import br.com.creditas.loan.entity.vo.LoanRateType;
import br.com.creditas.loan.usecase.response.LoanRateTypeResponse;

@Component
class LoanPersonalDataProvider implements LoanTypeDataProvider {

	@Override
	public Optional<LoanRateTypeResponse> accept(Modality modality) {
		return Optional.of(new LoanRateTypeResponse(LoanRateType.PERSONAL.getName(), LoanRateType.PERSONAL.getRate(), true));
	}

}
