package 面向对象.EX;

import java.util.Scanner;

public class shopcar {
    public static void main(String[] args) {
        //1.定义商品类
        //2.定义购物车对象:使用数组表示
        goods[] shop=new goods[100];
        //3.搭建操作构架
        while (true) {
            System.out.println("请你选择如下命令进行操作作");
            System.out.println("添加商品: add");
            System.out.println("查询商品: query");
            System.out.println("修改商品购买数量: update");
            System.out.println("结算购买商品金额: pay");
            Scanner sc=new Scanner(System.in);
            System.out.println("请你输入命令");
            String command=sc.next();
            switch (command){
                case "add":
                    add(shop,sc);
                    break;
                case "query":
                    query(shop);
                    break;
                case "update":
                    update(shop);
                    break;
                case "pay":
                    pay(shop);
                    break;

            }
        }
    }
    //添加
    public static void add(goods[] shop,Scanner sc){
        System.out.println("请您输入商品的id：");
        int id = Integer.parseInt(sc.next());
        System.out.println("请您输入商品的名称：");
        String name = sc.next();
        System.out.println("请您输入商品的价格：");
        double price = sc.nextDouble();
        System.out.println("请您输入购买商品的数量：");
        int buyNumber = sc.nextInt();

        // 创建一个商品对象，封装这些数据
        goods a = new goods(id,name,price,buyNumber);

        // 遍历这个购物车数组对象，看哪个位置是null,如果是null ,把商品对象添加进去
        for (int i = 0; i < shop.length; i++) {
            if(shop[i] == null){
                shop[i] = a; // 把商品对象添加到这个位置了
                break;
            }
        }
        System.out.println("添加成功！");
    }
    //查询
    public static void query(goods[] shop){
        System.out.println("-----查询购物车信息如下-----");
        System.out.println("编号\t\t\t名称\t\t\t价格\t\t\t购买数量");
        for (int i = 0; i < shop.length; i++) {
            goods g =shop[i];
            if(g!=null){
                System.out.println(g.id+"\t\t\t"+g.name+"\t\t\t"+g.price+"\t\t\t"+g.buyNumber);
            }else{
                break;
            }
        }
    }
    //修改
    public static void update(goods[] shop){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入要修改数量的商品名称：");
            String name = sc.next();
            goods a = getArticleByName(shop,name );
            if(a != null){
                System.out.println("请您输入修改后购买的数量：");
                int buyNumber = sc.nextInt();
                a.buyNumber = buyNumber;
                System.out.println("该商品的购买数量修改了！");
                break;
            }else {
                System.out.println("购物车中没有该商品信息");
            }
        }
    }
    public static goods getArticleByName(goods[] shop,String name){
        for (int i = 0; i < shop.length; i++) {
            goods a=shop[i];
            if (a!=null && shop[i].name.equals(name)){
                return a;
            }
        }
        return null;
    }
    public static void pay(goods[] shop){
        query(shop);
        // 准备一个double类型的变量统计总金额
        double money = 0;
        for (int i = 0; i < shop.length; i++) {
            goods a = shop[i];
            if(a != null){
                money += (a.price * a.buyNumber);
            }else {
                break;
            }
        }
        System.out.println("本次商品购买的总价为：" + money);
    }
}
