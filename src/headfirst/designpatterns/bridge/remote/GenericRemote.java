package headfirst.designpatterns.bridge.remote;

public class GenericRemote extends RemoteControl {
	public GenericRemote(TVFactory tvFactory) {
		super(tvFactory);
	}
	public void nextChannel() {
		int channel = this.getChannel();
		this.setChannel(channel+1);
	}
	public void prevChannel() {
		int channel = this.getChannel();
		this.setChannel(channel-1);
	}
}