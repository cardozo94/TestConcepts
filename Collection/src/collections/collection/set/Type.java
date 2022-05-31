package collections.collection.set;

public class Type {

	private String name;
	
	public Type(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Type [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
