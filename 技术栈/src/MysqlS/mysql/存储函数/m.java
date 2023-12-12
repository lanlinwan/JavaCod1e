package MysqlS.mysql.存储函数;

public class m {
    //存储函数:
    //存储函数是有返回值的存储过程，存储函数的参数只能是IN类型的。具体语法如下:
    /*

    create function 存储函数名称([参数列表])
    returns type [characteristic ..]
    BEGIN
        -- SQL语句
        RETURN ...
    END ;

    characteristic说明:
            DETERMINISTIC:相同的输入参数总是产生相同的结果
            NOSQL :不包含SQL语句。
            READS SQL DATA:包含读取数据的语句，但不包含写入数据的语句。
     */
    /*
    //从1累加到n
      create function fun1(n int)
      returns int
      begin
           declare total int default 0;

           while n>0 do
                set total := total+n;
                set n:=n-1;
           end while;

           return total;
       end;

       select fun1(100);
     */
}
