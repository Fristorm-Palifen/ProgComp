package TME4.Ex2;

public class ErrException extends RuntimeException {
	private int n;
	
	public ErrException(int x) {
		super("fail. avec "+x);
		n = x;
	}
	
	protected ErrException(int x, String message) {
		super(message+x);
		n = x;
	}
	public int getN() {
		return n;
	}

}
