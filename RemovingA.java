package com.mrecw.junit;

public class RemovingA {

	public String remove(String string) {
		String s = string;
		int len = string.length();
		
		if((len == 1) && (string.charAt(0) == 'A')) {
			s = "";
		}
		else if(string.charAt(0) == 'A'&& (string.charAt(1) == 'A')) {
			 s = string.substring(2, len);
		}
		else if(string.charAt(1) == 'A') {
			
			 s = string.substring(0,1)+string.substring(2, len);
		}
		else if(string.charAt(0) == 'A') {
			
			 s =string.substring(1, len);
		}
		return s;
	}


}
