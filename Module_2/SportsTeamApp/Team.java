package SportsTeamApp;

public class Team {
	private String teamName;
	private String[] players = new String[20];
	private int playerCount = 0;
	
	Team(String teamName) {
		this.teamName = teamName;
	}
	
	public void addPlayer(String player) {
		players[playerCount] = player;
		playerCount++;
	}
	
	public String[] getPlayers() {
		return players;
	}
	
	public int getPlayerCount() {
		return playerCount;
	}
	
	public String getTeamName() {
		return teamName;
	}
}
