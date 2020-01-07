package headfirst.designpatterns.flyweight;

public class TreeFactory {
	Tree d, c = null;
	public TreeFactory() {
		this.d = new DeciduousTree();
		this.c = new ConiferTree();
	}
	public Tree getTree(String type) throws Exception {
		if (type.equals("deciduous")) {
			return this.d;
		} else if (type.equals("conifer")) {
			return this.c;
		} else {
			throw new Exception("Invalid kind of tree");
		}
	}
}