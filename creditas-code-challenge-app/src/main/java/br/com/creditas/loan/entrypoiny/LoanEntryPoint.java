package br.com.creditas.loan.entrypoiny;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.creditas.loan.usecase.LoanModalityUseCase;
import br.com.creditas.loan.usecase.request.LoanModalityRequest;
import br.com.creditas.loan.usecase.response.LoanModalityResponse;

@RestController
@RequestMapping("api/v1/loan")
class LoanEntryPoint {
	
	private LoanModalityUseCase loanModalityUseCase;
	
	public LoanEntryPoint(LoanModalityUseCase loanModalityUseCase) {
		this.loanModalityUseCase = loanModalityUseCase;
	}
	
	@PostMapping(value = "/modalities", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LoanModalityResponse> loanModality(@Valid @RequestBody LoanModalityRequest request){
		LoanModalityResponse loanModalityResponse = loanModalityUseCase.execute(request);
		return ResponseEntity.ok(loanModalityResponse);
	}
 
}
