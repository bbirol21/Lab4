package media;

public class Media {
	
	protected String media_name;
	protected int media_year;
	protected Genre media_genre;
	
	public Media (String name, int year, Genre genre) {
		this.media_name = name;
		this.media_year = year;
		this.media_genre = genre;
	}
	
	public String getMedia_name() {
		return media_name;
	}

	public void setMedia_name(String media_name) {
		this.media_name = media_name;
	}

	public int getMedia_year() {
		return media_year;
	}

	public void setMedia_year(int media_year) {
		this.media_year = media_year;
	}

	public Genre getMedia_genre() {
		return media_genre;
	}

	public void setMedia_genre(Genre media_genre) {
		this.media_genre = media_genre;
	}

	@Override
	public String toString() {
		return "Name: " + media_name + "\n" + "Year: " + media_year + "\n" + "Genre: " + media_genre;
	}
	
	public String generateNotification() {
		return "A new " + media_genre + " ";
	}

	
}
