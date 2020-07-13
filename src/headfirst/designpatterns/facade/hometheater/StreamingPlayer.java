package headfirst.designpatterns.facade.hometheater;

public class StreamingPlayer {
	String description;
	int currentChapter;
	Amplifier amplifier;
	String movie;
	
	public StreamingPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}
 
	public void play(String movie) {
		this.movie = movie;
		currentChapter = 0;
		System.out.println(description + " playing \"" + movie + "\"");
	}

	public void play(int chapter) {
		if (movie == null) {
			System.out.println(description + " can't play chapter " + chapter + " no movie selected");
		} else {
			currentChapter = chapter;
			System.out.println(description + " playing chapter " + currentChapter + " of \"" + movie + "\"");
		}
	}

	public void stop() {
		currentChapter = 0;
		System.out.println(description + " stopped \"" + movie + "\"");
	}
 
	public void pause() {
		System.out.println(description + " paused \"" + movie + "\"");
	}

	public void setTwoChannelAudio() {
		System.out.println(description + " set two channel audio");
	}
 
	public void setSurroundAudio() {
		System.out.println(description + " set surround audio");
	}
 
	public String toString() {
		return description;
	}
}
