package headfirst.designpatterns.bridge.remote;

public class Sony extends TV {
	int station = 0;
	public void on() {
		System.out.println("Turning on the Sony TV");
	}
	public void off() {
		System.out.println("Turning off the Sony TV");
	}
	public void tuneChannel(int channel) {
		this.station = channel;
		System.out.println("Set the Sony TV station to " + this.station);
	}
	public int getChannel() {
		return station;
	}
}