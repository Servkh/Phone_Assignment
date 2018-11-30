package com.dojo.Phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return ("RingeTone:" + " " + this.getRingTone());
    }
    @Override
    public String unlock() {
        return ("Unlocking: Unclok with Face motion and pass code ");
    }
    @Override
    public void displayInfo() {
    	System.out.println("********************************");
        System.out.println("Carrier:" + "  " + this.getCarrier());
        System.out.println("Battery Percentage:" + "  " + this.getBatteryPercentage());
        System.out.println("Version:" + "  " + this.getVersionNumber());
    }
}