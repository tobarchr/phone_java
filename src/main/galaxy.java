package main;

public class galaxy extends phone implements Ringable {
	public galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) 
	{
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
	
	@Override
	 public void ring() {
	       System.out.println("Pickup the phone");
	    }
	@Override
	    public void unlock() {
	       System.out.println("Unlocked the galaxy phone");
	    }
	
	@Override
	    public void displayInfo() {
	        // your code here            
	    }
}
