package GameFootball;

public class Coach {	
	enum Strategies {
		SSM("sulm sulm dhe mbrojtje"),
		MMS("mbrojtje mbrojtje dhe sulm"),
		BKD("bjeri ku te dale");
		
		private String pershkrimi;		
		Strategies(String pershkrimi){
			this.pershkrimi=pershkrimi;
		}
		public String getPershkrimi() {
			return pershkrimi;
		}
	}
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	Coach(String name){
		this.name=name;
	}

}
