package TME3_5;

import java.util.HashMap;
import java.util.Map;

public class Var extends Type{
	private static Map<String,Expr> ENV = new HashMap<>();
	private Expr ex;

	public Var(String name, Expr ex) {
		super(name);
		this.ex=ex;
		ENV.put(name, ex);
	}

	@Override
	public int getval() {
		return ex.getval();
	}
	
	public void redefine(Expr ex) {
		this.ex=ex;
	}

	@Override
	public <T> T accepte(IVisiteurExpr<T> v) {
		// TODO Auto-generated method stub
		return v.visite(this);
	}

}
