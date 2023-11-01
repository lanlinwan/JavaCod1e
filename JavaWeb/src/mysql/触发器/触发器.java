package mysql.触发器;

public class 触发器 {
    //触发器
    //●介绍
    // 1.触发器是与表有关的数据库对象,指在insert/update/delete之前或之后,触发并执行触发器中定义的SQL语句集合。
    //  触发器的这种特性可以协助应用在数据库端确保数据的完整性,日志记录,数据校验等操作。
    // 2.使用别名OLD和NEW来引用触发器中发生变化的记录内容,这与其他的数据库是相似的。
    //  现在触发器还只支持行级触发,不支持语句级触发。

    //触发器类型           NEW和OLD、
    //INSERT型触发器   NEW表示将要或者已经新增的数据
    //UPDATE型触发器   OLD表示修改之前的数据, NEW表示将要或已经修改后的数据
    //DELETE型触发器   OLD表示将要或者已经删除的数据

    /*
        --创建触发器
        create trigger trigger_name
        before/after insert/update/delete
        ob user FOR EACH ROW --行级触发器
        BEGIN
            trigger_stmt;
        END;
        --查看
        show triggers;

        --删除
        drop trigger [指定数据库名]  trigger_name;--如果没有指定 ,默认为当前数据库
     */

    /*
        --准备工作:日志表tbl_log
        --插入 数据触发器
        create trigger tbl_insert_trigger
             after insert on tbl_account for each row
        begin
             insert into tbl_log(id,info,createDate) values
             (null,new.id+new.name+'转账操作',now());
        end;
        --修改 数据触发器
          create trigger tbl_insert_trigger
             after update on tbl_account for each row
          begin
             insert into tbl_log(id,info,createDate) values
             (null,concat('更新前:id:',old.id,',name',old.name,
                          '更新后:id:',new.id,',name',new.name
             ),now());
           end;
         --删除 数据触发器
          create trigger tbl_insert_trigger
             after delete on tbl_account for each row
          begin
             insert into tbl_log(id,info,createDate) values
            (null,concat('delete前:id:',old.id,',name',old.name),now());
           end;


     */
}
