package TME3_5;

public class VisiteurEval implements IVisiteurExpr<Integer> {

	@Override
	public Integer visite(Constant c) {
		// TODO Auto-generated method stub
		return c.getval();
	}

	@Override
	public Integer visite(Bool b) {
		// TODO Auto-generated method stub
		return b.getval();
	}

	@Override
	public Integer visite(Var v) {
		// TODO Auto-generated method stub
		return v.getval();
	}

	@Override
	public Integer visite(Add a) {
		// TODO Auto-generated method stub
		return a.getval();
	}

	@Override
	public Integer visite(Egale e) {
		// TODO Auto-generated method stub
		return e.getval();
	}

}
