package org.opal.lib.utilities.test;

import org.opal.lib.utilities.test.StringUtil.isAphaNumeric;
import org.opal.lib.utilities.test.StringUtil.isNumeric;

public class TestManager {
	
	public TestManager(){
		
	}
	
	public static void main(String[] args) {
		
		isNumeric var = new isNumeric();
		var.execute();
		
		isAphaNumeric varnew = new isAphaNumeric();
		varnew.execute();
	}

}
