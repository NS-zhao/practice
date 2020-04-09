package ideal;

public class Frog {
    public static void main(String[] args) {
        for (int i = 1; i < 10 ; i++) {
            System.out.print(forgJump(i)+" ");
        }
    }

    public static int forgJump(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return forgJump(n-1)+forgJump(n-2);

    }
}
