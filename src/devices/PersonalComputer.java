package devices;

import streaming.*;
import media.*;

public class PersonalComputer extends Device {

	public PersonalComputer(User user) {
		super(user);
		// TODO Auto-generated constructor stub
	}
	
	public String notifyOwner(Media m) {
		return super.notifyOwner(m) + "\n" + "Watch it now from"
				+ " your PersonalComputer with the id "+ super.getId() +  "\n" + "\n" + "\n";
	}
	
}