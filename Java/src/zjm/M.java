package zjm;

//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Set;
//
//
//class MyDianCai {
//    static HashMap<String, String> hs = new HashMap<>();
//    static List<Map> list = new ArrayList<>();
//    static int sum = 0;
//
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("欢迎来到新龙门客栈");
//        list();
//        while (true) {
//            String in = s.nextLine();
//            String[] remove = in.split("[0-9]");
//            if (Character.isDigit(in.charAt(0))) {
//                dianCai(in);
//            } else if (in.equals("ok")) {
//                ok();
//            } else if (in.equals("sum")) {
//                sum();
//            } else if (in.equals("order")) {
//                order();
//            } else if (remove[0].equals("-")) {
//                String[] removes = in.split("-");
//                remove(removes[1]);
//            } else if (in.equals("list")) {
//                list();
//            } else if (in.equals("help")) {
//                help();
//            } else if (in.equals("exit")) {
//                break;
//            }
//        }
//        System.out.println("退出系统");
//    }
//
//
//    public static void list() {
//        System.out.println("本店今日提供：");
//        System.out.println("1.卤肉火烧          \t10元");
//        System.out.println("2.北京烤鸭         \t200元");
//        System.out.println("3.剁鱼头         \t100元");
//        System.out.println("4.炒不烂        \t20元");
//        System.out.println("5.烧茄子          \t30元");
//        System.out.println("数字点菜，ok下单，help显示帮助");
//    }
//
//
//    public static void dianCai(String name) {
//        switch (name) {
//            case "1":
//                hs.put("1.卤肉火烧", "10元");
//                System.out.println("卤肉火烧已添加");
//                break;
//            case "2":
//                hs.put("2.北京烤鸭", "200元");
//                System.out.println("北京烤鸭已添加");
//                break;
//            case "3":
//                hs.put("3.剁鱼头", "100元");
//                System.out.println("剁鱼头已添加");
//                break;
//            case "4":
//                hs.put("4.炒不烂", "20元");
//                System.out.println("炒不烂已添加");
//                break;
//            case "5":
//                hs.put("5.烧茄子", "130元");
//                System.out.println("烧茄子已添加");
//                break;
//        }
//        Set<String> set = hs.keySet();
//        for (String key : set) {
//            String values = hs.get(key);
//            System.out.println(key + "-----" + values);
//        }
//    }
//
//
//    public static void ok() {
//        list.add(hs);
//        hs = new HashMap<>();
//        System.out.println("下单成功，客观先坐，菜稍后就到！下一位！");
//    }
//
//
//    public static void order() {
//        Set<String> set = hs.keySet();
//        for (String key : set) {
//            String values = hs.get(key);
//            System.out.println(key + "-----" + values);
//        }
//    }
//
//
//    public static void remove(String removes) {
//        switch (removes) {
//            case "1":
//                hs.remove("1.卤肉火烧");
//                break;
//            case "2":
//                hs.remove("2.北京烤鸭");
//                break;
//            case "3":
//                hs.remove("3.剁鱼头");
//                break;
//            case "4":
//                hs.remove("4.炒不烂");
//                break;
//            case "5":
//                hs.remove("5.烧茄子");
//                break;
//        }
//        Set<String> set = hs.keySet();
//        for (String key : set) {
//            String values = hs.get(key);
//            System.out.println(key + "------" + values);
//        }
//    }
//
//
//    public static void sum() {
//        for (Map m : list) {
//            Set<String> set = m.keySet();
//            for (String key : set) {
//                String values = (String) m.get(key);
//                String[] prices = values.split("元");
//                int price = Integer.parseInt(prices[0]);// 将字符串转类型换为int型
//                sum += price;
//            }
//        }
//        System.out.println("今天收入"+sum+"元");
//    }
//
//
//    public static void help() {
//        System.out.println("list\t-列菜单");
//        System.out.println("数字\t-点菜");
//        System.out.println("-数字\t-移除已点的菜");
//        System.out.println("ok\t-结束点菜并生成订单，然后下单");
//        System.out.println("order\t-查看已点的菜");
//        System.out.println("sum\t-统计销售额");
//        System.out.println("exit\t-退出");
//        System.out.println("help\t-打印帮助信息");
//    }
//
//
//}
//
