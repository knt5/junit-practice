package api.utils;

/**
 * Login/Logout util mock
 */
public class AuthUtil {
	public static String login() {
		return "xxxxx-session-id-xxxxx";
	}
	
	public static boolean logout(String sessionId) {
		return true;
	}
}
