package mysql.存储过程;

public class while循环 {
    //while
    /*
        -- A.定义局部变量， 记录累加之后的值;
        -- B.每循环一一次， 就会砌进行减1， 如知减到日，则退出
        create procedure p7(in n int)
        begin
             declare total int default 0;
             while n>0 do
                 set total := total + n;
                 set n:=n-1;
             end while;
             select total;
        end;

        call p7(10);

     */
}
