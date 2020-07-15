package webapp.login;

public class LoginService {
	public boolean isValid(String user, String password) {
		if(user.equals("Prat") && password.equals("1234")) {
			return true;
		}
		return false;
	}
}
