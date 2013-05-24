package com.xebia.refactoring.bad;


@SuppressWarnings("unused")
public class Employee {

	private String name;
	private Double salary;
	private Double bonus;
	private Double commission;
	private boolean manager;
	private boolean salesman;
	private boolean engineer;

	public Double calculateSalary() {
		if (manager) {
			return salary + calculateBenefitsForManager();
		} else if (salesman) {
			return salary + calculateBenefitsForSalesman();
		} else if (engineer) {
			return salary;
		} else {
			return 0.0;
		}
	}

	private Double calculateBenefitsForManager() {
		return bonus + commission;
	}

	private Double calculateBenefitsForSalesman() {
		return commission;
	}

	public void fivePercentSalaryIncrement() {
		salary = salary * .05;
	}

	public void tenPercentSalaryIncrement() {
		salary = salary * .10;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

	public void setSalesman(boolean salesman) {
		this.salesman = salesman;
	}

	public void setEngineer(boolean engineer) {
		this.engineer = engineer;
	}

}
