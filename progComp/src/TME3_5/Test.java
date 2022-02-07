package TME3_5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var n = new Var("n", new Constant("n",5));
		Var y = new Var("y", new Constant("y",1));
		Var z = new Var("z", new Constant("z",1));
		
		Instr l1 = new Affect(new Add(y,new Constant("1", 1)), y);
		Instr l2 = new Affect(new Add(z, y),z);
		
		Egale eInterne = new Egale(y,n);
		
		
		(new Egale(eInterne,new Constant("False", 0)).getval() == 1);
		
		While w = new While();
	}

}
