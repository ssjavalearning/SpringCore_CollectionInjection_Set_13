package com.suraj.spring.beans;

import java.util.Set;

public class HCLInfo {
	
	private Set<String> nameSet;
	private Set<Employee> empSet;
	public Set<String> getNameSet() {
		return nameSet;
	}
	public void setNameSet(Set<String> nameSet) {
		this.nameSet = nameSet;
	}
	public Set<Employee> getEmpSet() {
		return empSet;
	}
	public void setEmpSet(Set<Employee> empSet) {
		this.empSet = empSet;
	}
}
