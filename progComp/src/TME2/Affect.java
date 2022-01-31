package TME2;

public class Affect extends Instr{
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
	
	public void run() {
		slave.redefine(master);
	}
	
}
