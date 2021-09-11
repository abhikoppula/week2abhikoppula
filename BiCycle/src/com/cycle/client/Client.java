package com.cycle.client;

import com.cycle.AbstractFactory.CycleFactory;
import com.cycle.AbstractFactory.ElectricCycleFactory;
import com.cycle.AbstractFactory.RoadCycleFactory;
import com.cycle.beans.Cycle;

public class Client {
	
	
	public static void main(String[] args) {
		
		Cycle roadCycle = CycleFactory.createCycle(new RoadCycleFactory("Classic Bell", "3600 ah", 4));
		
		Cycle electricCycle = CycleFactory.createCycle(new ElectricCycleFactory("Air Horn", "5000 ah", 7));
		
		System.out.println("Road Cycle Object ===>"+roadCycle);
		System.out.println("Electric Cycle Object ===>"+electricCycle);
	}

}
