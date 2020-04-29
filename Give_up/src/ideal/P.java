package ideal;

//class RedCowForm{
//    String formName;
//    RedCow cow;
//    RedCowForm(){
//
//    }
//    RedCowForm(String s){
//        cow = new RedCow(150,112,5000);
//        formName = s;
//    }
//    public void showCowMess(){
//        cow.speak();
//    }
//
//    class RedCow{
//        String cowName = "红牛";
//        int height;
//        int weight;
//        int price;
//        RedCow(int h,int w,int p){
//            height = h;
//            weight = w;
//            price = p;
//        }
//        void speak(){
//            System.out.println("偶是"+cowName+",身高："+height+"cm,体重："+weight+"kg,生活在："+formName);
//        }
//    }
//}
//
//public class P {
//    public static void main(String[] args) {
//        RedCowForm form = new RedCowForm("红牛农场");
//        form.showCowMess();
//    }
//}




//abstract class InputAlphabet{
//    public abstract void input();
//}
//
//class InputEnglish extends InputAlphabet{
//    public void input(){
//        for (char c = 'a'; c <= 'z'; c++) {
//            System.out.printf("%3c",c);
//        }
//    }
//}
//
//class ShowBoard{
//    void showMess(InputAlphabet show){
//        show.input();
//    }
//}
//
//public class P{
//    public static void main(String[] args) {
//        ShowBoard board = new ShowBoard();
//        board.showMess(new InputEnglish());
//        board.showMess(new InputAlphabet() {
//
//            public void input() {
//                for (char c = 'A'; c <= 'Z'; c++) {
//                    System.out.printf("%3c",c);
//                }
//            }
//        });
//    }
//}




//public class P{
//    public static void main(String[] args) {
//        int n = 0;
//        int m = 0;
//        int t = 1000;
//        try{
//            m = Integer.parseInt("8888");
//            n = Integer.parseInt("ab89");
//            t = 7777;
//        }
//        catch (NumberFormatException e){
//            System.out.println("发生异常："+e.getMessage());
//        }
//        System.out.println("n="+n+",m="+m+",t="+t);
//        try{
//            m = Integer.parseInt("123");
//            n = Integer.parseInt("678");
//            t = 5555;
//        }
//        catch (NumberFormatException e){
//            System.out.println("发生异常："+e.getMessage());
//        }
//        System.out.println("n="+n+",m="+m+",t="+t);
//    }
//}