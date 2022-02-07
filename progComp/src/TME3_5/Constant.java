package TME3_5;

public class Constant extends Type {
	private final int val;

	public Constant(String name, int val) {
		super(name);
		this.val=val;
	}

	@Override
	public int getval() {
		return val;
	}
	
	@Override
	public <T> T accepte(IVisiteurExpr<T> v) {
		// TODO Auto-generated method stub
		return v.visite(this);
	}
	
}
