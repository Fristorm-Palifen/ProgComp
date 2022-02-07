package TME3_5;

public class Bool extends Type{

	public Bool(String name) {
		super(name);
		if ((!name.equals("True")||(!name.equals("False")))) {
			throw new IllegalArgumentException("Not True or False");
		}
	}

	@Override
	public int getval() {
		if (name.equals("True")) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public <T> T accepte(IVisiteurExpr<T> v) {
		// TODO Auto-generated method stub
		return v.visite(this);
	}
}
