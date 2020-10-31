package headfirst.designpatterns.builder.vacation;

public class Hotel extends Accommodation {
	int roomNumber;
	public Hotel() {
		this.name = "Hotel";
	}
	public Hotel(String name) {
		this.name = name;
	}
	public void setRoomNumber(int n) {
		this.roomNumber = n;
	}
	public int getRoomNumber() {
		return this.roomNumber;
	}
	public String getLocation() {
		if (roomNumber == 0) return "";
		else return "Room number " + this.roomNumber;
	}
}