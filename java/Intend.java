import java.util.Scanner;

/*public class Intend{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        String name = null;
        if(sc.hasNext()){
            name = sc.next();
        }
        System.out.println("整数为"+a+",小数为"+b+",姓名为"+name);
    }
}*/



/*public class Intend{
    public static void main(String[] args){
        System.out.println("请输入年龄：");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<=18){
            System.out.println("少年");

        }else if(age > 18 && age <= 28){
            System.out.println("青年");
        }else if(age > 29 && age <= 55){
            System.out.println("中年");

        }else{
            System.out.println("老年");
        }
    }
}*/



/*public class Intend{
    public static void main(String[] args){
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            boolean isSuShu = true;
            if(num<=1){
                isSuShu = false;

            }
            for(int i = 2;i<num;i++){
                if(num%i == 0){
                    isSuShu = false;
                    break;
                }
            }
            if(isSuShu){
                System.out.println("是素数");

            }else{
                System.out.println("不是素数");
            }
        }
    }
}*/



public class Intend{
    public static void main(String[] args){
        for(int i = 2;i<=100;i++){
            boolean isPar = true;
            for(int j = 2;j<i;j++){
                if(i%j == 0){
                    isPar = false;
                    break;
                }
            }
            if(isPar){
                System.out.print(i+" ");

            }else{
                continue;
            }
        }
    }
}