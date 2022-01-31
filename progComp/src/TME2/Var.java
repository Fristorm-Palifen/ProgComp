package TME2;

public class Var extends Type{
	private Expr ex;

	public Var(String name, Expr ex) {
		super(name);
		this.ex=ex;
	}

	@Override
	public int getval() {
		return ex.getval();
	}
	
	public void redefine(Expr ex) {
		this.ex=ex;
	}

}
