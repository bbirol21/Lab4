package streaming;

public class PremiumUser extends User {
	
	public PremiumUser(String username) {
		super(username);
		// TODO Auto-generated constructor stub
	}

	public String postNotificationText(int notificationCount) {
		return "There are " + notificationCount + " notifications";
	}

}
