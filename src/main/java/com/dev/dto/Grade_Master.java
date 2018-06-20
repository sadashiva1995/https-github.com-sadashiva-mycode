package com.dev.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grade_master")
public class Grade_Master {
	@Column(name="grade_Code")
	@Id
	private String grade_Code;
	
	@Column(name="description")
	private String description;
	
	@Column(name="min_Salary")
	private int min_Salary;
	
	@Column(name="min_Salary")
	private int max_Salary;

	public String getGrade_Code() {
		return grade_Code;
	}

	public void setGrade_Code(String grade_Code) {
		this.grade_Code = grade_Code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMin_Salary() {
		return min_Salary;
	}

	public void setMin_Salary(int min_Salary) {
		this.min_Salary = min_Salary;
	}

	public int getMax_Salary() {
		return max_Salary;
	}

	public void setMax_Salary(int max_Salary) {
		this.max_Salary = max_Salary;
	}

	@Override
	public String toString() {
		return "Grade_Master [grade_Code=" + grade_Code + ", description=" + description + ", min_Salary=" + min_Salary
				+ ", max_Salary=" + max_Salary + "]";
	}

}
