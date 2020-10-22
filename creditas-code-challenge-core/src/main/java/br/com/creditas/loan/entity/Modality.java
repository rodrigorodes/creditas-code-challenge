package br.com.creditas.loan.entity;

import java.math.BigDecimal;

public class Modality {

	private String name;

	private String cpf;

	private int age;

	private String location;

	private BigDecimal income;

	public Modality(String name, String cpf, int age, String location, BigDecimal income) {
		this.name = name;
		this.cpf = cpf;
		this.age = age;
		this.location = location;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public int getAge() {
		return age;
	}

	public String getLocation() {
		return location;
	}

	public BigDecimal getIncome() {
		return income;
	}

	public boolean isSalaryBiggerThan(int salary) {
		return income.compareTo(new BigDecimal(salary)) > 0;
	}

	public boolean isSalaryLessThan(int salary) {
		return income.compareTo(new BigDecimal(salary)) < 0;
	}

	public boolean isAgeLessThat(int age) {
		return this.age < age;
	}

	public boolean isLocationSP() {
		return this.location.equalsIgnoreCase("SP");
	}

}
