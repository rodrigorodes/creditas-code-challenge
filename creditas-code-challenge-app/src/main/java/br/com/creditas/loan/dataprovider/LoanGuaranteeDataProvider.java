package br.com.creditas.loan.dataprovider;

import java.util.Optional;

import javax.inject.Named;

import br.com.creditas.loan.entity.Modality;
import br.com.creditas.loan.entity.vo.LoanRateType;
import br.com.creditas.loan.usecase.response.LoanRateTypeResponse;

@Named
public class LoanGuaranteeDataProvider implements LoanTypeDataProvider {

	@Override
	public Optional<LoanRateTypeResponse> accept(Modality modality) {
		
		if (modality.isSalaryLessThan(3001) && modality.isAgeLessThat(30) && modality.isLocationSP()) {
			return Optional.of(new LoanRateTypeResponse(LoanRateType.GUARANTEE.getName(), LoanRateType.GUARANTEE.getRate()));
		}
		if (modality.isSalaryBiggerThan(3000) && modality.isSalaryLessThan(5001) && modality.isLocationSP()) {
			return Optional.of(new LoanRateTypeResponse(LoanRateType.GUARANTEE.getName(), LoanRateType.GUARANTEE.getRate()));
		}
		if (modality.isSalaryBiggerThan(4999) && modality.isAgeLessThat(30)) {
			return Optional.of(new LoanRateTypeResponse(LoanRateType.GUARANTEE.getName(), LoanRateType.GUARANTEE.getRate()));
		}
		
		return Optional.empty();
	}

}
