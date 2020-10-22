package br.com.creditas.loan.dataprovider;

import java.util.Optional;

import javax.inject.Named;

import br.com.creditas.loan.entity.Modality;
import br.com.creditas.loan.entity.vo.LoanRateType;
import br.com.creditas.loan.usecase.response.LoanRateTypeResponse;

@Named
public class LoanConsignedDataProvider implements LoanTypeDataProvider {

	@Override
	public Optional<LoanRateTypeResponse> accept(Modality modality) {
		if (modality.isSalaryBiggerThan(4999)) {
			return Optional.of(new LoanRateTypeResponse(LoanRateType.CONSIGNED.getName(), LoanRateType.CONSIGNED.getRate()));
		}
		return Optional.empty();
	}

}
