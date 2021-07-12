package com.hp.Service;

import com.hp.test.Customer;
import com.hp.test.CustomerData;
import com.hp.util.TextUtil;
import com.sun.istack.internal.NotNull;

import java.util.List;
import java.util.Scanner;

//此类是 完成 客户的 所有业务（增删改查）
public class CustomerService {
    //CustomerData customerData = CustomerData.getInstance();
    //List<Customer> customerList = customerData.getCustomerList();
    private List<Customer> customerList;
    private Customer currentCustomer;
    //1.查，登录 判断账号密码是否正确
    public void checkPwd(String cardid,String cardPwd){
        CustomerData customerData = CustomerData.getInstance();
        customerList = customerData.getCustomerList();
        //1.拿到 cardid中的账户名 和 cardPwd 对 list中的数据做对比
        System.out.println("cardid = " + cardid);
        System.out.println("cardPwd = " + cardPwd);

        for (Customer customer : customerList) {
            if (customer.getAccount().equals(cardid) && customer.getPassword().equals(cardPwd)){
                //拿出来这个人
                currentCustomer = customer;
                //账户正确
                System.out.println("欢迎"+customer.getCname()+"客户的账户密码正确");
                TextUtil.oneLeveOption();//界面
                Scanner scanner = new Scanner(System.in);
                String option = scanner.nextLine();
                option(option);
                //如何 保证换了1 3 5 ... 让他再次回到此界面呢？
                

            }
        }
    }

    private void option(@NotNull String option) {
        switch (option){
            case "1":
                System.out.println("余额查询");
                    //查询余额
                    doSelectMoney();
                    //当按下1之后，回退到1及选项
                goOneHome();
                break;
            case "2":
                System.out.println("取款");
                goOneHome();
                break;
            case "3":
                System.out.println("转账");
                goOneHome();
                break;
            case "4":
                System.out.println("存款");
                goOneHome();
                break;
            case "5":
                System.out.println("退卡");
                goOneHome();
                break;
        }
    }
    //余额查询
    private void doSelectMoney() {
        double money = currentCustomer.getMoney();
        System.out.println("余额是 " + money);
    }

    private void goOneHome(){
        TextUtil.oneLeveOption();
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("option1 = " + option);
        option(option);
    }


}
