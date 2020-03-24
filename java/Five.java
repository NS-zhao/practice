/*public class Five{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println(a&b);
    }
}*/



/*public class Five{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println(a|b);
    }
}*/




/*public class Five{
    public static void main(String[] args){
        int a = 10;
        //01010
        //10101---补码
        //10100---反码
        //11011---原码  -11
        System.out.println(~a);
    }
}*/




/*public class Five{
    public static void main(String[] args){
        int a = 0xf;
        //15:01111
        //   10000
        //   11111
        //   10000
        System.out.println(~a);
    }
}*/



/*public class Five{
    public static void main(String[] args){
        int a = 0xf;
        System.out.printf("%x\n",~a);
    }
}*/



/*public class Five{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        //a:001010
        //b:010100
        //  011110  
        System.out.println(a^b);
    }
}*/



/*public class Five{
    public static void main(String[] args){
        int a = 0x1;
        int b = 0x2;

        //001
        //010
        //011
        System.out.printf("%x\n",a^b);
    }
}*/



/*public class Five{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
}*/



/*public class Five{
    public static void main(String[] args){
        int a = 10;
        System.out.println(a>>1);
    }
}*/



/*public class Five{
    public static void main(String[] args){
        int a = 0x10;
        System.out.printf("%x\n",a<<1);
    }
}*/



/*public class Five{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int max = a>b?a:b;
        System.out.println(max);
    }
}*/



public class Five{
    public static void main(String[] args){
        System.out.println(1+2*3);
    }
}