package com.dojo.Phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return ("iPhone" + " " + this.getVersionNumber() + " " +  "says" + " " + this.getRingTone());
    }
    @Override
    public String unlock() {
    	return ("iPhone" + " " + this.getVersionNumber() + " " + "Unlocking via Facial recignition");
    }
    @Override
    public void displayInfo() {
    	System.out.println("******************************************************");
    	System.out.println("iPhone" + " " + this.getVersionNumber() + " from " + this.getCarrier()); 
    	System.out.println("iPhone" + " " + this.getVersionNumber() +" " +"Battery Percentage" + " is " + this.getBatteryPercentage());
//        System.out.println("Version:" + "  " + this.getVersionNumber());
    }
}
