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

	public static boolean isAlphaNumeric(String varString) {
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
					} else {
						continue;
					}
				}
				
			}
		}

		return returnIsAphaNumeric;
	}
	
	public static String retrieveDomainFromEMailId(String someEmail)
	{
	    return  someEmail.substring(someEmail.indexOf("@") + 1);
	}
	
	public static String retrieveDomainFromURL(String url) {
		String domainName = new String(url);

		  int index = domainName.indexOf("://");

		  if (index != -1) {
		    // keep everything after the "://"
		    domainName = domainName.substring(index + 3);
		  }

		  index = domainName.indexOf('/');

		  if (index != -1) {
		    // keep everything before the '/'
		    domainName = domainName.substring(0, index);
		  }

		  // check for and remove a preceding 'www'
		  // followed by any sequence of characters (non-greedy)
		  // followed by a '.'
		  // from the beginning of the string
		  domainName = domainName.replaceFirst("^www.*?\\.", "");

		  return domainName;
		
	}

}
