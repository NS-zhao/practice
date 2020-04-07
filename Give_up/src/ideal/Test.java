package ideal;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(fibo(i)+" ");
        }
    }
    public static int fibo(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        return fibo(n-1) +fibo(n-2);
    }
}
