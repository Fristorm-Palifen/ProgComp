package TME2;

public abstract class Expr {
	protected final String name;
	public Expr(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
	
	public abstract int getval();
}
