package main;

public class iphone extends phone implements Ringable {
    public iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public void ring() {
	       System.out.println("Ringing this iphone louder than anything");
	       }
    @Override
    public void unlock() {
	       System.out.println("Unlocking this nice Iphone");
    }
    @Override
    public void displayInfo() {
	       System.out.println("The battery level is" + this.getBatteryPercentage());
    }
}


