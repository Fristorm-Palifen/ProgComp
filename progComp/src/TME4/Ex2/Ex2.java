package TME4.Ex2;

public class Ex2 {
	
	public static int f(int x) throws ErrException {
		if (x > 0) {
			throw new ErrPosException(x);
		} else {
			throw new ErrNegException(x);
		}
	}
	
	public static int g(int x) {
		return f(x) * f(-2*x);
	}
	
	public static int h(int x, int y) {
		try {
			int tmp= f(x) * f(y);
			return tmp;
		} catch (ErrException e) {
			return x;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Failure incoming : ");
		try {
			int tmp = g(-1);
		} catch (ErrException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("h(1, -2) = "+h(1,-2));
	}

}
