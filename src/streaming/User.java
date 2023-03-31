package streaming;

import java.util.ArrayList;
import media.*;
import devices.*;

public class User {
	
	private String username;
	private ArrayList<Genre> likedGenres = new ArrayList<Genre>();
	private ArrayList<Device> usersDevices = new ArrayList<Device>();
	
	public User(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public ArrayList<Genre> getLikedGenres() {
		return likedGenres;
	}
	
	public ArrayList<Device> getUsersDevices() {
		return usersDevices;
	}

	public void likeGenre(Genre g) {
		likedGenres.add(g);
	}
	
	public void unlikeGenre(Genre g) {
		likedGenres.remove(g);
	}
	
	public void removeDevice(Device d) {
		usersDevices.remove(d);
	}
	
	public String postNotificationText(int notificationCount) {
		String str = "New advertisement";
		return str;
	}
}