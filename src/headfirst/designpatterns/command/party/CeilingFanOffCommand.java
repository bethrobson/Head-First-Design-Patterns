package headfirst.designpatterns.command.party;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}
	public void undo() {
		switch (prevSpeed) {
			case CeilingFan.HIGH: 	ceilingFan.high(); break;
			case CeilingFan.MEDIUM: ceilingFan.medium(); break;
			case CeilingFan.LOW: 	ceilingFan.low(); break;
			default: 				ceilingFan.off(); break;
		}
	}
}
