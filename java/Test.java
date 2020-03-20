//public class Test{
//    public static void main(String[] args){
//       System.out.println("hello word");
//       System.out.println("my name is:"+args[0]);
//    }
//}


public class Test{
    
    public static void main(String[] args){
        int age = 18;
        String name = "zhaojiamin";
        System.out.println("my age is"+age+"   my name is"+name);
        if(age <= 18){
            System.out.println("adult");
        }else{
            System.out.println("old");
        }
        for(int i = 0;i < 10;i++){
            System.out.println(i);
        }
        try{
            InputStream in = new FileInputStream(new File("//test.java"));
        }catch (FileNotFoundException e) {
                System.out.println("Not Found");
        } 
        Thread thread = new Thread(()->System.out.println("hello world"));
        thread.start();
        List<Integer>list = Arrays.asList{1,2,2,4,5,3,3,6,8,10,10,20,30,30,35,100,100};
        list.stream()
            .filter(e -> e%2 == 0)
            .distinct()
            .forEach(System.out::println);
    
    }
}