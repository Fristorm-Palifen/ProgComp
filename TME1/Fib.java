package TME1;

public class Fib {
	public static int fibo(int val){
        if (val<=0){
            throw new IllegalArgumentException("Valeur de val <0");
        }
        if ((val==1)||(val==2)){
            return 1;
        }
        int v1=1,v2=1;
        int res=1;
        for (int i=3;i<=val;i++){
            res=v1+v2;
            v1=v2;
            v2=res;
        }
        return res;
    }
    public static void main (String[] args){
        int val=Integer.parseInt(args[0]);
        System.out.println(Fib.fibo(val));
        return;
    }
}
