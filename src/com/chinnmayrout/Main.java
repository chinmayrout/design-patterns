package com.chinnmayrout;

public class Main {
    public static void main(String[] args){
        // Encapsulation
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        // Abstraction
        var mailService = new MailService();
        mailService.sendEmail();


    }

}