package main;

public class Main {

	public static void main(String[] args) {
		
		 Device light = new Light();
	        Device aircon = new Aircon();
	        Device musicPlayer = new MusicPlayer();

	        CentralHub hub = new CentralHub();

	        // Turn On devices
	        hub.setCommand(new TurnOnCommand(light));
	        hub.pressButton();

	        hub.setCommand(new TurnOnCommand(aircon));
	        hub.pressButton();

	        hub.setCommand(new TurnOnCommand(musicPlayer));
	        hub.pressButton();

	        System.out.println();

	        // Increase features
	        hub.setCommand(new IncreaseCommand(light));
	        hub.pressButton();

	        hub.setCommand(new IncreaseCommand(aircon));
	        hub.pressButton();

	        hub.setCommand(new IncreaseCommand(musicPlayer));
	        hub.pressButton();

	        System.out.println();

	        // Decrease features
	        hub.setCommand(new DecreaseCommand(light));
	        hub.pressButton();

	        hub.setCommand(new DecreaseCommand(aircon));
	        hub.pressButton();

	        hub.setCommand(new DecreaseCommand(musicPlayer));
	        hub.pressButton();

	        System.out.println();

	        // Turn Off devices
	        hub.setCommand(new TurnOffCommand(light));
	        hub.pressButton();

	        hub.setCommand(new TurnOffCommand(aircon));
	        hub.pressButton();

	        hub.setCommand(new TurnOffCommand(musicPlayer));
	        hub.pressButton();
	    }
	
	}


