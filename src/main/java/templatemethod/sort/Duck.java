package templatemethod.sort;

public class Duck implements Comparable<Duck> {
	String name;
	int weight;
  
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
 
	@Override
	public String toString() {
		return name + " weighs " + weight;
	}
  
	public int compareTo(Duck object) {

		// this.weight > otherDuck.weight
		return Integer.compare(this.weight, object.weight);
	}
}
