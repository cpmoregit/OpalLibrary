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
		
		return returnIsNumeric;
	}

	public static boolean isAphaNumeric(String varString) {
		boolean returnIsAphaNumeric = true;
		String trimmedString = null;
		
		if (varString == null) {
			returnIsAphaNumeric = false;
		} else {
			trimmedString = varString.trim();

			byte[] byteString = trimmedString.getBytes();

			int length = byteString.length;
			
			for (int i = 0; i < length; i++) {
					
				if (!Character.isDigit(byteString[i])) {
					 if (!Character.isAlphabetic(byteString[i])) {
						 returnIsAphaNumeric = false;
						 break;
					}else{
							continue;
					}						 
				}
			}
		}
		
		return returnIsAphaNumeric;
	}
	
}