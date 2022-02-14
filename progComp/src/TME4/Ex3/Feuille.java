package TME4.Ex3;

public class Feuille implements INode {
	private int val;
	
	public Feuille(int v) {
		val = v;
	}
	
	public int hauteur() {
		return 0;
	}

	@Override
	public boolean estComplet() {
		return true;
	}
}
