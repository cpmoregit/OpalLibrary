package org.opal.lib.utilities.test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

public class TestResultsOps {
	
	private Vector _testResults = new Vector();
	
	public TestResultsOps(){
		
	}
	
	public void add(int caseID, boolean result, String description){
		_testResults.add(
				new TestResult(
						caseID,
						new Date(),
						result,
						description)
				);
	}
	
	
	public void printResult(PrintStream printStream){
		StringBuffer resultBuffer = null;
		
		Iterator resultIterator = _testResults.iterator();
		TestResult testResult = null;
		
		resultBuffer.append("Case ID");
		resultBuffer.append(",");
		resultBuffer.append("Execution Date");
		resultBuffer.append(",");
		resultBuffer.append("Result");
		resultBuffer.append(",");
		resultBuffer.append("Description");
		printStream.println(resultBuffer.toString());

		while(resultIterator.hasNext()){
			resultBuffer = new StringBuffer();
			testResult = (TestResult)resultIterator.next();
			resultBuffer.append(testResult.getCaseID());
			resultBuffer.append(",");
			resultBuffer.append(testResult.getExecutionDate());
			resultBuffer.append(",");
		
			if(testResult.isResult()){
				resultBuffer.append("Success");
			}else{
				resultBuffer.append("Failure");
			}
		
			resultBuffer.append(",");
			resultBuffer.append(testResult.getDescription());
			printStream.println(resultBuffer.toString());
		}
		
	}

}
