package br.com.creditas.loan.dataprovider;

import java.util.Optional;

import br.com.creditas.loan.entity.Modality;
import br.com.creditas.loan.entity.vo.LoanRateType;
import br.com.creditas.loan.usecase.response.LoanRateTypeResponse;

public class LoanConsignedDataProviderTest implements LoanTypeDataProvider {

	@Override
	public Optional<LoanRateTypeResponse> accept(Modality modality) {

		if (modality.hasConsigned()) {
			return Optional.of(new LoanRateTypeResponse(LoanRateType.CONSIGNED.getName(), LoanRateType.CONSIGNED.getRate(), true));
		}

		return Optional.empty();
	}

}
