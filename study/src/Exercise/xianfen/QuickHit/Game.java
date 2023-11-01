package Exercise.xianfen.QuickHit;

import java.util.Random;

public class Game {
    final static String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIZKLMNOPQRSTUVWXYZ";
    //字符比较 校验数
    static int correctNum;
    //游戏级别组
    static LevelParam levelParam;
    //游戏各级别
    static Player player;


    //准备
    public static void play() {
        //6个游戏级别
        for (int i = 0; i <LevelParam.levels.length ; i++) {
            //用户游戏级别
          Level level=LevelParam.levels[i];
          player=new Player();
          player.setLevelNo(level.getLevelNo());
          //每一个级别开始前 用户积分,时间清0
            player.setStartTime(0);
            player.setElapsedTime(0);
            player.setCurrScore(0);
          //开始
           playgame(level);
        }
        System.out.println("游戏闯关成功,恭喜你!");
    }

    //开始
    private static void playgame(Level level) {
        boolean t=true;
        while (t){

            for (int j = 0; j <level.getStrTime() ; j++) {
                //用户开始时间赋值
                long timePrint = System.currentTimeMillis();
                long staTime = player.getStartTime()+timePrint;
                player.setStartTime(staTime);
                //开始游戏
                game(level);
                //用户结束时间赋值
                long timeResult=System.currentTimeMillis();
                //玩家输入总花费的时间
                long time= (timeResult-timePrint)/1000;
                long l = player.getElapsedTime() + time;
                player.setElapsedTime(l);
                System.out.println("输入正确,你的积分"+player.getCurrScore()+"你的级别"+player.getLevelNo()+",已用时间"+player.getElapsedTime()+"秒");
            }


            //获取闯关时间限制,超过则重新开始 此游戏级别
            long a= level.getTimeLimit();
            if (player.getElapsedTime()>a){
                System.out.println("输入过慢,已退出,请从"+level.getLevelNo()+"级别重新开始!");
                //重新开始时间积分清零
                player.setStartTime(0);
                player.setElapsedTime(0);
                player.setCurrScore(0);
            }else {
                t = false;
                System.out.println("恭喜升级,进入下一级");
            }
        }
    }

    //开始游戏
    private static void game(Level level) {
        //输出字符串
        StringBuilder strPrint= printStr(level);
        //玩家输入字符串
        String strResult= player.printResult();
        //结果校验
        result(strPrint,strResult,level);
    }

    //输出字符串
    private static StringBuilder printStr(Level level) {
        //可变字符串
        StringBuilder builder=new StringBuilder();
        //随机数累
        Random random=new Random();
        for (int i = 0; i < level.getStrLeng(); i++) {
            //获取随机数
             int num=random.nextInt(str.length());
            builder.append(str.charAt(num));
        }
        System.out.println(builder);
        return builder;
    }

    //结果校验
    private static void result(StringBuilder strPrint,String strResult,Level level) {
        //捕获异常不处理
        try {
            for (int i = 0; i <strPrint.length() ; i++) {
                if( strPrint.charAt(i) == strResult.charAt(i)){
                    //每个字符相等 校验数++,如果全部相等 校验数=游戏阶段一行输入数
                    correctNum++;
                }
            }
        }catch (Exception ignored){
        }
        //所有字符对的上 累加这个阶段的 分
        if (correctNum==strPrint.length()){
            //累计加分
            int  num=player.getCurrScore()+level.getPerScore();
            player.setCurrScore(num);
            //
            correctNum=0;
        }else {
            correctNum=0;
            System.out.println("输入错误,请重新开始!");
            game(level);
        }
    }



}
