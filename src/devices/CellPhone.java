package devices;

import streaming.*;
import media.*;

public class CellPhone extends Device {

	public CellPhone(User user) {
		super(user);
		// TODO Auto-generated constructor stub
	}
	
	public String notifyOwner(Media m) {
		return super.notifyOwner(m) + "\n" + "Watch it now from"
				+ " your CellPhone with the id "+ super.getId() + "\n" + "\n" + "\n";
	}
	
	
}
