package TME3_5;

public interface IVisiteurExpr<T> {
	T visite (Constant c);
	T visite (Bool b);
	T visite (Var v);
	T visite (Add a);
	T visite (Egale e);
}
