import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PasswordsUnitTesting {
	
	@Test
	void addPasswordTest1() {
		// checks to see if adding password changes the arraylist
		ArrayList<String> passwordStorage = new ArrayList<String>();
		int expected = 1;
		if (PasswordUnitTest.containsPassword(passwordStorage,"APPLE")) {
			passwordStorage.add("APPLE");
		}
		int actual = passwordStorage.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void addPasswordTest2() {
		// checks to see if adding a password results in true
		ArrayList<String> passwordStorage = new ArrayList<String>();
		boolean expected = true;
		boolean actual = PasswordUnitTest.containsPassword(passwordStorage,"apple");
		assertEquals(expected,actual);
	}
	
	
	@Test
	void addPasswordTest3() {
		// checks to see if the length being less than 7 does not add the password to the arraylist
		ArrayList<String> passwordStorage = new ArrayList<String>();
		int expected = 0;
		if (PasswordUnitTest.checksLength("apple")) {
			passwordStorage.add("apple");
		}
		int actual = passwordStorage.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void addPasswordTest4() {
		// checks to see if check length method returns false
		boolean expected = false;
		boolean actual = PasswordUnitTest.addPassword("apple");
		assertEquals(expected,actual);
	}
	
	@Test
	void addPasswordTest5() {
		// checks to see if the password containing 6 doesn't add to the arraylist
		ArrayList<String> passwordStorage = new ArrayList<String>();
		int expected = 0;
		if (PasswordUnitTest.oneNumberNoSix("apple6")) {
			passwordStorage.add("apple6");
		}
		int actual = passwordStorage.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void addPasswordTest6() {
		// checks to see if the password containing a number adds to the arraylist
		ArrayList<String> passwordStorage = new ArrayList<String>();
		int expected = 1;
		if (PasswordUnitTest.oneNumberNoSix("apple3")) {
			passwordStorage.add("apple3");
		}
		int actual = passwordStorage.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void addPasswordTest7() {
		// checks to see if check length method returns true
		boolean expected = true;
		boolean actual = PasswordUnitTest.oneNumberNoSix("apple7");
		assertEquals(expected,actual);
	}
	
	@Test
	void addPasswordTest8() {
		// checks to see if the password containing a space doesn't add to the arraylist
		ArrayList<String> passwordStorage = new ArrayList<String>();
		int expected = 0;
		if (PasswordUnitTest.noSpaces("ap ple")) {
			passwordStorage.add("ap ple");
		}
		int actual = passwordStorage.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void addPasswordTest9() {
		// checks to see if no spaces method returns false
		boolean expected = false;
		boolean actual = PasswordUnitTest.oneNumberNoSix("appl e");
		assertEquals(expected,actual);
	}
	
	@Test
	void addPasswordTest10() {
		// checks to see if the password contains two capital vowles gets added to the arraylist
		ArrayList<String> passwordStorage = new ArrayList<String>();
		int expected = 1;
		if (PasswordUnitTest.twoCapitalVowels("BOOK")) {
			passwordStorage.add("BOOK");
		}
		int actual = passwordStorage.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void addPasswordTest11() {
		// checks to see if two capital vowels method returns true
		boolean expected = true;
		boolean actual = PasswordUnitTest.twoCapitalVowels("ApplE");
		assertEquals(expected,actual);
	}
	
	@Test
	void addPasswordTest12() {
		// checks to see if the password contains mod and gets added to the arraylist
		ArrayList<String> passwordStorage = new ArrayList<String>();
		int expected = 1;
		if (PasswordUnitTest.bypassRules(passwordStorage,"mod")) {
			passwordStorage.add("admin");
		}
		int actual = passwordStorage.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void addPasswordTest13() {
		// checks to see if two bypass method returns false
		ArrayList<String> passwordStorage = new ArrayList<String>();
		passwordStorage.add("admin");
		boolean expected = false;
		boolean actual = PasswordUnitTest.bypassRules(passwordStorage,"admin");
		assertEquals(expected,actual);
	}

}
