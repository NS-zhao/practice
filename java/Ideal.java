/*public class Ideal{
    public static void main(String[] args){
        int n = 10;
        int ret = sum(n);
        System.out.println(ret);

    }

    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n+sum(n-1);
    }
}*/



/*public class Ideal{
    public static void main(String[] args){
        int n = 1729;
        int ret = sum(n);
        System.out.println(ret);

    }

    public static int sum(int n){
        if(n<10){
            return n;
        }
        return n%10+sum(n/10);
    }
}*/



/*public class Ideal{
    public static void main(String[] args){
        int n = 123045;
        print(n);

    }

    public static void print(int n){
        if(n>9){
            print(n/10);
        }
        System.out.println(n%10);
    }
}*/



/*public class Ideal{
    public static void main(String[] args){
        int[] num = new int[]{1,2,3,4,5};
        System.out.println(num.length);
        System.out.println(num[0]);
        num[2] = 5;
        System.out.println(num[2]);
    }
}*/



/*public class Ideal{
    public static void main(String[] args){
        int[] num = new int[]{1,2,3,4,5};
        num[5] = 5;
        System.out.println(num[5]);
    }
}*/



/*public class Ideal{
    public static void main(String[] args){
        int[] num = new int[5];
        System.out.println(num[0]);
        System.out.println(num[4]);
        System.out.println(num.length);
    }
}*/



/*public class Ideal{
    public static void main(String[] args){
        double[] b = new double[3];
        System.out.println(b[0]);
        char[] c = new char[3];
        System.out.println(c[0]+"t");
        boolean[] d = new boolean[3];
        System.out.println(d[0]);
    }
}*/



/*public class Ideal{
    public static void main(String[] args){
        int[] num = new int[]{1,2,3,4,5};
        for(int i = 0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}*/




/*public class Ideal{
    public static void main(String[] args){
        int[] num = new int[]{1,2,3,4,5};
        for(int i:num){
            System.out.println(i);
        }
    }
}*/




public class Ideal{
    public static void main(String[] args){
        int[] num = new int[]{1,2,3,4,5};
        for(int i:num){
            if(i == 2){
                i =10;
            }
        }

        for(int i:num){
            System.out.println(i);
        }
    }
}