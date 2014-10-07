package org.opal.lib.utilities;

public class StringUtil {

	public StringUtil() {

	}

	public static boolean isNumeric(String varString) {
		boolean returnIsNumeric = true;
		String trimmedString = null;
		int dotCount = 0;

		if (varString == null) {
			returnIsNumeric = false;
		} else {
			trimmedString = varString.trim();

			byte[] byteString = trimmedString.getBytes();

			int length = byteString.length;
			
			for (int i = 0; i < length; i++) {

				if (!Character.isDigit(byteString[i])) {
					if (byteString[i] == '.') {
						dotCount++;
						if (dotCount > 2) {
							returnIsNumeric = false;
							break;
						} else {
							continue;
						}
					} else {
						returnIsNumeric = false;
						break;
					}
				}
			}
		}
		
		if(returnIsNumeric){
			if(dotCount==1){
					try{
						Double number = Double.valueOf(trimmedString);
					}catch(Exception exp){
						returnIsNumeric = false;
					}
			}else{
				try{
					Long l = Long.valueOf(trimmedString);
				}catch(Exception exp){
					returnIsNumeric = false;
				}
		    }
	   }
		
		return returnIsNumeric;
	}

}
