package TME4.Ex3;

public class Node implements INode {
	
	private INode fg,fd;
	private int val;
	
	public Node(INode gauche, INode droite, int val) {
		fg = gauche;
		fd = droite;
		this.val = val;
	}
	
	public boolean estComplet() {
		if (fg == null || fd == null) {
			return false;
		}
		return fg.estComplet() && fd.estComplet();
	}

	@Override
	public int hauteur() {
		if (estComplet()) {
			
		}
		return 0;
	}
	
}
