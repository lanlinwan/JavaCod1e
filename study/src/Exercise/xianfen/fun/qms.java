package Exercise.xianfen.fun;

public class qms {

    public static void main(String[] args) {

        for (int i = 1; i < 3001; i++) {
            //a
            double num=i;
            //a 因子和
            double factor= m(num);

            //b
            double b=factor;
            //b 因子和
            double factor2=m(b);

            if (num==factor2){
                System.out.println(b+"-----------------------------"+factor2);
            }
            factor=0;
        }

    }

     static public double m(double num){
        double factor=0;
        for (int j = 1; j < Math.sqrt(num+1); j++) {
            double yz1= num/j;
            if (Math.round(yz1) == yz1){
                double yz2=num/yz1;
                factor=factor+yz1+yz2;
            }
        }
        return factor-num;
    }


}
