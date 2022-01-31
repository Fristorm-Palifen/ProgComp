package TME2;

public abstract class OP extends Expr{
	protected Expr droit;
	protected Expr gauche;

	public OP(String name) {
		super(name);
		
	}
	
	public void setGauche(Expr a) {
		this.gauche=a;
	}
	
	public void setDroit(Expr a) {
		this.droit=a;
	}
	
	@Override
	public String toString() {
		return gauche.toString()+" "+name+" "+droit.toString();
	}
}
