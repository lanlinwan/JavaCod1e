package 面向对象.静态初始化代码块;

import java.util.ArrayList;
import java.util.Random;

//斗地主提前 加载牌: 每人17张手牌,三张地主牌,并在手牌中随机选定一张牌当地主
public class ex {
    //定义一个静态的集合,之加载一次
    public static ArrayList<String> cards=new ArrayList<>();

    static {
        //点数
        String[] sizes={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //花色
        String[] color={"❤","♠","♦","♣"};

        for (int s = 0; s <sizes.length ; s++) {
            for (int i = 0; i < color.length; i++) {
                String card=sizes[s]+color[i];
                cards.add(card);
            }
        }
        cards.add("小王");
        cards.add("大王");
    }



    public static void main(String[] args) {
        System.out.println(cards);
    }
}
















