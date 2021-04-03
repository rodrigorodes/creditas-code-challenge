package br.com.creditas.loan.entity;

class GuaranteeConditionOne implements HasGuarantee {

	@Override
	public boolean isAccept(Modality modality) {
		return modality.isSalaryLessThan(3001) && modality.isAgeLessThat(30) && modality.isLocationSP();
	}
}
