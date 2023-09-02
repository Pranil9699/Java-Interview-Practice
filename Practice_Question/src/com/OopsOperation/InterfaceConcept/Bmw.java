package com.OopsOperation.InterfaceConcept;

public class Bmw implements Car {

	@Override
	public void start() {
		System.out.println(" bmw -> start");
	}

	@Override
	public void stop() {
		System.out.println(" bmw -> stop");
	}

	@Override
	public void run() {
		System.out.println(" bmw -> run");
	}
	public void gear() {
		System.out.println(" bmw -> geat "+gear);
	}

}
