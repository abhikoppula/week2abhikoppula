package com.cycle.beans;

public class RoadBiCycle implements Cycle {
   
	private String bells;
	private String batteryAssistedPower;
	private int gear;
	
	
	
	public RoadBiCycle(String bells, String batteryAssistedPower, int gear) {
		this.bells = bells;
		this.batteryAssistedPower = batteryAssistedPower;
		this.gear = gear;
	}

	@Override
	public String getBells() {
		// TODO Auto-generated method stub
		return this.bells;
	}

	@Override
	public String getBatteryAssistedPower() {
		// TODO Auto-generated method stub
		return this.batteryAssistedPower;
	}

	@Override
	public int getGear() {
		// TODO Auto-generated method stub
		return this.gear;
	}

	@Override
	public String toString() {
		return "RoadBiCycle [bells=" + bells + ", batteryAssistedPower=" + batteryAssistedPower + ", gear=" + gear
				+ "]";
	}

}
