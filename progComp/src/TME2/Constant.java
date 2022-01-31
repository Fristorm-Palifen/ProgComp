package TME2;

public class Constant extends Type {
	private final int val;

	public Constant(String name, int val) {
		super(name);
		this.val=val;
	}

	@Override
	public int getval() {
		return val;
	}
	
}
