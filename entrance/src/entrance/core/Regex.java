package entrance.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static boolean isEmail(String email) {

		Pattern pattern = Pattern.compile("@");
		Matcher matcher = pattern.matcher(email);

		return matcher.find();
	}
}
