/*public class Hint{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i<=5;i++){
            int tmp = 1;
            for(int j = 1;j<=i;j++){
                
                tmp*=j;

            }
            sum+=tmp;
        }
        System.out.println("sum="+sum);
    }
}*/




/*public class Hint{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int ret = add(a,b);
        System.out.println("ret = "+ret);
    }

    public static int add(int x,int y){
        return x+y;
    }
}*/



/*public class Hint{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int ret = add(a,b);
        test();
        System.out.println("ret = "+ret);
    }

    public static int add(int x,int y){
        return x+y;
    }

    public static void test(){
        System.out.println("hello world");
    }
}*/



/*public class Hint{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("1.方法开始执行......");
        int ret = add(a,b);
        System.out.println("3.ret为："+ret);
        System.out.println("1.方法开始执行......");
        ret = add(20,30);
        System.out.println("3.ret为："+ret);
    }

    public static int add(int x,int y){
        System.out.println("2.方法执行中......x="+x+",y="+y);
        return x+y;
    }
}*/




/*public class Hint{
    public static void main(String[] args){
        long sum = 0;
        for(int i = 1;i<=5;i++){
            long tmp = jieCheng(i);
            sum+=tmp;
        }
        System.out.println(sum);
    }

    public static long jieCheng(int n){
        long sum = 1L;
        for(int i = 1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
}*/



/*public class Hint{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i<=5;i++){
            sum += factor(i);
        }
        System.out.println(sum);
    }

    public static int factor(int n){
        System.out.println("计算n的阶乘！n = "+n);
        int ret = 1;
        for(int i = 1;i<=n;i++){
            ret*=i;
        }
        return ret;
    }
}*/



/*public class Hint{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println("a = "+a+",b = "+b);
    }

    public static void swap(int x,int y){
        int tmp = x;
        x = y;
        y = tmp;
    }
}*/



public class Hint{
    public static void main(String[] args){
        int[] num = new int[] {10,20};
        swap(num);
        System.out.println("num[0] = "+num[0]+",num[1] = "+num[1]);
    }

    public static void swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}