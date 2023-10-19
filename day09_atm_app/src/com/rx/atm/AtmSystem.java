package com.rx.atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AtmSystem {
    //账户集合，用于存储账户信息
    private ArrayList<Account> accounts = new ArrayList<>();
    private Account accLogin;//用于存放当前登陆的账户信息，便于直接调用

    private Scanner sc = new Scanner(System.in);
    private Random rm = new Random();

    //启动ATM系统的欢迎界面
    public void start() {
        while (true) {
            System.out.println("------欢迎您进入ATM系统------");
            System.out.println("1、用户登陆");
            System.out.println("2、用户开户");
            System.out.println("3、退出系统");
            System.out.println("请选择您的操作：");
            int command = sc.nextInt();
            if (command == 3) break;
            switch (command) {
                case 1:
                    login();
                    break;
                case 2:
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作!");
            }
        }
    }

    //用户登陆操作
    private void login() {
        System.out.println("------系统登陆操作------");
        if (accounts.size() == 0) {
            System.out.println("当前系统不存在用户，请开户！");
            return;
        }
        while (true) {
            System.out.println("请您输入您的卡号：");
            String cardId = sc.next();
            for (int i = 0; i < accounts.size(); i++) {
                Account acc = accounts.get(i);
                if (cardId.equals(acc.getCardId())) {
                    while (true) {
                        System.out.println("请您输入您的密码：");
                        String passWord = sc.next();
                        if (passWord.equals(acc.getPassWord())) {
                            System.out.println("用户" + acc.getUserName() + "登陆成功！");
                            accLogin = acc;
                            //展示登录后的操作界面
                            showUserCommand();
                            return;//卡号密码成功匹配，结束内层死循环,并跳出方法
                        } else {
                            System.out.println("密码错误，请重新输入！");
                        }
                    }
                }
            }
            System.out.println("卡号不存在，请重新输入！");
        }

    }


    //用户开户操作
    private void createAccount() {
        System.out.println("------系统开户操作------");
        //创建一个账户对象，用于封装用户的开户信息
        Account acc = new Account();

        //需要用户输入自己的开户信息，赋值给账户对象
        System.out.println("请输入您的用户名称：");
        String name = sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请输入您的性别：");
            char sex = sc.next().charAt(0);
            if (sex == '男' || sex == '女') {
                acc.setSex(sex);
                break;
            } else {
                System.out.println("您输入的性别有误，请重新输入：");
            }
        }

        while (true) {
            System.out.println("请输入您的账户密码：");
            String passWord = sc.next();
            System.out.println("请确认您的账户密码：");
            String passWordOk = sc.next();
            if (passWordOk.equals(passWord)) {
                acc.setPassWord(passWord);
                break;
            } else {
                System.out.println("您输入的密码不一致，请重新输入：");
            }
        }

        System.out.println("请您设定您的取现额度：");
        double limit = sc.nextInt();
        acc.setLimit(limit);

        //为账户随机生成一个8位数字卡号
        acc.setCardId(createCardId());

        //把这个账户对象，存入到账户集合中去
        accounts.add(acc);
        System.out.println("恭喜您，" + acc.getUserName() + "，开户成功！");
        System.out.println("您的卡号是：" + acc.getCardId());
    }

    //为账户随机生成一个8位数字卡号，不能与其他账户卡号重复
    private String createCardId() {
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId = cardId + rm.nextInt(10);
            }
            //判断卡号是否重复：使用此卡号去查询账户，是否可以查到
            if (getAccountByCardId(cardId) == null) {
                return cardId;
            }
        }
    }

    //根据卡号查找账户（是否存在此卡号）
    private Account getAccountByCardId(String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            //依次从集合中获取账户对象，用acc临时存储
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }

    //展示登录后的操作界面
    private void showUserCommand() {
        while (true) {
            System.out.println("------ATM账户处理系统------");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、密码修改");
            System.out.println("6、退出账户");
            System.out.println("7、注销账户");
            System.out.println(accLogin.getUserName() + "您可以选择如下功能进行账户处理:");
            int command = sc.nextInt();
            if (command == 6) break;
            switch (command) {
                case 1:
                    showLoginAccount();
                    break;
                case 2:
                    addMoney();
                    break;
                case 3:
                    getMoney();
                    break;
                case 4:
                    transMoney();
                    break;
                case 5:
                    ediPassWord();
                    break;
                case 6:
                    return;//直接跳出死循环，跳出方法
                case 7:
                    endAccount();
                    return;
                default:
                    System.out.println("当前操作不存在，请重新输入：");
            }
        }
    }

    //展示当前登录的账户信息
    private void showLoginAccount() {
        System.out.println("------当前您的账户信息如下------");
        System.out.println("卡号：" + accLogin.getCardId());
        System.out.println("户主：" + accLogin.getUserName());
        System.out.println("性别：" + accLogin.getSex());
        System.out.println("余额：" + accLogin.getMoney());
        System.out.println("额度：" + accLogin.getLimit());
    }

    //存款
    private void addMoney() {
        System.out.println("------存款------");
        System.out.println("您的当前余额为：" + accLogin.getMoney());
        System.out.println("请输入您本次的存款额：");
        double money = sc.nextDouble();
        accLogin.setMoney(accLogin.getMoney() + money);
        System.out.println("存款成功！您的当前余额为：" + accLogin.getMoney());
    }

    //取款
    private void getMoney() {
        System.out.println("------取款------");
        System.out.println("您的当前余额为：" + accLogin.getMoney());
        System.out.println("每次取款额度最高为：" + accLogin.getLimit());
        while (true) {
            System.out.println("请输入您本次的取款额：");
            double money = sc.nextDouble();
            if (money > accLogin.getLimit()) {
                System.out.println("一次取款额度超过规定值，无法取款！");
                continue;
            } else if (money > accLogin.getMoney()) {
                System.out.println("余额不足，无法取款！");
                continue;
            }
            accLogin.setMoney(accLogin.getMoney() - money);
            System.out.println("取款" + money + "成功！您当前余额为：" + accLogin.getMoney());
            break;
        }
    }

    //转账
    private void transMoney() {
        System.out.println("------转账------");
        System.out.println("您的当前余额为：" + accLogin.getMoney());
        String cardId = "";
        double money;
        while (true) {
            System.out.println("请输入转账对象的卡号：");
            cardId = sc.next();
            if (getAccountByCardId(cardId) == null) {
                Account ac1 = getAccountByCardId(cardId);
                System.out.println("卡号不存在！请重新输入！");
                continue;
            }
            System.out.println("请确认转账对象的卡号：");
            String cardId1 = sc.next();
            if (!cardId.equals(cardId1)) {
                System.out.println("输入卡号不一致，请重新输入！");
                continue;
            } else break;
        }
        //付款
        System.out.println("即将开始转账！您的转账对象卡号为：" + cardId);
        System.out.println("您的当前余额为：" + accLogin.getMoney());
        System.out.println("每次转账额度最高为：" + accLogin.getLimit());
        while (true) {
            System.out.println("请输入您的转账金额：");
            money = sc.nextDouble();
            if (money > accLogin.getLimit()) {
                System.out.println("一次转账额度超过规定值，无法转账！");
                continue;
            } else if (money > accLogin.getMoney()) {
                System.out.println("余额不足，无法转账！");
                continue;
            }
            accLogin.setMoney(accLogin.getMoney() - money);
            System.out.println("转账" + money + "成功！您当前余额为：" + accLogin.getMoney());
            break;
        }
        //收款
        Account ac1 = getAccountByCardId(cardId);
        ac1.setMoney(ac1.getMoney() + money);
    }


    //密码修改
    private void ediPassWord() {
        System.out.println("------密码修改------");
        String passWord = "";
        while (true) {
            System.out.println("请输入初始密码：");
            passWord = sc.next();
            if (!passWord.equals(accLogin.getPassWord())) {
                System.out.println("密码错误！请重新输入！");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println("请输入修改后密码：");
            passWord = sc.next();
            System.out.println("请输入确认修改密码：");
            String passWord1 = sc.next();
            if (!passWord.equals(passWord1)) {
                System.out.println("两次输入密码不一致！请重新输入！");
                continue;
            }
            break;
        }
        accLogin.setPassWord(passWord);
        System.out.println("修改密码成功！");
    }

    //注销账户
    private void endAccount() {
        System.out.println("------注销账户------");
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i) == accLogin) {
                System.out.println("您是否确定注销账户？按1确认，其他键取消。");
                int flag = sc.nextInt();
                if (flag == 1) {
                    accounts.remove(i);
                }
            }
        }
    }


}
