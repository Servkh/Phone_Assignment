package com.dojo.Phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	 return ("Galaxy" +" " +this.getVersionNumber() + " " +  "says" + " " + this.getRingTone());
    }
    @Override
    public String unlock() {
    	return ("Galaxy" + " " + this.getVersionNumber() + " " + "Unlocking via Finger print and pass code");
    }
    @Override
    public void displayInfo() {
    	System.out.println("Galaxy" + " " + this.getVersionNumber() + " from " + this.getCarrier()); 
    	System.out.println("Galaxy" + " " + this.getVersionNumber() +" " +"Battery Percentage" + " is " + this.getBatteryPercentage());
//    	System.out.println("Version:" + "  " + this.getVersionNumber());
    	
    }
}
