package com.capgemini.com.Day4;

public class Employee {
	private String employeeId;
	private String employeeName;
	private String employeeAddress;
	private int  employeePhone;
	private double  basicSalary;
	private double specialAllowance=250.80;
	private double HRA=1000.50;
	Employee(){
		
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public int getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(int employeePhone) {
		this.employeePhone = employeePhone;
	}
	

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	Employee(String Id,String name,String address,int phone, double salary)
	{
		employeeId=Id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary=salary;
		
		
	}
	
	double calculateSalary()
	{
		double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * HRA/100);
		return salary;
		
	}
	
	
	

}
