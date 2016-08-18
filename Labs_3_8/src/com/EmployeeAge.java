package com;

public enum EmployeeAge {
	ALLOWED_TO_WORK, NOT_ALLOWED_TO_WORK;
	public EmployeeAge getEmployeeAccess(int age) {
		return age < 16 ? NOT_ALLOWED_TO_WORK : ALLOWED_TO_WORK;
	}

}
