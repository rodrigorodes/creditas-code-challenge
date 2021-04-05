package br.com.creditas.loan.entity.vo;

import java.util.function.Function;

import br.com.creditas.loan.entity.Modality;

public enum GuaranteeType {

	RULE_ONE(Modality::guaranteeRuleOne), 
	RULE_TWO(Modality::guaranteeRuleTwo), 
	RULE_THREE(Modality::guaranteeRuleThree);

	private Function<Modality, Boolean> modalityFunction;

	private GuaranteeType(Function<Modality, Boolean> modalityFunction) {
		this.modalityFunction = modalityFunction;
	}

	public Function<Modality, Boolean> getModalityFunction() {
		return modalityFunction;
	}
}
