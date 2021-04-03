package br.com.creditas.loan.entity;

class GuaranteeConditionTwo implements HasGuarantee {

	@Override
	public boolean isAccept(Modality modality) {
		return modality.isSalaryBiggerThan(3000) && modality.isSalaryLessThan(5001) && modality.isLocationSP();
	}

}
