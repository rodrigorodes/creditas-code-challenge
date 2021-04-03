package br.com.creditas.loan.dataprovider;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.creditas.loan.entity.Modality;
import br.com.creditas.loan.entity.vo.LoanRateType;
import br.com.creditas.loan.usecase.response.LoanRateTypeResponse;

@Component
class LoanConsignedDataProvider implements LoanTypeDataProvider {

	@Override
	public Optional<LoanRateTypeResponse> accept(Modality modality) {
		return modality.hasConsigned()
				? Optional.of(new LoanRateTypeResponse(LoanRateType.CONSIGNED.getName(), LoanRateType.CONSIGNED.getRate(), true))
				: Optional.empty();
	}

}
