package MysqlS.mysql.存储过程;

public class 参数 {
    //●参数
    //类型            含义
    //IN    该类参数作为输入，也就是需要调用时传入值 (默认)
    //OUT   该类参数作为输出，也就是该参数可以作为返回值
    //INOUT 既可以作为输入参数，也可以作为输出参数
    // create procedure p4(in/out/inout 参数名 数据类型 )

    /*
    create procedure p4(in score int,out result varchar(10))
    begin
        if score >= 85 then
            set result := '优秀';
        elseif score >= 60 then
            set result := '及格';
        else
             set result := '不及格';
        end if;
    end;

    call p4(68,@result);
    select @result;
     */

    //将传入的200分制的分数,进行换算,换算成百分制， 然后返回分数---> inout
    /*
    create procedure p5(inout score double)
    begin
       set score := score * 0.5;
    end;

    set @score = 78;
    call p5(@score);
    select @score;

    */

}
