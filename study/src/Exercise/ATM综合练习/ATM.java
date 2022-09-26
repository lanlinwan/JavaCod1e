package Exercise.ATM综合练习;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//ATM
public class ATM {
    public static void main(String[] args) {
        //1.定义账户类
        //2.定义集合,负责以后的全部的账户对象,进行相关的业务操作
        ArrayList<Account> accounts=new ArrayList<>();
        //3.系统页面
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("----------------北国银行-----------------");
            System.out.println("1:账户登录");
            System.out.println("2:账户开户");

            System.out.println("请你选择操作");
            int command =sc.nextInt();

            switch (command){
                case 1:
                    //登录
                    login(accounts,sc);

                    break;
                case 2:
                    //开户
                    register(accounts,sc);

                    break;
                default:
                    System.out.println("输入的操作有误,请重新输入");
            }
        }
    }

    /**
     * 登录功能
     * @param accounts 自己的账户对象
     * @param sc   扫描器
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("----------------北国银行登录功能-----------------");
        while (true) {
            System.out.println("请你输入卡号(退出登录: 1)");
            String id=sc.next();
            String e="1";
            if (id.equals(e)){
                return;
            }
            //判断卡号是否存在
            Account acc= getAccountId(id,accounts);
            if (acc!=null){
                //卡号存在,进行密码输入
                while (true) {
                    System.out.println("请你输入密码(退出登录: 1)");
                    String password=sc.next();
                    if (acc.getPassword().equals(password)){
                        //登录成功
                        System.out.println(acc.getName()+"恭喜你登录成功");
                        //展示操作页
                        showUserCommand(sc,acc,accounts);
                        return;
                    }else {
                        System.out.println("密码错误请重新输入");
                    }
                }
            }else{
                System.out.println("对不起,您输入的卡号有误,请重新输入");
            }
        }
    }

    /**
     * 操作页面
     * @param sc 扫描器
     * @param acc  自己的账户对象
     * @param accounts 全部的账户对象
     */
    private static void showUserCommand(Scanner sc,Account acc,ArrayList<Account> accounts) {
        while (true) {
            System.out.println("----------------用户操作页----------------");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            System.out.println("请选择:");
            int command=sc.nextInt();
            switch (command){
                case 1://查询
                    showAccount(acc);
                    break;
                case 2://存款
                    System.out.println("请输入存入的摩拉");
                    depositMoney(acc,sc);
                    break;
                case 3://取款
                    System.out.println("请输入取出的摩拉");
                    drawMoney(acc,sc);
                    break;
                case 4:
                    //转账
                    transferMoney(acc,sc,accounts);
                    break;
                case 5://
                    updatePassword(sc,acc);
                    break;
                case 6://退出
                    System.out.println("退出成功");
                    return;
                case 7://销户
                   if(deleteAccount(acc,sc,accounts)){
                       return;
                   }else{
                       break;
                   }
                default:
                    System.out.println("您输入的指令有误,请重新输入");
            }
        }
    }

    /**
     *
     * @param acc 自己的账户
     * @param sc  扫描器
     * @param accounts 账户集合
     * @return boolean
     */
    private static boolean deleteAccount(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("----------------用户注销-----------------");
        System.out.println("确认注销？ y/n");
        String rs=sc.next();
        switch (rs){
            case "y":
                //销户
                if(acc.getMoney()>0){
                    System.out.println("您的账户中还有余额,请先转出");
                }else{
                    accounts.remove(acc);
                    System.out.println("您的账户销户完毕");
                    return true ;
                }
            default:
                System.out.println("账户保留成功");
        }
        return false;
    }

    /**
     * 修改密码
     * @param acc 自己的账户对象
     * @param sc 扫描器
     */
    private static void updatePassword(Scanner sc, Account acc) {
        System.out.println("----------------修改密码-----------------");
        while (true) {
            System.out.println("请输入密码");
            String password =sc.next();
            if (acc.getPassword().equals(password)){
                //密码正确
                while (true) {
                    System.out.println("请你输入新密码");
                    String newPassword = sc.next();
                    System.out.println("请你确认新密码");
                    String okPassword = sc.next();
                    if (newPassword.equals(okPassword)) {
                        System.out.println("密码修改成功");
                        acc.setPassword(okPassword);
                        return;
                    } else {
                        System.out.println("两次密码不一致");
                    }
                }
            }else{
                System.out.println("密码错wu");
            }
        }
    }

    /**
     * 转账
     * @param acc 自己的账户对象
     * @param sc 扫描器
     * @param accounts 全部的账户对象
     */
    private static void transferMoney(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("----------------用户转账页面-----------------");
        //1.判断余额否为0
        if (acc.getMoney()==0){
            System.out.println("当前摩拉为0,无法转账");
            return;
        }

        while (true) {
            //2.开始转账
            System.out.println("请输入转入账户的卡号");
            String cardId=sc.next();
            //转入账户的卡号 不能是 自己的卡号
            if (acc.getId().equals(cardId)){
                System.out.println("无法给自己转账");
                continue;
            }
            //判断卡号是否存在
            Account account=getAccountId(cardId,accounts);
            if (account == null){
                System.out.println("你输入的对方账户不存在");
            }else{
                while (true) {
                    //转账金额
                    System.out.println("请输入转账金额");
                    double money=sc.nextDouble();
                    if (money>acc.getMoney()){
                        System.out.println("余额不足");
                    }else{
                        if (money>acc.getQuotamoney()){
                            System.out.println("单次转账金额超过限制:"+acc.getQuotamoney());
                        }else{
                            acc.setMoney( acc.getMoney()-money);
                            account.setMoney(account.getMoney()+money);
                            System.out.println("转账成功");
                            return;
                        }
                    }
                }
            }
        }
    }

    /**
     * 取款
     * @param acc 自己的账户对象
     * @param sc 扫描器
     */
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("----------------用户取款页面-----------------");
        //1.ATM只能 吐100 整
        if (acc.getMoney()<100){
            System.out.println("当前账户余额小于100摩拉无法取出,请先存点摩拉吧");
        }
        while (true){
            //2.输入取出的摩拉
            System.out.println("请输入取出的摩拉");
            double money=sc.nextDouble();

            //3.判断金额是否 合理
            if (money %100 !=0){
                System.out.println("请输入整白数字");
            }else {
                if (money>acc.getQuotamoney()){
                    System.out.println("对不起,你当前取出的摩拉超过单次上限:"+acc.getQuotamoney());
                }else {
                    //未超过单次上限
                    //4.判断是否超过总余额
                    if (money > acc.getMoney()){
                        System.out.println("摩拉不足,请重新输入取出的摩拉");
                    }else{
                        System.out.println("取款成功:"+money);
                        //更新余额
                        acc.setMoney(acc.getMoney()-money);
                        return;
                    }
                }
            }
        }

    }

    /**
     * 存款
     * @param acc 自己的账户对象
     * @param sc 扫描器
     */
    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("----------------用户存款中-----------------");
        System.out.println("请你输入存款的摩拉");
        double money=sc.nextDouble();

        //更新账户余额
        acc.setMoney(acc.getMoney()+money);
        System.out.println("存款成功,本次操作存入:"+money+"摩拉");
        showAccount(acc);
    }

    /**
     * 展示账户信息
     * @param acc 自己的账户对象
     */
    private static void showAccount(Account acc) {
        System.out.println("----------------当前账户信息如下-----------------");
        System.out.println("卡号:"+acc.getId());
        System.out.println("户主:"+acc.getName());
        System.out.println("余额:"+acc.getMoney());
        System.out.println("单次限额:"+acc.getQuotamoney());
    }


    /**
     * 用户开户功能,accounts: 账户的集合
     * @param accounts 全部的账户对象
     * @param sc 扫描器
     */
    private static void register(ArrayList<Account> accounts,Scanner sc) {
        System.out.println("----------------北国银行开户功能-----------------");
        //1创建一个账户对象 装录入的账户信息
        Account account=new Account();
        //2.录入账户信息,注入到账户对象中
        System.out.println("请你输入账户名");
        String name=sc.next();
        account.setName(name);

        while (true) {
            System.out.println("请你输入密码");
            String password=sc.next();

            System.out.println("请你再次确认密码");
            String okPassword=sc.next();
            if (password.equals(okPassword)){
                account.setPassword(okPassword);
                //进行限额判断
                while (true) {
                    System.out.println("请你输入单次限额");
                    double quotaMoney = sc.nextDouble();
                    if (quotaMoney % 100 == 0) {
                        account.setQuotamoney(quotaMoney);
                        break;
                    } else {
                        System.out.println("请输入 整百数字");
                    }
                }
                break;
            }else{
                System.out.println("两次密码不一致请重新输入");
            }
        }


        //为账号随机生成 8位不重复的号码(独立方法)
        String id=getRandomId(accounts);
        account.setId(id);

        //3.将对象添加到账户集合中
        accounts.add(account);
        System.out.println("恭喜你"+name+"在北国银行开户成功,你的卡号为:"+id);
    }

    /**
     * 随机生成 8位号码
     * @param accounts 全部的账户对象
     * @return 生成的id
     */
    private static String getRandomId(ArrayList<Account> accounts) {
        //生成 8位号码
        String id="";
        Random r=new Random();
        while (true) {
            for (int i = 0; i < 8; i++) {
                id+=r.nextInt(10);
            }
            //判断 是否有重复(独立方法)
            Account acc=getAccountId(id,accounts);
            if(acc ==null){
                return id;
            }
            return null;
        }
    }

    /**
     * 根据卡号查询账户并 返回查询到的账户对象
     * @param id 账户id
     * @param accounts 全部的账户对象
     * @return 根据id查询到的 账户对象
     */
    private static Account getAccountId(String id,ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc=accounts.get(i);
            if (acc.getId().equals(id)){
                return acc;
            }
        }
        return null;
    }




}
