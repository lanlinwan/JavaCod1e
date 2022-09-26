package Exercise.luan;

import java.lang.reflect.Array;

public class shen {
    public static void main(String[] args) {
        int red_aplle = 10;
        int green_apple = 23;
        int qing_apple = 40;
        int wang_apple = 0;
        int bool = qing_apple%5;
        if (bool == 0){
            qing_apple++;
            wang_apple++;
            if (qing_apple > red_aplle && red_aplle > 0){
                red_aplle--;
            }else {
                wang_apple = green_apple + red_aplle;
            }
        }else {
            red_aplle++;
            qing_apple--;
            wang_apple++;
            if (red_aplle > 10 && qing_apple < 40){
                wang_apple = 100%qing_apple==0?10:11;
            }
        }
        for (int i = 0; i <= red_aplle; i++){//10
            for (int j = 42; j > qing_apple ; j-- ){//1
                wang_apple++;
            }
        }
        System.out.println(wang_apple);
    }
}
