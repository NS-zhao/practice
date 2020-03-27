/*public class Eight{
    public static void main(String[] args){
        int day = 5;
        switch(day){
            case 1:
               System.out.println("星期一");
            case 2:
               System.out.println("星期二");
            case 3:
               System.out.println("星期三");
            case 4:
               System.out.println("星期四");
            case 5:
               System.out.println("星期五");
            case 6:
               System.out.println("星期六");
            case 7:
               System.out.println("星期七");
            default:
               System.out.println("输入有误");
        }
    }
}*/





/*public class Eight{
    public static void main(String[] args){
        int day = 5;
        switch(day){
            case 1:
               System.out.println("星期一");
               break;
            case 2:
               System.out.println("星期二");
               break;
            case 3:
               System.out.println("星期三");
               break;
            case 4:
               System.out.println("星期四");
               break;
            case 5:
               System.out.println("星期五");
               break;
            case 6:
               System.out.println("星期六");
               break;
            case 7:
               System.out.println("星期七");
               break;
            default:
               System.out.println("输入有误");
               break;
        }
    }
}*/





/*public class Eight{
    public static void main(String[] args){
        int x = 10;
        if(x == 20);{
            System.out.println("hehe");
        }
    }
}*/




/*public class Eight{
    public static void main(String[] args){
        double num = 1.0;
        switch(num){
            case 1.0:
               System.out.println("hehe");
               break;
            case 2.0:
               System.out.println("haha");
               break;
        }
    }
}*/



/*public class Eight{
    public static void main(String[] args){
        int x = 1;
        int y = 1;
        switch(x){
            case 1:
               switch(y){
                   case 1:
                      System.out.println("hehe");
                      break;
               }
               break;
            case 2:
               System.out.println("haha");
               break;
        }
    }
}*/




/*public class Eight{
    public static void main(String[] args){
        int num = 1;
        while(num<=10){
            System.out.println(num);
            num++;
        }
    }
}*/



/*public class Eight{
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}*/



/*public class Eight{
    public static void main(String[] args){
        int n = 1;
        int ret = 1;
        while(n<=5){
            ret *= n;
            n++;
        }
        System.out.println(ret);
    }
}*/



public class Eight{
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        while(i<=5){
            int flag = 1;
            int tempResult = 1;
            while(flag<=i){
                tempResult *= flag;
                flag++;
            }
            sum += tempResult;
            i++;
        }
        System.out.println("值为" +sum);
    }
}