package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
private void transportForm() {
	// TODO Auto-generated method stub
System.out.println("transport form");
}
public static void main(String[] args) {
	Transport t = new Transport();
	t.transportForm();
	Road r = new Road();
	r.bike();
	r.bus();
	r.car();
	r.cycle();
	Air a = new Air();
	a.aeroPlane();
	a.heliCopter();
	Water w = new Water();
	w.boat();
	w.ship();
}

}
