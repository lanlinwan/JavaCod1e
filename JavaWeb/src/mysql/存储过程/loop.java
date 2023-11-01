package mysql.存储过程;

public class loop {
    //●loop
    //LOOP实现简单的循环，如果不在SQL逻辑中增加退出循环的条件，可以用其来实现简单的死循环。LOOP可以配合- . 下两个语句使用: .
    // leave :配合循环使用，退出循环。
    // iterate :必须用在循环中，作用是跳过当前循环剩下的语句，直接进入下一-次循环。

    /*
        从1累计加到n ,n为传入的参数
        create procedure p9(in n int)
        begin
            declare total int default 0;

            sum: Loop
                if n<=0 then
                    leave sum;
                end if;

                set total := total + n;
                set n:=n-1;
            end Loop sum;

            select total;
        end;

        cal(100);
     */

    /*
        --从1累计加到n,n为奇数直接跳过,n为传入的参数
        create procedure p9(in n int)
        begin
            declare total int default 0;

            sum: Loop
                if n<=0 then
                    leave sum;
                end if;

                if n%2 =1 then
                    set n := n-1;
                    iterate = sum;--进入下一次循环
                end if;

                set total := total + n;
                set n:=n-1;
            end Loop sum;

            select total;
        end;

        cal(100);
     */


}
