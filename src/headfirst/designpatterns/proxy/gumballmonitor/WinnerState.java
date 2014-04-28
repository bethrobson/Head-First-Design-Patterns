package headfirst.designpatterns.proxy.gumballmonitor;

public class WinnerState implements State {
	private static final long serialVersionUID = 2L;
    GumballMachine gumballMachine;
 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}
 
	public void ejectQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}
 
	public void turnCrank() {
		System.out.println("Turning again doesn't get you another gumball!");
	}
 
	public void dispense() {
		System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
		try {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() == 0) {
				gumballMachine.setState(gumballMachine.getSoldOutState());
			} else {
				gumballMachine.releaseBall();
				if (gumballMachine.getCount() > 0) {
					gumballMachine.setState(gumballMachine.getNoQuarterState());
				} else {
           		 	System.out.println("Oops, out of gumballs!");
					gumballMachine.setState(gumballMachine.getSoldOutState());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}
}
