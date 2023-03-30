package media;

public class Series extends Media {
	
	private String network_name;
	private int duration_seasons;
	private int duration_episodes;
	
	public Series(String name, int year, Genre genre, String network_name, int duration_seasons, int duration_episodes) {
		super(name, year, genre);
		this.duration_seasons = duration_seasons;
		this.duration_episodes = duration_episodes;
		// TODO Auto-generated constructor stub
	}

	public String getNetwork_name() {
		return network_name;
	}

	public void setNetwork_name(String network_name) {
		this.network_name = network_name;
	}

	public int getDuration_seasons() {
		return duration_seasons;
	}

	public void setDuration_seasons(int duration_seasons) {
		this.duration_seasons = duration_seasons;
	}

	public int getDuration_episodes() {
		return duration_episodes;
	}

	public void setDuration_episodes(int duration_episodes) {
		this.duration_episodes = duration_episodes;
	}
	
	@Override
	public String toString() {
		return "Series Information: " + "\n" + super.toString() + "\n" + "Network: " + 
				network_name + "\n" + "Duration: " + duration_seasons + " seasons and " +  duration_episodes + " episodes";
	}
	
	public String generateNotification() {
		String notification =  super.generateNotification() + "series is ready to watch." + "\n" + "We thought you might like it."+ "\n" + toString();
		return notification;
	}
	
}
