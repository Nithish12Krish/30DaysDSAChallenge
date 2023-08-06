package com.nithish.day4;


//Problem Link : https://leetcode.com/problems/defanging-an-ip-address/
class DefangIPAddress {
	public String defangIPaddr(String address) {

		String[] adr = address.split("");
		StringBuilder out = new StringBuilder();

		for (String s : adr) {
			if (s.equals(".")) {
				out.append("[.]");
			} else {
				out.append(s);
			}
		}

		return out.toString();

	}
}
