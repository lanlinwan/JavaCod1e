package 分支与循环;

public class for1 {
    public static void main(String[] args) {

    //for 循环
    //打印一个菱形
        //上三角
       for (int i=1;i<=11;i++){
           System.out.println();
           for(int k=11;k>=i;k--){
               System.out.print(" ");
           }
           for (int j=1;j<=i;j++){
               System.out.print(" *");
           }
       }
       //下三角
        for(int i=1;i<=10;i++){
            System.out.println();
            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for (int j=10;j>=i;j--){
                System.out.print(" *");
            }
        }

    }
}
