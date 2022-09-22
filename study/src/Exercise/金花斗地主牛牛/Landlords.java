package Exercise.金花斗地主牛牛;

import java.util.ArrayList;
import java.util.Random;

public class Landlords {
    //定义一个静态的集合,之加载一次
    public static ArrayList<String> cards=new ArrayList<>();
    //
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


    public static String landlord;
    public static int residuum=54;
    static Random r=new Random();
    /**
     *
     * @param player 玩家
     * @param a 空集
     * @param landlordHand 地主手牌
     */
    public static void deal(String player,ArrayList<String> a,String  landlordHand){
        for (int i = 0; i < 17; i++) {
            int rr=r.nextInt(residuum);
            residuum=residuum-1;
            String get=cards.get(rr);
            if (get.equals(landlordHand)){
                landlord=player;
            }
            a.add(i,get);
            cards.remove(rr);
        }
        System.out.println(player+"的牌是"+a);
    }

    /**
     *
     * @param a 玩家
     * @param b 玩家
     * @param c 玩家
     */
    public static void dealCards(String a,String b,String c){
        int s=r.nextInt(55);
        String ss=cards.get(s);
        ArrayList<String> lan=new ArrayList<>();
        ArrayList<String> li=new ArrayList<>();
        ArrayList<String> jiang=new ArrayList<>();

        deal(a,lan,ss);
        deal(b,li,ss);
        deal(c,jiang,ss);

        System.out.println("地主牌:"+cards);

        System.out.println(landlord+"是地主,地主手牌是"+ss);

    }


    public static void main(String[] args) {
        System.out.println(cards);
        dealCards("李志强","兰本才","江浩威");

    }
}
