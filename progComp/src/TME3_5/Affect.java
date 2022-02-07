package TME3_5;

public class Affect extends Instr{
	//slave = master
	private Expr master;
	private Var slave;
	
	public Affect() {
		super("<-");
	}
	
	public Affect(Expr master, Var slave) {
		super("<-");
		this.master=master;
		this.slave=slave;
	}
	
	public void exec() {
		slave.redefine(master);
	}
	
}
