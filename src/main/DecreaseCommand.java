package main;

public class DecreaseCommand implements Command {

	Device device;
	
	public DecreaseCommand(Device device) {
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.decrease();
	}
	
}
