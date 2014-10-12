package org.opal.lib.utilities.test;

import org.opal.lib.utilities.test.StringUtil.isAlphaNumeric;
import org.opal.lib.utilities.test.StringUtil.isNumeric;

public class TestManager {
	
	public TestManager(){
		
	}
	
	public static void main(String[] args) {
		
		isNumeric var = new isNumeric();
		var.execute();
		
		isAlphaNumeric varnew = new isAlphaNumeric();
		varnew.execute();
	}

}
