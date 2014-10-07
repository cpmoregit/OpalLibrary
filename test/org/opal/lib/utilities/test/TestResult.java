package org.opal.lib.utilities.test;

import java.util.Date;

public class TestResult {
	
	private int caseID;
	private Date executionDate;
	private boolean result;
	private String Description;
	
	public TestResult(int newCaseID,
			           Date newExecutionDate,
			           boolean newResult,
			           String newDescription){
		caseID = newCaseID;
		executionDate = newExecutionDate;
		result = newResult;
		Description = newDescription;
	}

	/**
	 * @return the caseID
	 */
	public int getCaseID() {
		return caseID;
	}

	/**
	 * @return the executionDate
	 */
	public Date getExecutionDate() {
		return executionDate;
	}

	/**
	 * @return the result
	 */
	public boolean isResult() {
		return result;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
			           
}
