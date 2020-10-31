package headfirst.designpatterns.bridge.remote;

public class LG extends TV {
	int channel = 1;
	public void on() {
		System.out.println("Turning on the LG TV");
	}
	public void off() {
		System.out.println("Turning off the LG TV");
	}
	public void tuneChannel(int channel) {
		this.channel = channel;
		System.out.println("Set the LG TV Channel to " + this.channel);
	}
	public int getChannel() {
		return channel;
	}
}