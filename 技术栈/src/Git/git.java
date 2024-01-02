package Git;

public class git {
    /*
      git add 文件名.  :将修改的文件加入暂存区
      git commit -m'注释内容'  :将暂存区内的内容加入到本地仓库的当前分支
      git log  :查看提交日志
      git reset --hard commitID  :切换到指定的版本ID
      git reflog  :用来查看所有分支的所有操作记录

      git branch  :查看本地分支
      git branch 分支名  :创建本地分支
      git checkout 分支名  :切换分支
      git checkout -b 分支名  :创建并切换分支
      git merge dev01  :合并dev01到当前分支
      git branch -d 分支名  :删除分支,需要检查
      git branch -D 分支名  :强制删除分支

      git branch -vv  :查看关联关系
      git remote add <仓库名称> <远程仓库路径> :初始化本地库 与已创建的远程库进行对接
      git remote  :查看远程仓库
      git push [远端名称 [本地分支名][:远端分支名] ] :推送到远程仓库
      如果远程分支名和本地分支名称相同，则可以只写本地分支
      git push origin master
      -f 表示强制覆盖;  --set-upstream 推送到远端的同时并且建立起和远端分支的关联关系。
      git push  --set-upstream origin master
      如果当前分支已经和远端分支关联，则可以省略分支名和远端名。
      git push :将master分支推送到已关联的远端分支
      git clone <仓库路径> [本地目录]  :已经有一个远端仓库，我们可以直接clone到本地。
      git fetch [远端名称] [分支名] :抓取指令,将仓库里的更新都抓取到本地，不会进行合并
      git pull [远端名称] [分支名]  :拉取指令,将远端仓库的修改拉到本地并自动进行合并，等同于fetch+merge






     */
}
