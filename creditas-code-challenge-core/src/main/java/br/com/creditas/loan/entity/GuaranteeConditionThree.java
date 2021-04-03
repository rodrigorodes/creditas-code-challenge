package br.com.creditas.loan.entity;

class GuaranteeConditionThree implements HasGuarantee {

	@Override
	public boolean isAccept(Modality modality) {
		return modality.isSalaryBiggerThan(4999) && modality.isAgeLessThat(30);
	}
}
