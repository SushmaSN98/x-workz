public class ColourTester{

public static void main(String[] names)
{
Colour[] allColours=Colour.values();
	System.out.println(allColours.length);
	//length will be +1 of index
	for(int coloursInitial=0;coloursInitial<allColours.length;coloursInitial++){
		System.out.println("index " + coloursInitial);
		Colour colourValue=allColours[coloursInitial];
		System.out.println("colour enum Value " + colourValue);
		
	}
	Bank[] allBanks=Bank.values();
	System.out.println(allBanks.length);
	for(int banksInitial=0;banksInitial<allBanks.length;banksInitial++)
	{
		System.out.println("index"+ banksInitial);
		Bank bankValue=allBanks[banksInitial];
		System.out.println("bank enum Value "+bankValue);
	}
	MobileBrand[] allMobileBrands=MobileBrand.values();
	System.out.println(allMobileBrands.length);
	for(int mobileBrands=0;mobileBrands<allMobileBrands.length;mobileBrands++)
	{
		System.out.println("index"+ mobileBrands);
		MobileBrand mobileBrandValue=allMobileBrands[mobileBrands];
		System.out.println("mobileBrand enum Value "+mobileBrandValue);
	}
	SimCard[] allSimCards=SimCard.values();
	System.out.println(allSimCards.length);
	for(int simCards=0;simCards<allSimCards.length;simCards++)
	{
		System.out.println("index"+ simCards);
		SimCard simCardValue=allSimCards[simCards];
		System.out.println("simCard enum Value "+simCardValue);
	}
	Theater[] allTheaters=Theater.values();
	System.out.println(allTheaters.length);
	for(int theaters=0;theaters<allTheaters.length;theaters++)
	{
		System.out.println("index"+ theaters);
		Theater theaterValue=allTheaters[theaters];
		System.out.println("theater enum Value "+theaterValue);
	}
	
	
}
}
