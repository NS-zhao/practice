// import java.util.Scanner;
// import java.util.Random;
// public class D {
//     public static void main(String[] args)  {
//         Scanner sc=new Scanner(Ststem.in);
//         Random random=new Random();
//         System.out.println("给一个1~100之间的整数，请参测这个数")
//         int realNumber=random.nextInt(100)+1;
//         int guess=0；
//         System.out.println("输入你参测的数")；
//         guess=sc.nextInt();
//         while(guess!=realNumber)
//         {
//             if(guess>realNumber){
//                 System.out.print("参大了，请再次输入");
//                 guess=sc.nextInt();    
//             }
//             else if(guess<realNumber){
//                 System.out.print("猜小了，请再次输入");
//                 guess=sc.nextInt();
//             }
//         }
//         System.out.print("猜对了");
//     }
// }





// public class D{
//     public static void main(String[] args){
//         int n=1,i=1,jiecheng=1；
//         long sum=0;
//         while(true){
//             jiecheng=1;
//             for(i=1;i<=n;i++){
//                 jiecheng=jiecheng*i;
//             }
//             sum=sum+jiecheng;
//             if(sum>9876)
//             break;
//             n++;
//         }
//         System.out.println((n-1));
//     }
// }





// public class D{
//     public static void main(String[] args){
//         int sum=0;
//         for(int i=1;i<=1000;i++){
//         for(int j=1,sum=0;j<i;j++){
//         if(i%j==0)
//         sum=sum+j;
//         }
//         if(sum==i)
//         System.out.println("完数:"+i);
//         }
//     }
// }





// public class D{
//     public static void main(String[] args){
//         char cStart='A',cEnd='Z';
//         for(char c=cStart;c<=cEnd;c++)
//         System.out.printf("%2c",c);
//         System.out.println();
//         for(char c=cStart;c<=cEnd;c++)
//         System.out.printf("%2c",(c+32));
//     }
// }





// public class D{
//         public static void main(String[] args){
//     for(char a='A';a<='Z';a++){
//             System.out.print(a+" ");
//              }
//              System.out.println();
//              for(char c='A';c<='Z';c++)
//              System.out.print(c+" ");
//             }
//         }
//     }
// }





// import java.util.Scanner;
// public class D{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         double amount=0;
//         double price=0;
//         System.out.println("请输入用电量");
//         amount=sc.nextDouble();
//         if(amount>=1&&amount<=90){
//             price=amount*0.6;
//         }
//         else if(amount>=91&&amount<=150){
//             price=amount*0.6+(amount-90)*1.1;
//         }
//         else if(amount>150){
//             price=amount*0.6+(150-90)*1.1+(amount-150)*1.7;
//         }
//         else{
//             System.out.println("输入不合理");
//         }
//         System.out.printf("电费:%5.2f",price);
//     }
// }






// import java.util.Scanner;
// public class D{
//     public static void giveMess(int number){
//         if (number=9 ||nember=131 ||nember=12{
//             System.out.println("三等奖");
//         })
//         else if (number=209 ||nember=596 ||nember=27{
//             System.out.println("二等奖");
//         }
//         else if (number=875 ||nember=316 ||nember=59{
//             System.out.println("一等奖");
//         }
//         else{
//             System.out.println("未中奖");
//         }
//     }
// }
// public static void main(Sting[] args){
//     Scanner sc =new Scanner(System.in);
//     System.out.println("输入正整数");
//     int nember = sc.nextInt();
//     D d=new D()
//     d.giveMess(nember);
// }






    
    
        
    




       

