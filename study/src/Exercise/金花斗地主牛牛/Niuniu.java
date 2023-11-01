package Exercise.金花斗地主牛牛;

import java.util.ArrayList;
import java.util.Random;

public class Niuniu {
    //带花色集合
    public static ArrayList<String> cards = new ArrayList<>();
    //带花色集合
    public static ArrayList<Integer> cardsInt = new ArrayList<>();

    //提前加载所有牌
    static {
        //点数
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] size = {"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "1", "2"};
        //花色
        String[] color = {"❤", "♠", "♦", "♣"};

        for (int s = 0; s < sizes.length; s++) {
            for (int i = 0; i < color.length; i++) {
                //放入带花色集合
                String card = sizes[s] + color[i];
                cards.add(card);
                //放入不带花色集合
                cardsInt.add(Integer.valueOf(size[s]));
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(cards);
        dealCards("兰本才", "江浩威", "李志强");
    }

    /**
     *
     */
    public static void dealCards(String ...args) {
        for (String arg : args) {
            deal(arg);
        }
    }

    public static int residuum = 52;
    static Random r = new Random();

    /**
     * 随机发牌
     *
     * @param player 玩家
     */
    public static void deal(String player) {
       // calculate(cheat.cheat(player, cardsInt, cards));
        ArrayList<String> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        //每人发五张牌,拿一个随机数
        for (int i = 0; i < 5; i++) {
            int rr = r.nextInt(residuum);
            //牌量总数减一
            residuum = residuum - 1;
            //带花色的
            String get = String.valueOf(cards.get(rr));
            cards.remove(rr);
            a.add(i, get);
            //不带花色的
            int getInt = cardsInt.get(rr);
            if (getInt > 10) {
                getInt = 10;
            }
            cardsInt.remove(rr);
            b.add(i, getInt);
        }

        System.out.println(player + "的牌是" + a);
        calculate(b);
        //System.out.println(b);
    }

    /**
     * 计算点数
     *
     * @param b
     */
    private static void calculate(ArrayList<Integer> b) {
        //System.out.println(b);
        int sum = 0;
        for (int i = 0; i < b.size(); i++) {
            sum += b.get(i);
        }

        int san = 0;
        String result = "";
        boolean Niubility = false;
        boolean CowEggs = false;

        for (int i = 0; i < b.size() - 2; i++) {
            int cardi = b.get(i);
            for (int j = i + 1; j < b.size() - 1; j++) {
                int cardj = b.get(j);
                for (int k = j + 1; k < b.size(); k++) {
                    int cardk = b.get(k);
                    san = cardi + cardj + cardk;
                    //System.out.println(san);
                    //有牛
                    if (san % 10 == 0) {
                        int niu = (sum - san) % 10;
                        if (sum % 10 == 0 || niu == 0) {
                            //牛牛
                            Niubility = true;
                        } else {
                            //牛点数
                            result = "牛" + niu;
                            CowEggs = true;
                        }
                    }
                }
            }
        }

        if (Niubility) {
            System.out.println("牛牛");
        } else if (CowEggs) {
            System.out.println(result);
        } else {
            System.out.println("牛卵");
        }
    }


}
// 随机发牌 内被抽取的方法
//ArrayList<String> a = new ArrayList<>();
//    ArrayList<Integer> b = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//        int rr = r.nextInt(residuum);
//        residuum = residuum - 1;
//        //带花色的
//        String get = String.valueOf(cards.get(rr));
//        cards.remove(rr);
//        a.add(i, get);
//        //不带花色的
//        int getInt = cardsInt.get(rr);
//        if (getInt > 10) {
//        getInt = 10;
//        }
//        cardsInt.remove(rr);
//        b.add(i, getInt);
//        }
//        System.out.println(player+"的牌是"+a);
//        calculate(b);