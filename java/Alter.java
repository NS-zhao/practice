/*public class Alter{
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
}*/




/*public class Alter{
    public static void main(String[] args){
        for(int i = 1000;i<=2000;i++){
            if(i%100 == 0){
                if(i%400 == 0){
                    System.out.print(i+" ");
                }
            }else{
                if(i%4 == 0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}*/




/*public class Alter{
    public static void main(String[] args){
        for(int i = 1;i<=9;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
}*/




/*public class Alter{
    public static void main(String[] args){
        int num1 = 50;
        int num2 = 15;
        int min = Math.min(num1,num2);
        for(int i = min;i>=1;i--){
            if(num1 % i == 0 && num2 % i == 0){
                System.out.println("最大公约数为："+i);
                break;
            }
        }
    }
}*/




/*public class Alter{
    public static void main(String[] args){
        double sum = 0;
        for(double i = 1;i<=100;i++){
            if(i%2 == 0){
                sum-=1/i;
            }else{
                sum+=1/i;
            }
        }
        System.out.println("sum为"+sum);
    }
}*/




/*public class Alter{
    public static void main(String[] args){
        int total = 1;
        for(int i = 10;i<100;i++){
            int geWei = i%10;
            int shiWei = i/10;
            if(geWei == 9){
                total+=1;
            }
            if(shiWei == 9){
                total+=1;
            }

        }
        System.out.println("共出现"+total+"次9");
    }
}*/




/*public class Alter{
    public static void main(String[] args){
        for(int i = 100;i<=999;i++){
            int geWei = i%10;
            int shiWei = i/10%10;
            int baiWei = i/100;
            int result = geWei*geWei*geWei+shiWei*shiWei*shiWei+baiWei*baiWei*baiWei;
            if(result == i){
                System.out.print(i+" ");
            }
        }
    }
}*/





/*public class Alter{
    public static void main(String[] args){
        int i = 12345678;
        while(i>0){
            System.out.println(i%10);
            i/=10;
        }
    }
}*/



import java.util.Scanner;

public class Alter{
    public static void main(String[] args){
        int code = 30;
        Scanner sc = new Scanner(System.in);
        int typeNumber = 0;
        while(sc.hasNext()){
            typeNumber++;
            int number = sc.nextInt();
            if(number == code){
                System.out.println("登陆成功");
                break;
            }
            if(typeNumber == 3){
                System.out.println("输入错误");
                break;
            }
        }
    }
}