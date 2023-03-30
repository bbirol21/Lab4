package streaming;

import media.*;
import streaming.StreamingService;
import streaming.User;
import devices.*;

public class Main {
	public static void main(String[] args) {
		
		StreamingService stream = new StreamingService();
		
		User us1 = new User("canK");
		User us2 = new User("doganS");
		User us3 = new User("vahidehH");
		User us4 = new User("canK");
		
		us1.likeGenre(Genre.SCIFI);
		us1.likeGenre(Genre.ROMANCE);
		
		us2.likeGenre(Genre.HORROR);
		us2.likeGenre(Genre.COMEDY);
		
		us3.likeGenre(Genre.FANTASY);
		us3.likeGenre(Genre.ACTION);
		
		us2.unlikeGenre(Genre.HORROR);
		us3.unlikeGenre(Genre.ACTION);
		
		us2.likeGenre(Genre.ACTION);
		us3.likeGenre(Genre.HORROR);

		CellPhone cp1 = new CellPhone(us1);
		CellPhone cp2 = new CellPhone(us2);
		CellPhone cp3 = new CellPhone(us3);

		PersonalComputer pc1 = new PersonalComputer(us1);
		PersonalComputer pc2 = new PersonalComputer(us2);
		PersonalComputer pc3 = new PersonalComputer(us3);

		us1.removeDevice(pc1);
		us2.removeDevice(pc2);
		
		stream.addUser(us1);
		stream.addUser(us2);
		stream.addUser(us3);
		stream.addUser(us4);
		
		Movie mov1 = new Movie("Interstellar", 2014, Genre.SCIFI, "Christopher Nolan", 2, 49);
		Movie mov2 = new Movie("Lord of the Rings: Two Towers", 2002, Genre.FANTASY, "Peter Jackson", 2, 59);
		Movie mov3 = new Movie("Get Out", 2017, Genre.HORROR, "Jordan Peele", 1, 44);
		Movie mov4 = new Movie("Get Out", 2018, Genre.COMEDY, "Jordan Peele", 1, 54);
		Movie mov5 = new Movie("Meet the Parents", 2014, Genre.COMEDY, "Jay Roach", 1, 48);
		Movie mov6 = new Movie("The Notebook", 2004, Genre.ROMANCE, "Nick Cassavetes", 2, 3);
		
		Series ser1 = new Series("Succession", 2018, Genre.DRAMA, "HBO", 3, 30);
		Series ser2 = new Series("Friends", 1994, Genre.COMEDY, "NBC", 10, 234);
		Series ser3 = new Series("Reacher", 2022, Genre.ACTION, "HBO", 1, 8);

		stream.addMedia(mov1);
		stream.addMedia(mov2);
		stream.addMedia(mov3);
		stream.addMedia(mov4);
		stream.addMedia(mov5);
		stream.addMedia(mov6);

		stream.addMedia(ser1);
		stream.addMedia(ser2);
		stream.addMedia(ser3);
		
		stream.notifyAllUsers();
		//System.out.println(cp1.notifyOwner(mov6));
	}
}
