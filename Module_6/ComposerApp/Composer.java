package ComposerApp;

/**
 * Class representing Composer.
 */
public class Composer {
	private int id;
	private String name;
	private String genre;
	
	Composer(){
		this.id = 0;
		this.name ="";
		this.genre ="";
	}
	
	Composer(int id, String name, String genre){
		this.id=id;
		this.name=name;
		this.genre=genre;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String toString() {
		return "\n  ID: " + id + "\n  Name: " + name + "\n  Genre: " + genre + "\n";
	}
}