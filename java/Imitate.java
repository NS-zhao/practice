/*import java.util.Scanner;

public class Imitate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            int ret = getNumBinCount(num);
            System.out.println("num为"+num+",其二进制中1的个数为："+getNumBinCount(num));
            System.out.println("请输入一个数字");
        }

    }

    public static int getNumBinCount(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
}*/




/*import java.util.Scanner;
import java.util.Random;

public class Imitate{
    public static void main(String[] args){
        Random random = new Random();
        int guess = random.nextInt(100);
        System.out.println(guess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("please type a number");
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            if(num<guess){
                System.out.println("small");
            }else if(num>guess){
                System.out.println("big");
            }else{
                System.out.println("right");
                break;
            }
            System.out.println("please type a number");
        }
    }
}*/




/*public class Imitate{
    public static void main(String[] args){
        int n = 5;
        int ret = factor(5);
        System.out.println("ret为"+ret);

    }

    public static int factor(int n){
        if(n == 1){
            return 1;
        }
        return n*factor(n-1);
    }
}*/



/*public class Imitate{
    public static void main(String[] args){
        int n = 5;
        int ret = factor(5);
        System.out.println("ret为"+ret);

    }

    public static int factor(int n){
        System.out.println("函数开始，n = "+n);
        if(n == 1){
             System.out.println("函数结束，n = 1，ret = 1");
            return 1;
        }
        int ret = n*factor(n-1);
        System.out.println("函数结束，n = "+n+", ret = "+ret);
        return ret;
    }
}*/