package devices;

import streaming.*;
import media.*;

public class Device {
	
	private int ID;
	private User user;
	private static int uniqueIdCounter = 0;
	//degistirilemez
	
	public Device(User user) {
		this.user = user;
		user.getUsersDevices().add(this);
		ID = uniqueIdCounter;
		uniqueIdCounter++;
	}

	public int getId() {
		return ID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getUniqueIdCounter() {
		return uniqueIdCounter;
	}

	public void setUniqueIdCounter(int uniqueIdCounter) {
		this.uniqueIdCounter = uniqueIdCounter;
	}
	
	public String notifyOwner(Media m) {
		String notif = "Hi " + user.getUsername() + "\n" + m.generateNotification();
		return notif;
	}
}
