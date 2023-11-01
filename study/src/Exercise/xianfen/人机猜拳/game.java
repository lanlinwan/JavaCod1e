package Exercise.xianfen.人机猜拳;

import java.util.Scanner;

public class game {
    static robot lb;
    static robot sq;
    static robot cc;
    static user  user;
    static  robot rival;
    static int numGame;
    static Scanner s=new Scanner(System.in);
    static {
          lb=new robot();
          lb.setName("刘备");
          sq=new robot();
          sq.setName("孙权");
          cc=new robot();
          cc.setName("曹操");
    }




    //1.游戏
    static public void   play(){
        System.out.println("---------------欢迎进入游戏世界--------------");
        System.out.println("猜拳规则:1:石头 2:剪刀 3:布");
        System.out.println("请选择对战角色:1:刘备 2:孙权 3:曹操");

        //输入正确的数字 人机对象才会创建
        while (rival == null){
            //获取对战角色
            int rivalint=s.nextInt();

            switch (rivalint){
                case 1:
                    rival=lb;
                    //System.out.println(1+rival.getName());
                    break;
                case 2:
                    rival=sq;
                    break;
                case 3:
                    rival=cc;
                    break;
                default:
                    System.out.println("请输入对应的数字");
                    System.out.println("请选择对战角色:1:刘备 2:孙权 3:曹操");
            }
        }

        //开始
        begin(rival);

    }

    //2.开始
    static public void begin(robot rival ) {
        boolean a = true;
        while (a) {
            System.out.println("要开始吗? (y/n)");
            String yn = s.next();

            switch (yn) {
                case "y":
                    System.out.println("请输入你的名字");
                    String name = s.next();
                    System.out.println(name + "VS" + rival.getName());
                    //创建用户类 name属性赋值
                    user = new user();
                    user.setName(name);
                    //对战
                    fight(rival, user);
                    a = false;
                    break;
                case "n":
                    a = false;
                    break;
                default:
                    System.out.println("请输入对应的字符");
            }
        }

    }


    //3.对战
    static public void fight(robot rival,user user){
        numGame++;
        System.out.println("请出拳:1:剪刀 2:石头 3:布");
        //调用 用户 出拳方法
        int quan=user.punch();
        //调用 人机 出拳方法
        int a=rival.punch();
        //计算胜负
        calculate(quan,a);
        //进入下一局
        nextPlay(rival,user);
        //积分结算
        finish(rival,user);
    }

    //4.计算胜负
    static public void calculate(int quan,int a) {

        System.out.println("------------");
        if (quan == a) {
            System.out.println("平局");
        } else {
            switch (quan) {
                case 1:
                    if (quan - a == -2) {
                        int userGrade = user.getIntegral();
                        user.setIntegral(userGrade + 1);
                        System.out.println("你赢了");
                    } else {
                        int rivalGrade = rival.getIntegral();
                        rival.setIntegral(rivalGrade + 1);
                        System.out.println("你输了");
                    }
                    break;
                case 2:
                case 3:
                    if (quan - a == 1) {
                        int userGrade = user.getIntegral();
                        user.setIntegral(userGrade + 1);
                        System.out.println("你赢了");
                    } else {
                        int rivalGrade = rival.getIntegral();
                        rival.setIntegral(rivalGrade + 1);
                        System.out.println("你输了");
                    }
                    break;
            }
        }
    }

    //5.下一局
    static public void nextPlay(robot rival,user user){
        boolean t=true;
        while (t){
            System.out.println("是否进入下一局? (y/n)");
            String nextPlay=s.next();
            switch (nextPlay){
                case "y":
                    fight(rival,user);
                    t=false;
                case "n":
                    t=false;
                    break;
                default:
                    System.out.println("请输入对应的字符");
            }
        }

    }

    //6.积分结算
    static public void finish(robot rival,user user){
        System.out.println("----------游戏结束----------");
        System.out.println(user.getName()+"VS"+rival.getName());
        System.out.println("对战次数:  "+numGame);
        System.out.println();
        System.out.println("姓名        得分");
        System.out.println(user.getName()+"         "+user.getIntegral());
        System.out.println(rival.getName()+"         "+rival.getIntegral());
    }

}
