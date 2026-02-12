public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pluralize(String a) {
		if (a.length() >= 2 && a.substring(a.length()-2,a.length()).toLowerCase().equals("ey")) {
			return "eys";
		} else if (a.length() >= 1 && a.substring(a.length()-1,a.length()).toLowerCase().equals("y")) {
			return "ies";
		} else if (a.length() >= 3 && a.substring(a.length()-3,a.length()).toLowerCase().equals("ife")) {
			return "ives";
		} else {
			return "s";
		}
	}

	public static int min(int a, int b, int c) {
//		return Math.min(Math.min(a, b),c);
		if (a < b) {
			if (a < c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (b < c) {
				return b;
			} else {
				return c;
			}
		}
	}

	public static boolean isLeapYear(int a) {
		if (a%4!=0) {
			return false;
		} else if (a%100!=0) {
			return true;
		} else if (a%400==0) {
			return true;
		} else {
			return false;
		}
	}
}
