package br.com.creditas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.creditas")
public class CreaditasLoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreaditasLoanApplication.class, args);
	}

}
