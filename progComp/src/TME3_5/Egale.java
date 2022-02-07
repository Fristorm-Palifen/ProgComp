package TME3_5;

public class Egale extends OP{

	public Egale() {
		super("=");
		}
	public Egale(Expr gauche,Expr droit) {
		super("=");
		this.gauche=gauche;
		this.droit=droit;
	}

	@Override
	public int getval() {
		if ((gauche instanceof Bool)&&(!(droit instanceof Bool))) {
			throw new OPException("Bool+val Interdit");
		}else if ((droit instanceof Bool)&&(!(gauche instanceof Bool))) {
			throw new OPException("Bool+val Interdit");
		}
		if (droit.getval()==gauche.getval()) {
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
