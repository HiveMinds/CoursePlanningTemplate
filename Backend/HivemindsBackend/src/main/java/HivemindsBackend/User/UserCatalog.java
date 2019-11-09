package HivemindsBackend.User;

import java.util.ArrayList;

/**
 * Represents an ArrayList of user educations.
 * 
 * @author a
 *
 */
public class UserCatalog {
	private ArrayList<User> userCatalog;

	public UserCatalog() {
		userCatalog = new ArrayList<User>();
	}

	public ArrayList<User> getUserCatalog() {
		return userCatalog;
	}

	public void setUserCatalog(ArrayList<User> userCatalog) {
		this.userCatalog = userCatalog;
	}
}
