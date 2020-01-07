package headfirst.designpatterns.flyweight;

import java.time.*;

public interface Tree {
	public void display(int x, int y);
	public default boolean isWithinRange(LocalDate aDate) {
		Month month = aDate.getMonth();
		return (month.getValue() > 2) && (month.getValue() < 11);
	}
}