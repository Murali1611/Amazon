package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	private void vehicleNecessery() {
		System.out.println("Vehicles Necessary : Yes or No");
		System.out.println("Yes");
	}
	public static void main(String[] args) {
		Vehicle a = new Vehicle();
		a.vehicleNecessery(); 
		TwoWheller b = new TwoWheller();
		b.bike();
		b.cycle();
		ThreeWheeler c = new ThreeWheeler();
		c.auto();
		FourWheeler d = new FourWheeler();
		d.bus();
		d.car();
		d.lorry();
	}
}
