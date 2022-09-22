package 分支与循环;

public class main {
    public static void main(String[] args) {
        //1. if
        int score = 199;
        if(score >= 0 && score < 60){
            System.out.println("您本月的绩效是：C");
        }else if(score >= 60 && score < 80){
            System.out.println("您本月的绩效是：B");
        }else if(score >= 80 && score < 90){
            System.out.println("您本月的绩效是：A");
        }else if(score >= 90 && score <= 100){
            System.out.println("您本月的绩效是：A+");
        }else {
            System.out.println("您录入的分数有毛病！");
        }

        //2. swicth
        //表达式类型只能是byte、short、int、char，JDK5开始支持枚举，JDK7开始支持String、不支持double、float、long。
        // case给出的值不允许重复，且只能是字面量，不能是变量。
        String weekday = "周二";
        switch (weekday){
            case "周一":
                System.out.println("埋头苦干，解决bug ");
                break;
            case "周二":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三":
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;
            case "周四":
                System.out.println("主动帮助新来的女程序解决bug");
                break;
            default:
                System.out.println("数据有误！");
        }

        // 需求：用户输入月份可以展示该月份的天数。
        // 1、3 、5、 7 、 8、 10、 12月份是 31天
        // 2月份是闰年为29天、非闰年为28天。
        // 4 、6 、9、 11月份 是30天
        int month = 7;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month +"是31天！");
                break;
            case 2:
                System.out.println(month +"月闰年为29天、非闰年为28天！");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month +"是30天！");
                break;
            default:
                System.out.println("数据有误！");
        }

        //3.
    }
}
