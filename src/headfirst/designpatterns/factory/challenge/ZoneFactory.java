package headfirst.designpatterns.factory.challenge;

public class ZoneFactory {
	public Zone createZone(String zoneId) {
		Zone zone = null;
		if (zoneId == "US/Pacific") {
			zone = new ZonePacific();
		}
		else if (zoneId == "US/Mountain") {
			zone = new ZoneMountain();
		}
		else if (zoneId == "US/Central") {
			zone = new ZoneCentral();
		}
		else if (zoneId == "US/Eastern") {
			zone = new ZoneEastern();
		}
		return zone;
	}
}