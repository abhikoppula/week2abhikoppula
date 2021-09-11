package com.cycle.AbstractFactory;

import com.cycle.beans.Cycle;
import com.cycle.beans.ElectricBicycle;

public class ElectricCycleFactory implements CycleAbstractFactory {

	private String bells;
	private String batteryAssistedPower;
	private int gear;
	
	
	
	public ElectricCycleFactory(String bells, String batteryAssistedPower, int gear) {
		super();
		this.bells = bells;
		this.batteryAssistedPower = batteryAssistedPower;
		this.gear = gear;
	}



	@Override
	public Cycle createCycle() {
		// TODO Auto-generated method stub
		return new ElectricBicycle(this.bells, this.batteryAssistedPower, this.gear);
	}

}
