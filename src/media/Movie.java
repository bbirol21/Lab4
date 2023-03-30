package media;

public class Movie extends Media {
	
	private String director_name;
	private int duration_hours;
	private int duration_minutes;
	
	public Movie(String name, int year, Genre genre, String director_name, int duration_hours, int duration_minutes) {
		super(name, year, genre);
		this.director_name = director_name;
		this.duration_hours = duration_hours;
		this.duration_minutes = duration_minutes;
		// TODO Auto-generated constructor stub
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public int getDuration_hours() {
		return duration_hours;
	}

	public void setDuration_hours(int duration_hours) {
		this.duration_hours = duration_hours;
	}

	public int getDuration_minutes() {
		return duration_minutes;
	}

	public void setDuration_minutes(int duration_minutes) {
		this.duration_minutes = duration_minutes;
	}

	@Override
	public String toString() {
		return "Movie Information: " + "\n" + super.toString() + "\n" + "Director: " + 
				director_name + "\n" + "Duration: " + duration_hours + " hours and " +  duration_minutes + " minutes";
	}
	
	public String generateNotification() {
		String notification = super.generateNotification() + "movie is ready to watch." + "\n" + "We thought you might like it."+ "\n" + toString();
		return notification;
	}
	
}
