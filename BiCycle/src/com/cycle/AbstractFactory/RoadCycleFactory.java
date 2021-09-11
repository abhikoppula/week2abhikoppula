package com.cycle.AbstractFactory;

import com.cycle.beans.Cycle;
import com.cycle.beans.RoadBiCycle;

public class RoadCycleFactory implements CycleAbstractFactory {
	private String bells;
	private String batteryAssistedPower;
	private int gear;
	
	
	
	public RoadCycleFactory(String bells, String batteryAssistedPower, int gear) {
		this.bells = bells;
		this.batteryAssistedPower = batteryAssistedPower;
		this.gear = gear;
	}
	
	
	@Override
	public Cycle createCycle() {
		// TODO Auto-generated method stub
		return new RoadBiCycle(this.bells, this.batteryAssistedPower, this.gear);
	}

}
