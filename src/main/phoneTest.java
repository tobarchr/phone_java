package main;

public class phoneTest {

	public static void main(String[] args) {

		galaxy S9 = new galaxy("S9",99,"Verizon","Ring...Ring...Ring...");
		iphone iphoneX = new iphone("X", 199,"Mint", "Apple all");
		
		S9.displayInfo();
		S9.ring();
		S9.unlock();
		
		iphoneX.displayInfo();
		iphoneX.ring();
		iphoneX.unlock();
	}

}
