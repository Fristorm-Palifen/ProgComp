package TME3_5;

public class Add extends OP {
	
	public Add() {
		super("+");
	}
	
	public Add(Expr gauche,Expr droit) {
		super("+");
		this.gauche=gauche;
		this.droit=droit;
	}

	@Override
	public int getval() throws OPException{
		// TODO Auto-generated method stub
		if ((gauche instanceof Bool)&&(!(droit instanceof Bool))) {
			throw new OPException("Bool+val Interdit");
		}else if ((droit instanceof Bool)&&(!(gauche instanceof Bool))) {
			throw new OPException("Bool+val Interdit");
		}else if ((droit instanceof Bool)&&((gauche instanceof Bool))) {
			return Math.max(droit.getval(), gauche.getval());
		}else {
			return gauche.getval()+droit.getval();
		}
	}
	
	@Override
	public <T> T accepte(IVisiteurExpr<T> v) {
		// TODO Auto-generated method stub
		return v.visite(this);
	}

}
