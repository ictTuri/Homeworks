
public class Test {
	public static void main(String[] args) {
		
		Coin c1 = new Coin();
		
		System.out.println("flip result "+c1.flip());
		System.out.println("flip result "+c1.flip());
		System.out.println("flip result "+c1.flip());
		System.out.println("flip result "+c1.flip());
		System.out.println("total flip for "+c1+" = "+c1.totalNumbersOfFlipForThisCoin());
		
		Coin c2 = new Coin();
		
		System.out.println("flip result "+c2.flip());
		System.out.println("flip result "+c2.flip());
		System.out.println("flip result "+c2.flip());
		System.out.println("total flip for "+c2+" = "+c2.totalNumbersOfFlipForThisCoin());
		Coin.totalNumberOfFlipsForAllCoins();
	}
	
	
}
