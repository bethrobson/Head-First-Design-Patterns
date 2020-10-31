package headfirst.designpatterns.builder.vacation;

public class Tent extends Accommodation {
	int siteNumber;
	public Tent() {
		this.name = "Tent";
	}
	public Tent(String name) {
		this.name = name;
	}
	public void setSiteNumber(int n) {
		this.siteNumber = n;
	}
	public int getSiteNumber() {
		return this.siteNumber;
	}
	public String getLocation() {
		if (siteNumber == 0) return "";
		else return "Site number " + this.siteNumber;
	}
}