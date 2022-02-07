package TME3_5;

import java.util.ArrayList;
import java.util.List;

public class While extends Instr {
	private Bool e;
	private List<Instr> s = new ArrayList<>();
	
	public While(Bool e) {
		super("while");
		this.e = e;
	}
	
	public void addInstr(Instr in) {
		s.add(in);
	}

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		while (e.getval() == 1) {
			for (Instr instr : s) {
				instr.exec();
			}
		}
	}

}
