package SportsTeamApp;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestSportsTeamApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Welcome to the Sports Team App");
			System.out.print("Enter a team name: ");
			String name = scanner.nextLine();
			System.out.println("Enter the player names:");
			System.out.print("   hint: use commas for multiple players; no spaces>: ");
			String playersInCsv = scanner.nextLine();
			String[] players = playersInCsv.split(",");
			
			// Create a team object with above details taken from Scanner
			Team team = new Team(name);
			for(int i = 0; i < players.length; i++) {
				team.addPlayer(players[i]);
			}
			
			// Print out the summary from the team object
			System.out.println("--Team Summary--");
			System.out.println("Number of players in team: " + team.getPlayerCount());
			String[] playersOnTeam = team.getPlayers();
			
			// Need to convert string array to comma separated string.
			String playersInCsvString = Arrays.stream(playersOnTeam)
	                .filter(element -> element != null)
	                .collect(Collectors.joining(","));
			System.out.println("Players on team: " + playersInCsvString);
			System.out.print("Continue? (y/n): ");
			String shouldContinue = scanner.nextLine();
			
			// If no, then immediately break from the loop.
			if (shouldContinue.equals("n")) {
				break;
			}			
		}
	}

}
