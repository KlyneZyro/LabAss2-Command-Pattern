package main;

public class IncreaseCommand implements Command{

	Device device;
	
	public IncreaseCommand(Device device) {
		this.device = device;
	}
	@Override
	public void execute() {
		device.increase();
	}
}
