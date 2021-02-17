package GameFootball;

import GameFootball.Team.Teams;

public class Test {
	
public static void main(String[] args) {
		Game newGame = new Game("Michael","Germany");
		Coach teamOneCoach = new Coach("Karrera");
		Coach teamTwoCoach = new Coach("Michael");
		
		System.out.println(" Game will be played in "+newGame.getPlace()+"\n Between "+Teams.BAYERN
				+ " with coach "+teamOneCoach.getName()+"\n And "+Teams.MILAN+" with coach "+teamTwoCoach.getName()+
				"\n Line up will be for "+Teams.BAYERN+":\n "+Teams.BAYERN.getTeamMembers()+"\n and "+Teams.MILAN+
				":\n "+Teams.MILAN.getTeamMembers());
		
		
		Game secondGame = new Game("Pjetri","Malsi te Madhe");
		Coach team1Coach = new Coach("Gjergji");
		Coach team2Coach = new Coach("Kastrioti");
		
		System.out.println("\n\n Game will be played in "+secondGame.getPlace()+"\n Between "+Teams.BARCELONA
				+ " with coach "+team1Coach.getName()+"\n And "+Teams.REAL_MADRID+" with coach "+team2Coach.getName()+
				"\n Line up will be for "+Teams.BARCELONA+":\n "+Teams.BARCELONA.getTeamMembers()+"\n and "+Teams.REAL_MADRID+
				":\n "+Teams.REAL_MADRID.getTeamMembers());
	}
}
