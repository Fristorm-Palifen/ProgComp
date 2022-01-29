public class Puissance {
	public static int algo1(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x*algo1(x,n-1);
	}
	
	private static int aux_algo1(int x, int n, int res) {
		if (n == 0) {
			return res;
		}
		return aux_algo1(x, n-1, res*x);
	}
	
	public static int algo1_term(int x, int n) {
		return aux_algo1(x, n, 1);
	}
	
	public static int algo2(int x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n%2 == 0) {
			return algo2(x*x,n/2);
		}
		return x*algo2(x*x,n/2);
	}
	
	//algo exponentiation rapide en récursion terminale...
	
	public static void main(String[] args) {
		System.out.println(algo1(2,8));
		System.out.println(algo1_term(2,8));
		System.out.println(algo2(2,8));
		//Pétage de pile d'exécution!!
		System.out.println(algo1(2,31)); //renvoie un résultat négatif...
		System.out.println(algo1(2,32)); //commence à renvoyer 0. On va dire qu'on a fait explosé la pile d'exec
		System.out.println(algo1_term(2,31)); //renvoie un résultat négatif...
		System.out.println(algo1_term(2,32)); //commence à renvoyer 0. On va dire qu'on a fait explosé la pile d'exec
		System.out.println(algo2(2,31));
		System.out.println(algo2(2,32)); //commence à renvoyer 0. On va dire qu'on a fait explosé la pile d'exec
	}
}
