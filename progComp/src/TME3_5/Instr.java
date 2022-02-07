package TME3_5;

public abstract class Instr  {
	private String name;
	
	public Instr(String name) {
		this.name = name;
	}
	public abstract void exec();
}
