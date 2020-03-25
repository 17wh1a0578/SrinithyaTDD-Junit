package Epam.remove_A;

public class RemoveA {
	public String removeA(String string) {
		String result = string;
		if(string.length() >= 1 && (string.charAt(0) == 'A' || string.charAt(0) == 'a')) {
			result = string.substring(1);
		}
		if(string.length() >= 2 && (string.charAt(0) != 'A'|| string.charAt(0) != 'a') && (string.charAt(1) == 'A' || string.charAt(1) == 'a' )) {
			result = string.charAt(0) + string.substring(2);
		}
		if(string.length() >= 2 && (string.charAt(0) == 'A' || string.charAt(0) == 'a')  && (string.charAt(1) == 'A' || string.charAt(1) == 'a' )) {
			result = string.substring(2);
		}
		return result; 
	}
}
