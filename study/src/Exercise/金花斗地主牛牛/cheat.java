package Exercise.金花斗地主牛牛;

import java.util.ArrayList;
import java.util.Random;

public class cheat {
    public static int residuum = 52;
    static Random r = new Random();
    public static ArrayList<Integer>  cheat(String player,ArrayList<Integer> cardsInt,ArrayList<String> cards){
        ArrayList<String> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int rr = r.nextInt(residuum);
            residuum = residuum - 1;
            if(player.equals("兰本才")){
                while (true){
                    int rrr = r.nextInt(residuum);
                    if (cardsInt.get(rrr)>=10){
                        //带花色的
                        String get1 = String.valueOf(cards.get(rrr));
                        cards.remove(rrr);
                        a.add(i, get1);
                        //不带花色的
                        int getInt = cardsInt.get(rrr);
                        if (getInt > 10) {
                            getInt = 10;
                        }
                        cardsInt.remove(rrr);
                        b.add(i, getInt);
                        break;
                    }
                }
            }else {
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


        }
        System.out.println(player+"的牌是"+a);
       return b;
    }
}
