package TME3_5;

public abstract class Expr {
	protected final String name;
	public Expr(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
	
	public abstract int getval();
	public abstract <T> T accepte(IVisiteurExpr<T> v);
}
