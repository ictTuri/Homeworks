
public class Coin {
	//--------------------------------------
	//Variables declaration
	//--------------------------------------
	static int heads=0;
	static int tails=1;
    int face;
    private int counter = 0;
    static int allCounter = 0;
    //--------------------------------------
  	//Flip Method
  	//--------------------------------------		
	public int flip() {
		this.face = (int)(Math.random()*2);
		if(this.face==0) {
			counter++;
			allCounter++;
			return heads;	
		}else {
			counter++;
			allCounter++;
			return tails;	
		}	
	}
	//--------------------------------------
	//method to count each coin flip
	//--------------------------------------
	public  int totalNumbersOfFlipForThisCoin() {
		return counter;
	}
	//--------------------------------------
	//method to count all coin flip function
	//--------------------------------------
	public static void totalNumberOfFlipsForAllCoins() {	
		System.out.println("Total Coin flip counter = "+allCounter);
	}
}
