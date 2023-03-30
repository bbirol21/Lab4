package streaming;

import java.util.ArrayList;

import devices.*;
import media.*;

public class StreamingService {
	
	private ArrayList<Media> mediaList = new ArrayList<Media>();
	private ArrayList<User> userList = new ArrayList<User>();
	
	public StreamingService() {
		mediaList = new ArrayList<Media>();
        userList = new ArrayList<User>();
	}
	
	public void addMedia(Media m) {
		for (Media media : mediaList) {
	        if (media.getMedia_name().equals(m.getMedia_name())) {
	            System.out.println("Error: media with name " + m.getMedia_name() + " already exists.");
	            return;
	        }
	    }
		System.out.println("Media added to the Streaming Service");
	    mediaList.add(m);
	}
	
	
	public void addUser(User u) {
		for (User user : userList) {
	        if (user.getUsername().equals(u.getUsername())) {
	            System.out.println("Error: user with username " + u.getUsername() + " already exists.");
	            return;
	        }
	    }
		System.out.println("User added to the Streaming Service");
	    userList.add(u);
	}
	
	public void notifyAllUsers() {
		
		for (User user: userList) {
			for (Genre genre: user.getLikedGenres()) {
				for (Device device: user.getUsersDevices()) {
					for (Media media: mediaList) {
						if (media.getMedia_genre().equals(genre)) {
							System.out.print(device.notifyOwner(media));
						}
					}
				}
			}
		}
	}
}
