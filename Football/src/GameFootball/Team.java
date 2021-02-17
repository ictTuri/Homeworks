package GameFootball;

public class Team {
	
	enum Teams{
		BAYERN("Hans, Costa, Cuisance, Richards, Thiago, Franck, Bastian, Arjen, Niko, Matias, George"),
		BARCELONA("Messi, Griezmann, Ansu, Pedri, Philippe, Dest, Martin, Jong, Rique, Oscar, Sergio"),
		REAL_MADRID("Ramez, Eden, Karim, Junior, Marcelo, Rodrygo, Isco, Modriq, Christiano, Casemiro, Varane"),
		MILAN("Zlatan, Hakan, Jens, Ante, Gianluigi, Theo, Sandro, Diogo, Simon, Pierre, Ismael");
		private String teamMembers;
		Teams(String teamMembers){
			this.teamMembers=teamMembers;
		}
		public String getTeamMembers() {
			return this.teamMembers;
		}
	}
	
	
	
	//Declaration of the coach of type Coach
	private Coach coach;
	Team(){}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	
}
