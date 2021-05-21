package eCommerce.validationRules;

public class Utils {
	
	public static boolean businessRules(boolean... rules) {
		for (boolean rule : rules) {
			if(!rule) {
				return false;
			}
			
		}
		return true;
	}

}
