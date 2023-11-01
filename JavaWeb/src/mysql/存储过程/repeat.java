package mysql.存储过程;

public class repeat {
    //repeat
    //repeat是有条件的循环控制语句,当满足条件的时候退出循环。具体语法为:
    //先执行一次逻辑,然后判定逻辑是否满足，如果满足，则退出。如果不满足，则继续下一次循环
    /*
     create procedure p8(in n int)
     begin
         declare total int default 0;

         repeat
            set total := total + n;
            set n := n-1;
         until n <= 0
         end repeat;

         select total;
     end;

     call p8();

     */
}
