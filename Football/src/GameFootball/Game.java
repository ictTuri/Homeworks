package GameFootball;

public class Game {
	private String referee,place;
	public String getReferee() {
		return referee;
	}
	public void setReferee(String referee) {
		this.referee = referee;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Game(String referee, String place) {
		super();
		this.referee = referee;
		this.place = place;
	}
	
}
