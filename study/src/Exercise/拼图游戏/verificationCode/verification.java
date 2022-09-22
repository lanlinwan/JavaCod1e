package Exercise.拼图游戏.verificationCode;

import java.util.Random;

public  class verification {
    static String code="";
    static Random r=new Random();
    public static String VerificationCode(int n){
        for (int i = 0; i < n; i++) {
            int type =r.nextInt(3);

            switch (type) {
                case 0 -> {
                    //大写字符
                    char ch = (char) (r.nextInt(26) + 65);
                    code += ch;
                }
                case 1 -> {
                    //小写字符
                    char ch1 = (char) (r.nextInt(26) + 97);
                    code += ch1;
                }
                case 2 -> {
                    //小写字符
                    int ch2 =  r.nextInt(10);
                    code += ch2;
                }
            }
        }
        return code;
    }
}
