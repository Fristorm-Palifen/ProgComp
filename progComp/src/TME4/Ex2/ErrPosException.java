package TME4.Ex2;

public class ErrPosException extends ErrException {

	public ErrPosException(int x) {
		super(x, "fail. avec entier positif : ");
	}

}
