package com.cycle.AbstractFactory;

import com.cycle.beans.Cycle;

public class CycleFactory {
	
	public static Cycle createCycle(CycleAbstractFactory obj) {
		return obj.createCycle();
	}

}
