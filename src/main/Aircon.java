package main;

public class Aircon implements Device {

	@Override
	public void turnOn() {
		System.out.println("Aircon is ON");
	}

	@Override
	public void turnOff() {
		System.out.println("Aircon is OFF");

	}

	@Override
	public void increase() {
		System.out.println("Temperature Increased");

	}

	@Override
	public void decrease() {
		System.out.println("Temperature Decreased");
	}

}
