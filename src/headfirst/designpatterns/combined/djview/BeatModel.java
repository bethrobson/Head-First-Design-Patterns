package headfirst.designpatterns.combined.djview;

import javax.sound.midi.*;
import java.io.File;
import java.util.*;

public class BeatModel implements BeatModelInterface, MetaEventListener {
	Sequencer sequencer;
	List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	int bpm = 90;
	Sequence sequence;
	Track track;

	public void initialize() {
		setUpMidi();
	}

	public void on() {
		System.out.println("Starting the sequencer");
		setBPM(90);
		sequencer.start();
	}

	public void off() {
		sequencer.stop();
		setBPM(0);
	}

	public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(bpm);
		notifyBPMObservers();
	}

	public int getBPM() {
		return bpm;
	}

	void beatEvent() {
		notifyBeatObservers();
	}


	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	public void notifyBeatObservers() {
		for(int i = 0; i < beatObservers.size(); i++) {
			BeatObserver observer = (BeatObserver)beatObservers.get(i);
			observer.updateBeat();
		}
	}

	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}

	public void notifyBPMObservers() {
		for(int i = 0; i < bpmObservers.size(); i++) {
			BPMObserver observer = (BPMObserver)bpmObservers.get(i);
			observer.updateBPM();
		}
	}


	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}



	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}


	public void meta(MetaMessage message) {
		System.out.println(message.getType());
		if (message.getType() == 47) {
			beatEvent();
			sequencer.start();
			setBPM(getBPM());
		}
	}

	public void setUpMidi() {
		try {
			Synthesizer synth = MidiSystem.getSynthesizer();
			synth.loadAllInstruments(synth.getDefaultSoundbank());

			sequencer = MidiSystem.getSequencer();
			this.sequence = MidiSystem.getSequence(new File("test.mid"));
			sequencer.open();
			sequencer.setSequence(sequence);
			sequencer.setTempoFactor(1f);
			sequencer.addMetaEventListener(meta -> {
				if (meta.getType() == 47) { 
					sequencer.setTickPosition(0);
					sequencer.start();
				}
			});
			sequencer.setTempoInBPM(getBPM());
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 
}
