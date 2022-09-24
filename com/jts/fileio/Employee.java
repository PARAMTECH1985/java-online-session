package com.jts.fileio;
import java.io.*;
public class Employee implements Serializable {
public String empName;
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String empId;
public Employee(String empName, String empId) {
	super();
	this.empName = empName;
	this.empId = empId;
}
}
