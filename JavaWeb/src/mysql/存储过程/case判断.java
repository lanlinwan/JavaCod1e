package mysql.存储过程;

public class case判断 {
    //●case
    /*
        create procedure p6(in month int)
        begin
            declare result varchar(10);
            case
                when month >= 1 and month <=3 then
                    set result := '第- - 季度';
                when month >= 4 and month <= 6 then
                    set result := '第二季度';
                when month >= 7 and month <= 9 then
                    set result := '第三季度';
                when month >= 10 and month <=12 then
                    set result := ' 第四季度';
                else
                    set result := '非法参数' ;
            end case ;
            select concat('您输入的月份:',month,'所属季度:',result);
        end;

        call p6(4)

     */
}
