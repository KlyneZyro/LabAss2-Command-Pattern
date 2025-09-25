package main;

public class MusicPlayer implements Device {

	@Override
	public void turnOn() {
		System.out.println("Music Player is ON");

	}

	@Override
	public void turnOff() {
		System.out.println("Music Player is OFF");

	}

	@Override
	public void increase() {
		System.out.println("Volume Increased");

	}

	@Override
	public void decrease() {
		System.out.println("Volume Decreased");

	}

}
