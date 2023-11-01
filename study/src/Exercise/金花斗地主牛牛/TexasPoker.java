package Exercise.金花斗地主牛牛;

import java.util.ArrayList;

public class TexasPoker {

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

        for (int i = 0; i < args.length; i++) {
            count();
        }

    }


    public static void  count(){

    }






}
