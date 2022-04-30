import java.util.ArrayList;


public class PasswordUnitTest {
	
	public static ArrayList<String> passwordStorage = new ArrayList<String>();

	public static void main(String[] args) {
		addPassword("jOEmama8");
		addPassword("jOEmama8");
		addPassword("jOEmama6");
		addPassword("WoW42cOOl");
		addPassword("WoW42cOOlWoW42cOOl");
		addPassword("admin");
		addPassword("mod");
		addPassword("mod");

		System.out.println(passwordStorage);
	}

	public static boolean addPassword(String password) {
		if (((containsPassword(passwordStorage,password)) && (checksLength(password) && (oneNumberNoSix(password)) &&  (noSpaces(password)) && (twoCapitalVowels(password))) ||(bypassRules(passwordStorage,password)))) {
			passwordStorage.add(password);
			return true;
		}
		return false;
	}
	
	public static boolean containsPassword(ArrayList<String> passwordStorage,String password){
		if (!passwordStorage.contains(password)) {
			return true;
		}
		return false;
	}
	
	public static boolean checksLength(String password){
		if (password.length() >= 7 && password.length() < 12 ) {
			return true;
		}
		return false;
	}
	
	public static boolean oneNumberNoSix(String password){
		String[] nums = {"0","1","2","3","4","5","7","8","9"};
		String six = "6";
		
		if (password.indexOf(six) != -1) {
			return false;
		}
		for(String num: nums) {
			if (password.indexOf(num) != -1) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean noSpaces(String password){
		if (password.indexOf(" ") == -1) {
			return true;
			}
		return false;
	}
	
	public static boolean twoCapitalVowels(String password){
		ArrayList<Character> capitalVowels = new ArrayList<Character>();
		capitalVowels.add('A');
		capitalVowels.add('E');
		capitalVowels.add('I');
		capitalVowels.add('O');
		capitalVowels.add('U');
		capitalVowels.add('Y');

		int count = 0;
		
		for (int i = 0; i < password.length(); i++) {
			if (capitalVowels.contains(password.charAt(i))) {
				count++;
			}
		}
		if (count >= 2) {
			return true;
		}
		return false;
	}
	
	public static boolean bypassRules(ArrayList<String> passwordStorage,String password){
		if (password.equals("admin")) {
			if (!passwordStorage.contains("admin")) {
				return true;
			}
		}
		if (password.equals("mod")) {
			if (!passwordStorage.contains("mod")) {
				return true;
			}
		}
		return false;
	}
}
