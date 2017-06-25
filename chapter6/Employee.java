/**
 * File name: Employee.java
 * ------------------------
 * This class holds the definition of a new class named Employee that stores
 * the following data for a single employee.
 * 
 * a) The name of the employee (a String)
 * 
 * b) The name of the employee's supervisor(also a String)
 * 
 * c) The employee's annual salary (a double)
 * 
 * Programmer: Peter Lock 
 * Date; 2015/12/25
 */

package com.chapter6;

import acm.program.ConsoleProgram;

public class Employee extends ConsoleProgram {

	public void run(){
		//Test set
		String x = "Peter";
		double y = 45000;
		
		Employee emp = new Employee(x, x, y);
		
		println(emp.employee_name);
		println("Set the name to: Ralph");
		emp.setName("Ralph");
		println("Call the getName method");
		println(emp.getName());
		println("Call the getAnnualSalary method");
		println(emp.getAnnualSalary());
		println("Call the setAnnualSalary method");
		emp.setSalary(emp.getAnnualSalary() * 2);
		println("Call the getAnnualSalary method");
		println(emp.getAnnualSalary());
	}
	
	public Employee(){
		
	}
	/**
	 * Method name: Employee
	 * ---------------------
	 * @param empName Sets the value of empName to the field employee_name.
	 * @param superName Sets the value of superName to the field of supervisor_name.
	 * @param annualSal Sets the value of annualSal to the field of annual_salary.
	 */
	public Employee(String empName, String superName, double annualSal){
		employee_name = empName;
		supervisor_name = superName;
		annual_salary = annualSal;
	}
	/**
	 * Method name: getName
	 * --------------------
	 * Returns the employees name to the calling method.
	 */
	public String getName(){
		return employee_name;
	}
	/**
	 * Method name: getSupervisorName
	 * ------------------------------
	 * @return Returns the supervisors name to the calling method.
	 */
	public String getSupervisorName(){
		return supervisor_name;
	}
	/**
	 * Method name: getAnnualSalary
	 * ----------------------------
	 * @return Returns the annual salary of the employee to the calling method.
	 */
	public double getAnnualSalary(){
		return annual_salary;
	}
	/**
	 * Method name: setName
	 * --------------------
	 * Sets the employees name to the value of new_name.
	 */
	public void setName(String new_name){
		employee_name = new_name;
	}
	/**
	 * Method name: setSupervisorName
	 * ------------------------------
	 * @param new_name Sets the supervisors name to the value of new_name.
	 */
	public void setSupervisorName(String new_name){
		supervisor_name = new_name;
	}
	/**
	 * Method name: setSalary
	 * ----------------------
	 * @param new_salary Sets the employees salary to the value in new_salary.
	 */
	public void setSalary(double new_salary){
		annual_salary = new_salary;
	}
	
	private String employee_name, supervisor_name;
	private double annual_salary;

}
