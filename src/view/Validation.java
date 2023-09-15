package view;


public class Validation {
    public static boolean checkValidPhoneNumber(String num) {
		if (num.matches("\\d{10}\\d*$")) {                              // so xuat hien 10 lan
			System.out.println("Valid phone number.");
			return true;
		}
		else
			System.out.println("Entered phone number is invalid.");
		return false;
	}
	
    public static boolean checkValidBirthDate(int bd) {
		if (bd/1000 < 10 && bd/1000 > 0) {
			System.out.println("Valid birth date.");
			return true;
		}
		else
			System.out.println("Entered birth date is invalid");
		return false;
	}
	
    public static boolean checkValidEmail(String mail) {
		if (mail.matches("^(.+)@(\\S+)$")) {		// bdau bang bat ki ki tu nao ko bo trong @ phan cuoi ko co khoang trong
			System.out.println("Valid email.");
			return true;
		}
		else
			System.out.println("Entered email is invalid.");
		return false;
	}
    public static boolean checkValidYear(int y) {
		if (y >= 0 && y <100 ) {
			System.out.println("It is valid.");
			return true;
		}
		else
			System.out.println("Entered number is invalid.");
		return false;
	}
    
    public static boolean checkRankGra(String rank) {
		String[] ranks = {"Exellence", "Good", "Fair", "Poor"};
		if (isConsist(ranks, rank)) {
			System.out.println("It is a valid rank.");
			return true;
		}
		else
			System.out.println("Entered rank is invalid.");
		return false;
	}
	
    public static boolean isConsist(String[] a, String x) {
		for(int i=0; i< a.length; i++)
			if (a[i].matches(x))
				return true;
		return false;
	}
}
