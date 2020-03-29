/*public class Ten{
    public static void main(String[] args){
        int num = 100;
        while(num<=200){
            if(num%3!=0){
                num++;
                continue;
            }
        System.out.println("找到了3的倍数，为，"+num);
        num++;
        }
    }
}*/




/*public class Ten{
    public static void main(String[] args){
        for(int i = 1;i<=10;i++){
            System.out.println(i);
        }
    }
}*/




/*public class Ten{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i<=100;i++){
            sum+=i;
        }
    System.out.println("sum = "+sum);
    }
}*/




/*public class Ten{
    public static void main(String[] args){
        int ret = 1;
        for(int i = 1;i<=5;i++){
            ret*=i;
        }
        System.out.println("ret="+ret);
    }
}*/




/*public class Ten{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i<=5;i++){
            int tmp = 1;
            for(int j = 1;j<=i;j++){
                tmp*=j;
            }
            sum+=tmp;
        }
        System.out.println("sum = "+sum);
    }
}*/




/*public class Ten{
    public static void main(String[] args){
        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num<=10);
    }
}*/




/*public class Ten{
    public static void main(String[] args){
        System.out.print("Enter a char");
        char i = (char) System.in.read();
        System.out.println("your char is:"+i);
    }
}*/



/*public class Ten{
    public static void main(String[] args){
        System.out.println("请输入一个字符");
        try{
            char c = (char) System.in.read();
            System.out.println(c);
        }catch(Exception e){
            System.out.println("出错了");
        }
    }
}*/



/*import java.util.Scanner;

public class Ten{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        int i = scanner.nextInt();
        System.out.println("请输入小数");
        double b = scanner.nextDouble();
        System.out.println(i);
        System.out.println(b);
    }
}*/




/*import java.util.Scanner;

public class Ten{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的年龄：");
        int age = scanner.nextInt();
        System.out.println("请输入你的工资：");
        float salary = scanner.nextFloat();
        System.out.println("你的信息如下：");
        System.out.println("姓名："+name+" \n"+"年龄："+age+"\n"+"工资："+salary);

    }
}*/