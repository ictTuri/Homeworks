
public class Test {
	public static void main(String[] args) {
		
		Coin c1 = new Coin();
		
		System.out.println("flip result "+c1.flip());
		System.out.println("flip result "+c1.flip());
		System.out.println("flip result "+c1.flip());
		System.out.println("flip result "+c1.flip());
		
//		Duke qene se metoden totalNumbersOfFlipForThisCoin do e therrasim per objekte te
//		ndryshme duhet te kemi nje variabel qe mban numerimin jo static pasi vlera e tij do ndryshoje 
//		me objekte te ndryshme dhe rrjedhimisht metoda nuk do jete statike dhe kemi mundsi 
//		ta therrasim per cdo objekt qe krijojm
//		
		System.out.println("total flip for "+c1+" = "+c1.totalNumbersOfFlipForThisCoin());
		
		Coin c2 = new Coin();
		
		System.out.println("flip result "+c2.flip());
		System.out.println("flip result "+c2.flip());
		System.out.println("flip result "+c2.flip());
		System.out.println("total flip for "+c2+" = "+c2.totalNumbersOfFlipForThisCoin());
	
//		Per te aksesuar metoden totalNumberOfFlipsForAllCoins direkt nga klasa pa e therritur 
//		me objekt duhet ta krijojm si metode statike dhe kemi perdorur nje variabel static per te 
//		mbajtur numrimin e thirrjes se flip gjate ekzekutimit.
//		variablat static i aksesojme vetem ne metoda statike.
		Coin.totalNumberOfFlipsForAllCoins();
	}
	
	
}
