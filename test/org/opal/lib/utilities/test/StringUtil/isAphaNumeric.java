package org.opal.lib.utilities.test.StringUtil;

import org.opal.lib.utilities.StringUtil;

public class isAphaNumeric {
	public void execute() {
		String testData[]={
				"1",
				"1.1",
				"1234",
				"1.01",
				"1.01.02.03",
				"a1",
				"A2345",
				"!@#~123",
				" 132",
				" 132 ",
				" 13 2 ",
				"12345678901234567890123456789012345678901234567890",
				"12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901231234567890123456789012345678901234567890123456789045678901234567.89012345678901234567890"
		};

		for(int i=0;i<testData.length;i++){
			System.out.println( testData[i] + " : " + StringUtil.isAphaNumeric(testData[i]) );
		} 
	}
}
