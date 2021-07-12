package com.hp.controller;
//自动导包
import com.hp.Service.CustomerService;
import com.hp.util.TextUtil;

import java.util.Scanner;
/**
 *  atm 取款机入口
 */
public class AtmMain {

    private static String cardid;
    private static String cardPwd;
    private static CustomerService customerService;

    public static void main(String[] args) {
        customerService = new CustomerService();
        //测试客户类的数据  //作业1：对manager管理类做出单例模式，并测试，并测试是否数据化
        //CustomerData customerData = CustomerData.getInstance();
        //List<Customer> customerList = customerData.getCustomerList();
        //是一个阶段
        TextUtil.welcome();


        int i=0;
        while (i<6){
            //输入账户密码 一个阶段           练习：如果超过5次就终结程序
            doWriterPassword();
            //其他操作--1)校验角色，2）判断账户密码的正确性
            doCheckPassword(cardid,cardPwd);
            i++;
        }
    }

    private static void doCheckPassword(String cardid,String cardPwd) {
        //1.先校验角色，判断cardID的长度
        if (cardid.length()==8) {//客户
            //校验密码
            customerService.checkPwd(cardid,cardPwd);
        }
    }


    //输入账号密码
    private static void doWriterPassword() {
        System.out.println("请输入卡号");
        Scanner scanner = new Scanner(System.in);
        cardid = scanner.nextLine();
        System.out.println("cardid = " + cardid);
        System.out.println("请输入密码");
        cardPwd = scanner.nextLine();
        System.out.println("cardPwd = " + cardPwd);
    }


}
