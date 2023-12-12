package SSM.SpringTask;

public class task {
    /*
       Spring Task是Spring框架提供的任务调度工具，可以按照约定的时间自动执行某个代码逻辑。

        cron表达式其实就是一个字符串，通过cron表达式可以定义任务触发的时间
        构成规则:分为6或7个域，由空格分隔开，每个域代表一个含义
        每个域的含义分别为:               秒、分钟、小时、日、月、周、年(可选)

  2022年10月12日.上午9点整对应的cron表达式为:0   0   9  12  10  ?  2022


        Spring Task使用步骤:
        ①导入maven坐标spring-context (已存在)
        ②启动类添加注解@EnableScheduling开启任务调度
        ③自定义定时任务类



     */
}
