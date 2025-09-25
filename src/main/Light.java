package main;

public class Light implements Device {
	
	@Override
	public void turnOn() {
		System.out.println("Light is ON");
	}
	@Override
	public void turnOff() {
		System.out.println("Light is OFF");
	}
	@Override
	public void increase() {
		System.out.println("Brightness Increased");
	}
	@Override
	public void decrease() {
		System.out.println("Brightness Decreased");
	}
}
