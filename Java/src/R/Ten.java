package R;

//public class Ten {
//    public static void main(String args[]) {
//        int n=1,i=1,jiecheng=1;
//        long sum=0;
//        while(true) {
//            jiecheng=1;
//            for(i=1;i<=n;i++){
//                jiecheng=jiecheng*i;
//            }
//            sum=sum+jiecheng;
//            if(sum>9876)
//                break;
//            n++;
//        }
//        System.out.println("满足条件的最大整数:"+(n-1));
//    }
//}



//public class Ten {
//    public static void main(String args[]) {
//        int sum=0,i,j;
//        for(i=1;i<=1000;i++) {
//            for(j=1,sum=0;j<i;j++) {
//                if(i%j==0)
//                    sum=sum+j;
//            }
//            if(sum==i)
//                System.out.println("完数:"+i);
//        }
//    }
//}



//public class Ten{
//    public static void main (String[] args) {
//        int n = 1;
//        int i = 1;
//        int sum = 0;
//        for (i = 1; i <= n; i++) {
//            sum = sum+i;
//            if(sum>250)
//                break;
//            n++;
//        }
//        System.out.println("满足条件的最大整数:"+(n-1));
//    }
//}


//class Tom{
//    protected float weight;
//    protected float f(float a,float b){
//        return a+b;
//    }
//}
//class Jerry{
//    void g(){
//        Tom cat = new Tom();
//        cat.weight = 23f;                       //合法
//        float sum = cat.f(3,4);           //合法
//    }
//}



//try{
//    包含可能发生异常的语句
//}
//catch(ExceptionSubClass1 e){
//    ...
//}
//catch(ExceptionSubClass2 e){
//        ...
//}



//String s;
//s = new String("we are students");
//String tom = new String(s);
//char a[] = {'J','a','v','a'};
//String s = new String(a);
//         ||
//String s = new String("Java");
//char a[] = {'零','一','二','三','四','五','六','七','八','九'};
//String s = new String(a,2,4);
//           ||
//String s = new String("二三四五");

//public int length()
//public boolean equals(String s)
//public boolean startWith(String s)、public boolean endsWith(String s)
//public int compareTo(String s)
//public boolean contains(String s)
//public int indexOf(String s)
//public String substring(int startpoint)
//public String trim()


//public static byte parseByte(String s) throws NumberFormatException
//public static short parseShort(String s) throws NumberFormatException
//public static long parseLong(String s) throws NumberFormatException
//public static float parseFloat(String s) throws NumberFormatException
//public static double parseDouble(String s) throws NumberFormatException

//public static String valueOf(byte n)
//public static String valueOf(int n)
//public static String valueOf(long n)
//public static String valueOf(float n)
//public static String valueOf(double n)

//public void getChar(int start,int end,char c[],int offset)
//public boolean matches(String regex)
//public String replaceAll(String regex,String replacement)
//public String[] split(String regex)
//StringBuffer()
//StringBuffer(size)
//StringBuffer(String s)

//public final void set(int year,int month,int date)
//public final void set(int year,int month,int date,int hour,int minute)
//public final void set(int year,int month,int date,int hour,int minute,int second)