package streaming;

public class FreeUser extends User{

	public FreeUser(String username) {
		super(username);
		// TODO Auto-generated constructor stub
	}

	public String postNotificationText(int notificationCount) {
		return super.postNotificationText(notificationCount);
	}
	
}
