package TME2;

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
	

}
